package pachetProiect;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
 public class Comanda {

	@Id
	private Integer idComanda;
	private Date dataComanda;
	private String detaliiComanda;
	public Integer getIdComanda() {
		return idComanda;
	}
	public void setIdComanda(Integer idComanda) {
		this.idComanda = idComanda;
	}
	public Date getDataComanda() {
		return dataComanda;
	}
	public void setDataComanda(Date dataComanda) {
		this.dataComanda = dataComanda;
	}
	public String getDetaliiComanda() {
		return detaliiComanda;
	}
	public void setDetaliiComanda(String detaliiComanda) {
		this.detaliiComanda = detaliiComanda;
	}
	public Comanda(Integer idComanda, Date dataComanda, String detaliiComanda) {
		super();
		this.idComanda = idComanda;
		this.dataComanda = dataComanda;
		this.detaliiComanda = detaliiComanda;
	}
	public Comanda() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(idComanda);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comanda other = (Comanda) obj;
		return Objects.equals(idComanda, other.idComanda);
	}
	
	
}
