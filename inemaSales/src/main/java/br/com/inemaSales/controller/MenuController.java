package br.com.inemaSales.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.inemaSales.client.IServiceFacade;

@Named 
@RequestScoped
public class MenuController implements Serializable {
	private static final long serialVersionUID = 8376754431684790302L;

	@EJB
	private IServiceFacade service;
	
	@PostConstruct
	public void intit(){
		venda = true;
	}
	
	public void iniciar(){
		cliente = true;
	}
	
	
	private boolean cliente;
	private boolean produto;
	private boolean usuario;
	private boolean venda;
	
	
	
	public boolean isCliente() {
		return cliente;
	}
	public void setCliente(boolean cliente) {
		this.cliente = cliente;
	}
	public boolean isProduto() {
		return produto;
	}
	public void setProduto(boolean produto) {
		this.produto = produto;
	}
	public boolean isUsuario() {
		return usuario;
	}
	public void setUsuario(boolean usuario) {
		this.usuario = usuario;
	}
	public boolean isVenda() {
		return venda;
	}
	public void setVenda(boolean venda) {
		this.venda = venda;
	}
}