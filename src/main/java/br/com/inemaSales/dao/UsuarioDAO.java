package br.com.inemaSales.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;

import br.com.inemaSales.model.Usuario;

@Stateless
public class UsuarioDAO extends GenericDAOImpl<Usuario, Long> implements Serializable {

	private static final long serialVersionUID = -331501663735677164L;
	
    
	public Usuario validarLogin(String cpf, String senha) {
		StringBuffer sql = new StringBuffer(100)
				.append("FROM Usuario u where u.cpf = '")
				.append(cpf).append("' and u.senha = '").append(senha).append("' ");
		List<Usuario> list = createQuery(sql.toString()).getResultList();
		
		return list != null  && !list.isEmpty() ?list.get(0) :null;
	}

}
