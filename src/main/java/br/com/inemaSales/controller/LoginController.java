package br.com.inemaSales.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.inemaSales.client.IServiceFacade;
import br.com.inemaSales.model.Usuario;

@Named
@SessionScoped
public class LoginController implements Serializable{
	
	private static final long serialVersionUID = 1642302587009089453L;

	@Inject
	private IServiceFacade service;
	
	private Usuario user;
	private String cpf;
	private String senha;
	
	@PostConstruct
	public void init(){
		this.cpf = null;
		this.senha = null;
	}
	
	public String login(){
		user = service.validarLogin(cpf, senha);
		
		if(user == null){
			FacesContext context = FacesContext.getCurrentInstance();
			FacesMessage msgFaces = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usu�rio n�o existe", "Usu�rio n�o existe");
			context.addMessage("feedBackLogin", msgFaces);
			return null;
		}else{
			return "index";
		}
	}

//	public Usuario getUser() {
//		return user;
//	}
//	public void setUser(Usuario user) {
//		this.user = user;
//	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
