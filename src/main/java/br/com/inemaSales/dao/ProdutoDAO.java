package br.com.inemaSales.dao;

import java.io.Serializable;

import javax.ejb.Stateless;

import br.com.inemaSales.model.Produto;

@Stateless
public class ProdutoDAO extends GenericDAOImpl<Produto, Long> implements Serializable {

	private static final long serialVersionUID = -4191199522445190319L;

}
