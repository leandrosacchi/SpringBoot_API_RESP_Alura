package br.com.gft.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.gft.forum.model.Topico;
import br.com.gft.forum.repository.TopicoRepository;

public class UpdateTopicoForm {
	
	@NotNull @NotEmpty @Length(min=5)
	private String titulo;
	@NotNull @NotEmpty @Length(min=10)
	private String mensagem;

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Topico atualizar(Long id, TopicoRepository tr) {
		Topico topico = tr.getOne(id);
		topico.setTitulo(this.titulo);
		topico.setMensagem(this.mensagem);
		return topico;
	}
	
	

}
