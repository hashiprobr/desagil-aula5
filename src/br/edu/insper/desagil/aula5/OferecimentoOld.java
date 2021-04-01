package br.edu.insper.desagil.aula5;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class OferecimentoOld {
	private Disciplina disciplina;
	private Map<Date, String> plano;
	private List<Aluno> alunos;

	public OferecimentoOld(Disciplina disciplina, Map<Date, String> plano, List<Aluno> alunos) {
		this.disciplina = disciplina;
		this.plano = plano;
		this.alunos = alunos;
	}

	public Disciplina getDisciplina() {
		return this.disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Map<Date, String> getPlano() {
		return this.plano;
	}
	public void setPlano(Map<Date, String> plano) {
		this.plano = plano;
	}

	public List<Aluno> getAlunos() {
		return this.alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
}
