package pachetProiect;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Gestiune {
	
@Id
	private Integer codGestiune;
	private String DenumireGestiune;
	private String numeResponsabilGestiune;
	public Integer getCodGestiune() {
		return codGestiune;
	}
	public void setCodGestiune(Integer codGestiune) {
		this.codGestiune = codGestiune;
	}
	public String getDenumireGestiune() {
		return DenumireGestiune;
	}
	public void setDenumireGestiune(String denumireGestiune) {
		DenumireGestiune = denumireGestiune;
	}
	public String getNumeResponsabilGestiune() {
		return numeResponsabilGestiune;
	}
	public void setNumeResponsabilGestiune(String numeResponsabilGestiune) {
		this.numeResponsabilGestiune = numeResponsabilGestiune;
	}
	public Gestiune(Integer codGestiune, String denumireGestiune, String numeResponsabilGestiune) {
		super();
		this.codGestiune = codGestiune;
		DenumireGestiune = denumireGestiune;
		this.numeResponsabilGestiune = numeResponsabilGestiune;
	}
	public Gestiune() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(DenumireGestiune, codGestiune, numeResponsabilGestiune);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gestiune other = (Gestiune) obj;
		return Objects.equals(DenumireGestiune, other.DenumireGestiune)
				&& Objects.equals(codGestiune, other.codGestiune)
				&& Objects.equals(numeResponsabilGestiune, other.numeResponsabilGestiune);
	}
	
}
