package br.com.inemaSales.client;

import br.com.inemaSales.model.Usuario;

public interface IServiceFacade {

	public Usuario validarLogin(Long cpf, String senha);
}
