package pachetProiect;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Localitate {
	
	@Id
	private Integer codLocalitate;
	private String numeLocalitate;
	public Integer getCodLocalitate() {
		return codLocalitate;
	}
	public void setCodLocalitate(Integer codLocalitate) {
		this.codLocalitate = codLocalitate;
	}
	public String getNumeLocalitate() {
		return numeLocalitate;
	}
	public void setNumeLocalitate(String numeLocalitate) {
		this.numeLocalitate = numeLocalitate;
	}
	public Localitate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Localitate(Integer codLocalitate, String numeLocalitate) {
		super();
		this.codLocalitate = codLocalitate;
		this.numeLocalitate = numeLocalitate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codLocalitate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Localitate other = (Localitate) obj;
		return Objects.equals(codLocalitate, other.codLocalitate);
	}

}

