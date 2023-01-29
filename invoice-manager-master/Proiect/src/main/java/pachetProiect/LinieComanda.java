package pachetProiect;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class LinieComanda {
	@Id
	private Integer idLinieComanda;
	private Double cantitate;
	private Double pret;
	public Integer getIdLinieComanda() {
		return idLinieComanda;
	}
	public void setIdLinieComanda(Integer idLinieComanda) {
		this.idLinieComanda = idLinieComanda;
	}
	public Double getCantitate() {
		return cantitate;
	}
	public void setCantitate(Double cantitate) {
		this.cantitate = cantitate;
	}
	public Double getPret() {
		return pret;
	}
	public void setPret(Double pret) {
		this.pret = pret;
	}
	public LinieComanda(Integer idLinieComanda, Double cantitate, Double pret) {
		super();
		this.idLinieComanda = idLinieComanda;
		this.cantitate = cantitate;
		this.pret = pret;
	}
	public LinieComanda() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(idLinieComanda);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinieComanda other = (LinieComanda) obj;
		return Objects.equals(idLinieComanda, other.idLinieComanda);
	}
	

}
