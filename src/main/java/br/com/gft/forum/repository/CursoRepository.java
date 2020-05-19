package br.com.gft.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gft.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{
	
	Curso findByNome(String nome);
	

}
