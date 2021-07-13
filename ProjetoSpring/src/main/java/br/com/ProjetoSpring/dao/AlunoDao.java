package br.com.ProjetoSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ProjetoSpring.model.Aluno;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {

}
