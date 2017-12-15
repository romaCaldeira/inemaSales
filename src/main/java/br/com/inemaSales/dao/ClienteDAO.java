package br.com.inemaSales.dao;

import java.io.Serializable;

import javax.ejb.Stateless;

import br.com.inemaSales.model.Cliente;

@Stateless
public class ClienteDAO extends GenericDAOImpl<Cliente, Long> implements Serializable {

	private static final long serialVersionUID = 345536548290230849L;

}
