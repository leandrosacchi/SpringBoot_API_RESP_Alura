package br.com.gft.forum.controller.dto;

import java.time.LocalDateTime;

import br.com.gft.forum.model.Resposta;

public class RespostaDto {
	
	private Long id;
	private String msg;
	private LocalDateTime dataCriacao;
	private String nomeAutor;

	public RespostaDto (Resposta resposta) {
		this.id = resposta.getId();
		this.msg = resposta.getMensagem();
		this.dataCriacao = resposta.getDataCriacao();
		this.nomeAutor = resposta.getAutor().getNome();				
	}

	public Long getId() {
		return id;
	}

	public String getMsg() {
		return msg;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}
	
	
	
	

}
