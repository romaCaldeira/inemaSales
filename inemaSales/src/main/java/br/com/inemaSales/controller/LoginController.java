package br.com.inemaSales.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.jboss.weld.context.ejb.Ejb;

import br.com.inemaSales.client.IServiceFacade;
import br.com.inemaSales.model.Usuario;

@Named
@SessionScoped
public class LoginController implements Serializable{
	
	@EJB
	private IServiceFacade service;
	
	private Usuario user;
	private Long cpf;
	private String senha;
	
	@PostConstruct
	public void init(){
		
		
	}
	
	public void login(){
		Usuario user = service.validarLogin(cpf, senha);
		
		if(user == null){
			FacesContext context = FacesContext.getCurrentInstance();
			FacesMessage msgFaces = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não existe", "Usuário não existe");
			context.addMessage("feedBackLogin", msgFaces);
		}
	}
}
