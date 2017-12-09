package br.com.inemaSales.service;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.inemaSales.dao.UsuarioDAO;
import br.com.inemaSales.model.Usuario;

@Stateless
public class LoginRN implements Serializable {
	
	private static final long serialVersionUID = -7579363622340390294L;
	@Inject
	private UsuarioDAO usuarioDAO;

	public Usuario validarLogin(Long cpf, String senha) {
		Usuario user = usuarioDAO.verificarUsuario(cpf, senha);
		return user;
	}
}
