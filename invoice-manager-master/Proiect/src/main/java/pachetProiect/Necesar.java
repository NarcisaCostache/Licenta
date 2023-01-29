package pachetProiect;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Necesar {
	
@Id
	private Integer idNecesar;
	private Integer codGestiune;
	private String denumireGestiune;
	private String detaliiNecesar;
	public Integer getIdNecesar() {
		return idNecesar;
	}
	public void setIdNecesar(Integer idNecesar) {
		this.idNecesar = idNecesar;
	}
	public Integer getCodGestiune() {
		return codGestiune;
	}
	public void setCodGestiune(Integer codGestiune) {
		this.codGestiune = codGestiune;
	}
	public String getDenumireGestiune() {
		return denumireGestiune;
	}
	public void setDenumireGestiune(String denumireGestiune) {
		this.denumireGestiune = denumireGestiune;
	}
	public String getDetaliiNecesar() {
		return detaliiNecesar;
	}
	public void setDetaliiNecesar(String detaliiNecesar) {
		this.detaliiNecesar = detaliiNecesar;
	}
	public Necesar(Integer idNecesar, Integer codGestiune, String denumireGestiune, String detaliiNecesar) {
		super();
		this.idNecesar = idNecesar;
		this.codGestiune = codGestiune;
		this.denumireGestiune = denumireGestiune;
		this.detaliiNecesar = detaliiNecesar;
	}
	public Necesar() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(idNecesar);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Necesar other = (Necesar) obj;
		return Objects.equals(idNecesar, other.idNecesar);
	}
	
}
