package br.com.inemaSales.service;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.inemaSales.client.IServiceFacade;
import br.com.inemaSales.dao.UsuarioDAO;
import br.com.inemaSales.model.Usuario;

/**
 * Session Bean implementation class ServiceFacade
 */
@Stateless
public class ServiceFacade implements IServiceFacade, Serializable {
	
	private static final long serialVersionUID = 3153579506332594454L;
	
	@Inject
	private UsuarioDAO usuarioDAO;
	
//	@Inject
//	private ClienteDAO clienteDAO;

	@Override
	public Usuario validarLogin(String cpf, String senha) {
		return usuarioDAO.validarLogin(cpf, senha);
	}


}
