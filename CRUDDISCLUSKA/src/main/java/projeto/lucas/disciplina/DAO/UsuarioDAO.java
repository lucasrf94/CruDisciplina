package projeto.lucas.disciplina.DAO;

import java.util.List;

import projeto.lucas.disciplina.entities.Usuario;
import projeto.lucas.disciplina.filters.UsuarioFilter;



public class UsuarioDAO extends DAO<Usuario> {
	
	public UsuarioDAO() {
		super(Usuario.class);
	}

	public List<Usuario> findBy(UsuarioFilter filter) {
		return null;
	}
	
}
