package br.com.inemaSales.model;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 9173478684052803007L;
	private Long id;
	private Long cpf;
	private String nome;
	private String senha;
	private String situacao;
	private String perfil;
	
	public Usuario(){}
	
	public Usuario(Long cpf, String nome, String senha, String situacao, String perfil){
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
		this.situacao = situacao;
		this.perfil = perfil;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
}