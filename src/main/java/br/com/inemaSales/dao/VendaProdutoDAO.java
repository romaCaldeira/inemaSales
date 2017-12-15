package br.com.inemaSales.dao;

import java.io.Serializable;

import javax.ejb.Stateless;

import br.com.inemaSales.model.VendaProduto;

@Stateless
public class VendaProdutoDAO extends GenericDAOImpl<VendaProduto, Long> implements Serializable {

	private static final long serialVersionUID = 2431825937073463331L;

}
