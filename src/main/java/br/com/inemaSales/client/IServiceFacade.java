package br.com.inemaSales.client;

import javax.ejb.Local;

import br.com.inemaSales.model.Usuario;

@Local
public interface IServiceFacade {
	
	public Usuario validarLogin(String cpf, String senha);

}
