package br.com.gft.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gft.forum.controller.dto.TopicoDto;
import br.com.gft.forum.model.Curso;
import br.com.gft.forum.model.Topico;

@RestController
@RequestMapping
public class TopicosController {

	@GetMapping(value = "/topicos")
	public ResponseEntity<List<TopicoDto>> lista() {
		Topico topico1 = new Topico("Dúvida", "Duvida com Spring", new Curso("Spring Boot", "Programação"));
		List<Topico> lista = Arrays.asList(topico1, topico1, topico1);
		return ResponseEntity.ok(TopicoDto.converter(lista));
		
	}
}
