package br.com.inemaSales.service;

import javax.ejb.EJB;

import br.com.inemaSales.client.IServiceFacade;
import br.com.inemaSales.model.Usuario;

public class ServiceFacade implements IServiceFacade {

	@EJB
	private LoginRN loginRN;
	
	public Usuario validarLogin(Long cpf, String senha) {
		return loginRN.validarLogin(cpf, senha);
	}
	

}
