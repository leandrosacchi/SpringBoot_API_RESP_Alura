package br.com.gft.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.gft.forum.model.Topico;

public class TopicoDto {
	
	private Long id;
	private String titulo;
	private String msg;
	private LocalDateTime dataCriacao;
	 
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.msg = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
	}
	
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMsg() {
		return msg;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	
	public void setId(Long id) {
		this.id = id;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public static List<TopicoDto> converter(List<Topico> topicos) {		
		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
	}
	
		
}
