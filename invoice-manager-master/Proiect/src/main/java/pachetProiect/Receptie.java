package pachetProiect;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Receptie {
	
@Id
	private Integer idReceptie;
	private Date dataReceptie;
	private String persoanaRespReceptie;
	private String detaliiReceptie;
	public Integer getIdReceptie() {
		return idReceptie;
	}
	public void setIdReceptie(Integer idReceptie) {
		this.idReceptie = idReceptie;
	}
	public Date getDataReceptie() {
		return dataReceptie;
	}
	public void setDataReceptie(Date dataReceptie) {
		this.dataReceptie = dataReceptie;
	}
	public String getPersoanaRespReceptie() {
		return persoanaRespReceptie;
	}
	public void setPersoanaRespReceptie(String persoanaRespReceptie) {
		this.persoanaRespReceptie = persoanaRespReceptie;
	}
	public String getDetaliiReceptie() {
		return detaliiReceptie;
	}
	public void setDetaliiReceptie(String detaliiReceptie) {
		this.detaliiReceptie = detaliiReceptie;
	}
	public Receptie(Integer idReceptie, Date dataReceptie, String persoanaRespReceptie, String detaliiReceptie) {
		super();
		this.idReceptie = idReceptie;
		this.dataReceptie = dataReceptie;
		this.persoanaRespReceptie = persoanaRespReceptie;
		this.detaliiReceptie = detaliiReceptie;
	}
	public Receptie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(idReceptie);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Receptie other = (Receptie) obj;
		return Objects.equals(idReceptie, other.idReceptie);
	}
	
}
