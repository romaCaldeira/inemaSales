package br.com.inemaSales.dao;

import br.com.inemaSales.model.Usuario;

public class UsuarioDAO {

	public Usuario verificarUsuario(Long cpf, String senha) {
		if(cpf.equals(85473898572L) && senha.equals("teste")){
			return new Usuario(cpf, "Romário", senha, "A", "ADM");
		}
		return null;
	}

}
