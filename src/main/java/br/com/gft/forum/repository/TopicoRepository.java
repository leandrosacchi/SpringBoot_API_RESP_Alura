package br.com.gft.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gft.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

}
