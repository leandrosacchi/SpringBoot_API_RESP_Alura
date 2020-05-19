package br.com.gft.forum.controller.form;

import br.com.gft.forum.model.Curso;
import br.com.gft.forum.model.Topico;
import br.com.gft.forum.repository.CursoRepository;
import br.com.gft.forum.repository.TopicoRepository;

public class TopicoForm {
	
	private String titulo;
	private String mensagem;
	private String nomeCurso;
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
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public Topico converter(CursoRepository cr) {
		Curso curso = cr.findByNome(nomeCurso);
		return new Topico(titulo, mensagem, curso);
	}
	
	

}
