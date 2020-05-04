package br.usjt.pi_splinhas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.pi_splinhas.model.Linha;

public interface LinhaRepository extends JpaRepository <Linha, Long> {
	
	List<Linha> findByLt(String lt);

}
