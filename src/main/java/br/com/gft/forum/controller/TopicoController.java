package br.com.gft.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.gft.forum.controller.dto.TopicoDto;
import br.com.gft.forum.repository.TopicoRepository;

@RestController
@ResponseBody
public class TopicoController {

	@Autowired
	private TopicoRepository tr;
	
	@GetMapping(value = "/topicos")
	public ResponseEntity<List<TopicoDto>> listaTopicos() {
		return ResponseEntity.ok().body(TopicoDto.converter(tr.findAll()));
	}
//	
//	@PostMapping(value = "/topicos")
//	public ResponseEntity<T> save(){
//		Topico topico1 = new Topico("Dúvida", "Duvida com Spring", new Curso("Spring Boot", "Programação"));
//		tr.saveAll(Arrays.asList(topico1, topico1, topico1));
//		URI uri = 
//		return ResponseEntity.created(uri).build();
//				
//	}
	
}
