package br.com.inemaSales.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="venda", schema="inema")
public class Venda implements Serializable{

	private static final long serialVersionUID = 735420590321434028L;
	
	private Long id;
	private Date dataVenda;
	private Integer qtdeProduto;
	
	public Venda() {
		super();
	}

	public Venda(Long id, Date dataVenda, Integer qtdeProduto) {
		super();
		this.id = id;
		this.dataVenda = dataVenda;
		this.qtdeProduto = qtdeProduto;
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

	@Column(name = "data_venda")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	@Column(name = "qtde_produto")
	public Integer getQtdeProduto() {
		return qtdeProduto;
	}

	public void setQtdeProduto(Integer qtdeProduto) {
		this.qtdeProduto = qtdeProduto;
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
		Venda other = (Venda) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
