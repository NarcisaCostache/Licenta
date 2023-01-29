package pachetProiect;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Judet {
@Id
	private Integer codJudet;
	private String numeJudet;
	private String regiune;
	public Integer getCodJudet() {
		return codJudet;
	}
	public void setCodJudet(Integer codJudet) {
		this.codJudet = codJudet;
	}
	public String getNumeJudet() {
		return numeJudet;
	}
	public void setNumeJudet(String numeJudet) {
		this.numeJudet = numeJudet;
	}
	public String getRegiune() {
		return regiune;
	}
	public void setRegiune(String regiune) {
		this.regiune = regiune;
	}
	public Judet(Integer codJudet, String numeJudet, String regiune) {
		super();
		this.codJudet = codJudet;
		this.numeJudet = numeJudet;
		this.regiune = regiune;
	}
	public Judet() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(codJudet);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Judet other = (Judet) obj;
		return Objects.equals(codJudet, other.codJudet);
	}
	
}
