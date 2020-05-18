package br.com.gft.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.gft.forum.model.Curso;
import br.com.gft.forum.model.Topico;

@Controller
@RequestMapping
public class TopicosController {

	@GetMapping(value = "/topicos")
	@ResponseBody
	public List<Topico> lista() {
		Topico topico1 = new Topico("Duvida", "Duvida com Spring", new Curso("Spring Boot", "Programação"));
		
		return Arrays.asList(topico1, topico1, topico1);
		
	}
}
