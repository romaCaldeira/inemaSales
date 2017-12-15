package br.com.inemaSales.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="venda_produto", schema="inema")
public class VendaProduto implements Serializable{

	private static final long serialVersionUID = 1817075112737772462L;
	
	private Long id;
	private Integer qtdeProduto;
	private Double desconto;
	private Venda venda;
	private Produto produto;
	
	public VendaProduto() {
		super();
	}
	
	public VendaProduto(Long id, Integer qtdeProduto, Double desconto,
			Venda venda, Produto produto) {
		super();
		this.id = id;
		this.qtdeProduto = qtdeProduto;
		this.desconto = desconto;
		this.venda = venda;
		this.produto = produto;
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
	
	@Column(name = "qtde_produto")
	public Integer getQtdeProduto() {
		return qtdeProduto;
	}
	
	public void setQtdeProduto(Integer qtdeProduto) {
		this.qtdeProduto = qtdeProduto;
	}
	
	@Column(name = "desconto")
	public Double getDesconto() {
		return desconto;
	}
	
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "venda_id", referencedColumnName = "id")
	public Venda getVenda() {
		return venda;
	}
	
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "produto_id", referencedColumnName = "id")
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
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
		VendaProduto other = (VendaProduto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}