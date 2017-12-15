package br.com.inemaSales.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto", schema = "inema")
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 5686057161180384418L;
	private Long id;
	private Integer codigo;
	private String unidade;
	private String descricao;
	private Double valorUnitario;
	private Integer estoqueMinimo;
	private Integer qtdeEstoque;
	
	public Produto() {
		super();
	}

	public Produto(Long id, Integer codigo, String unidade, String descricao,
			Double valorUnitario, Integer estoqueMinimo, Integer qtdeEstoque) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.unidade = unidade;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.estoqueMinimo = estoqueMinimo;
		this.qtdeEstoque = qtdeEstoque;
	}

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "codigo")
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Column(name = "unidade", length = 20)
	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	@Column(name = "descricao", length = 500)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Column(name = "valor_unitario")
	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	@Column(name = "estoque_minimo")
	public Integer getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(Integer estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	@Column(name = "qtde_estoque")
	public Integer getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(Integer qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}