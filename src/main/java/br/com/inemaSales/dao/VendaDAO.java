package br.com.inemaSales.dao;

import java.io.Serializable;

import javax.ejb.Stateless;

import br.com.inemaSales.model.Venda;

@Stateless
public class VendaDAO extends GenericDAOImpl<Venda, Long> implements Serializable {

	private static final long serialVersionUID = 5292957296065659199L;

}
