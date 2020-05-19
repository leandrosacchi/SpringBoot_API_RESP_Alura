package br.com.gft.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gft.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{
	
	List<Topico> findByCursoNomeContaining(String nomeCurso);
	//busca curso por parte do nome. Ao concatenar Curso+Nome, o JPA entende que Nome trata-se de um atributo dentro da classe Curso
	//ao concatenar o Containing ele permite que você digite apenas parte do nome na busca.
	

}
