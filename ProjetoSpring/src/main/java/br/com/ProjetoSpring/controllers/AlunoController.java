package br.com.ProjetoSpring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ProjetoSpring.dao.AlunoDao;
import br.com.ProjetoSpring.model.Aluno;

@Controller 
public class AlunoController {
	
	@Autowired
	private AlunoDao alunorepositorio;
	
	@GetMapping("/inserirAlunos")
	public ModelAndView InsertAlunos(Aluno aluno) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Aluno/formAluno");
		mv.addObject("aluno", new Aluno());
		return mv;
	}
	
	@PostMapping("InsertAlunos")
	public ModelAndView InserirAluno(Aluno aluno) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/Aluno/ListAlunos");
		alunorepositorio.save(aluno);
		return mv;
	}

}
