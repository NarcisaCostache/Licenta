package pachetProiect;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Document {
	@Temporal(TemporalType.DATE)
	private java.util.Date creationDate;
	
	@Id 
	public Integer idDocument;
	public String tipDocument;
	public Date dataEmitereDoc;
	public java.util.Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}
	public Integer getIdDocument() {
		return idDocument;
	}
	public void setIdDocument(Integer idDocument) {
		this.idDocument = idDocument;
	}
	public String getTipDocument() {
		return tipDocument;
	}
	public void setTipDocument(String tipDocument) {
		this.tipDocument = tipDocument;
	}
	public Date getDataEmitereDoc() {
		return dataEmitereDoc;
	}
	public void setDataEmitereDoc(Date dataEmitereDoc) {
		this.dataEmitereDoc = dataEmitereDoc;
	}
	public Document(Date creationDate, Integer idDocument, String tipDocument, Date dataEmitereDoc) {
		super();
		this.creationDate = creationDate;
		this.idDocument = idDocument;
		this.tipDocument = tipDocument;
		this.dataEmitereDoc = dataEmitereDoc;
	}
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(idDocument);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Document other = (Document) obj;
		return Objects.equals(idDocument, other.idDocument);
	}
	

}
