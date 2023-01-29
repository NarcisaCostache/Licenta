package pachetProiect;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class LinieDocument {
@Id
	private Integer idLinieDocument;
	private Double cantitate;
	private Double pret;
	public Integer getIdLinieDocument() {
		return idLinieDocument;
	}
	public void setIdLinieDocument(Integer idLinieDocument) {
		this.idLinieDocument = idLinieDocument;
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
	public LinieDocument(Integer idLinieDocument, Double cantitate, Double pret) {
		super();
		this.idLinieDocument = idLinieDocument;
		this.cantitate = cantitate;
		this.pret = pret;
	}
	public LinieDocument() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(idLinieDocument);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinieDocument other = (LinieDocument) obj;
		return Objects.equals(idLinieDocument, other.idLinieDocument);
	}
	
}
