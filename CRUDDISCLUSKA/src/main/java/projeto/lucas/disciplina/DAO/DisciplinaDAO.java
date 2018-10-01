package projeto.lucas.disciplina.DAO;

import java.util.List;

import projeto.lucas.disciplina.entities.Disciplina;
import projeto.lucas.disciplina.filters.DisciplinaFilter;


public class DisciplinaDAO extends DAO<Disciplina> {
	
	public DisciplinaDAO() {
		super(Disciplina.class);
	}

	public List<Disciplina> findBy(DisciplinaFilter filter) {
		return null;
	}
	
}
