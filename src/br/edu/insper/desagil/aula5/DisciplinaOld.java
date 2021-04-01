package br.edu.insper.desagil.aula5;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class DisciplinaOld {
	private String codigo;
	private String nome;
	private List<String> ementa;
	private Map<Date, String> plano;

	public DisciplinaOld(String codigo, String nome, List<String> ementa, Map<Date, String> plano) {
		this.codigo = codigo;
		this.nome = nome;
		this.ementa = ementa;
		this.plano = plano;
	}

	public String getCodigo() {
		return this.codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getEmenta() {
		return this.ementa;
	}
	public void setEmenta(List<String> ementa) {
		this.ementa = ementa;
	}

	public Map<Date, String> getPlano() {
		return this.plano;
	}
	public void setPlano(Map<Date, String> plano) {
		this.plano = plano;
	}
}
