package pachetProiect;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produs {
	// Atribute private
	@Id
	private Integer codProdus;
	
	private String denumireProdus;
	private String unitateDeMasura;
	private String numeGestiune;
	private Double pretUnitar;
	
	

	public Produs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produs(Integer codProdus, String denumireProdus, String unitateDeMasura, String numeGestiune,
			Double pretUnitar) {
		super();
		this.codProdus = codProdus;
		this.denumireProdus = denumireProdus;
		this.unitateDeMasura = unitateDeMasura;
		this.numeGestiune = numeGestiune;
		this.pretUnitar = pretUnitar;
	}

	public Integer getCodProdus() {
		return codProdus;
	}

	public void setCodProdus(Integer codProdus) {
		this.codProdus = codProdus;
	}

	public String getDenumireProdus() {
		return denumireProdus;
	}

	public void setDenumireProdus(String denumireProdus) {
		this.denumireProdus = denumireProdus;
	}

	public String getUnitateDeMasura() {
		return unitateDeMasura;
	}

	public void setUnitateDeMasura(String unitateDeMasura) {
		this.unitateDeMasura = unitateDeMasura;
	}

	public String getNumeGestiune() {
		return numeGestiune;
	}

	public void setNumeGestiune(String numeGestiune) {
		this.numeGestiune = numeGestiune;
	}

	public Double getPretUnitar() {
		return pretUnitar;
	}

	public void setPretUnitar(Double pretUnitar) {
		this.pretUnitar = pretUnitar;
	}

	
	
	// Operatii specifice logicii modelului afacerii	
	
	@Override
	public int hashCode() {
		return Objects.hash(codProdus);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produs other = (Produs) obj;
		return Objects.equals(codProdus, other.codProdus);
	}

	public String toString(){
		return "Produs: cod:" + this.codProdus + ", denumire:"  + this.denumireProdus;
	}

		
	
}