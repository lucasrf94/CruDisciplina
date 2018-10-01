package projeto.lucas.disciplina.entities;

import java.util.ArrayList;
import java.util.List;


public class Disciplina implements Identificavel{
	private String nome;
	private Long id;
	private String descricao;
	private Usuario professor;
	public Disciplina() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Usuario getProfessor() {
		return professor;
	}
	public void setProfessor(Usuario professor) {
		this.professor = professor;
	}
}