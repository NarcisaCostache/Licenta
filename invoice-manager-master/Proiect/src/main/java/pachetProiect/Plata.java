package pachetProiect;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Plata {
@Id
	private Integer idPlata;
@Temporal(TemporalType.DATE)
private java.util.Date creationDate;
private Furnizor furnziorDestinatar;
private Double sumaPlatita;

public Double getSumaPlatita() {
	return sumaPlatita;
}
public void setSumaPlatita(Double sumaPlatita) {
	this.sumaPlatita = sumaPlatita;
}
public StarePlata getStare2() {
	return stare2;
}
public void setStare2(StarePlata stare2) {
	this.stare2 = stare2;
}
private StarePlata stare=StarePlata.Confirmata;
private StarePlata stare2=StarePlata.Neconfirmata;


	
	
	
	public Plata(Integer idPlata, Date creationDate, Furnizor furnziorDestinatar, Double sumaPlatita) {
	super();
	this.idPlata = idPlata;
	this.creationDate = creationDate;
	this.furnziorDestinatar = furnziorDestinatar;
	this.sumaPlatita = sumaPlatita;
	//this.stare = stare;
	//this.stare2 = stare2;
}
	public StarePlata getStare() {
		return stare;
	}
	public void setStare(StarePlata stare) {
		this.stare = stare;
	}
	public java.util.Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}
	public Integer getIdPlata() {
		return idPlata;
	}
	public void setIdPlata(Integer idPlata) {
		this.idPlata = idPlata;
	}
	public Date getDataEfectuarePlata() {
		return getDataEfectuarePlata();
	}
	
	public Furnizor getFurnziorDestinatar() {
		return furnziorDestinatar;
	}
	public void setFurnziorDestinatar(Furnizor i) {
		this.furnziorDestinatar = i;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(idPlata);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plata other = (Plata) obj;
		return Objects.equals(idPlata, other.idPlata);
	}
	public Plata() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setDataEfectuarePlata(Date data1) {
		// TODO Auto-generated method stub
		
	}
	public List<Furnizor> getFurnizor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//private String numeFurnizor;
	//private String companie;
	//private String adresa;
	
	
	

}
