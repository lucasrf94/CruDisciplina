package projeto.lucas.disciplina.entities;

import java.awt.List;
import java.util.Set;

public class Usuario implements Identificavel {
	private String nome;
	private Set<Disciplina> disciplinas;
	private Long id;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Set<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}