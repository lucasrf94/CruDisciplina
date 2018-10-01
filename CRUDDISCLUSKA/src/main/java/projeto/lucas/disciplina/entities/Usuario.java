package projeto.lucas.disciplina.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Usuario implements Identificavel {
	private String nome;
	private Set<Disciplina> disciplinas;
	@Id
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