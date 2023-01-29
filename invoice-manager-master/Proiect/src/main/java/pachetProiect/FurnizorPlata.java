package pachetProiect;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.AUTO;

@Entity
public class FurnizorPlata {
	@Id 
	@GeneratedValue(strategy = AUTO)
	private Integer idFurnizorP;

	public FurnizorPlata(Integer idFurnizorP, String numeFurnizorP, String adresaP, String contBancarP, String bancaParteneraP) {
		this.idFurnizorP= idFurnizorP;
		this.numeFurnizorP= numeFurnizorP;
		this.adresaP= adresaP;
		this.contBancarP=contBancarP;
		this.bancaParteneraP=bancaParteneraP;

	}
	private String numeFurnizorP;
	private String adresaP;
	private String contBancarP;
	private String bancaParteneraP;
	
	

	@OneToOne
	private Plata plata;

	public Integer getIdFurnizorP() {
		return idFurnizorP;
	}



	public void setIdFurnizorP(Integer idFurnizorP) {
		this.idFurnizorP = idFurnizorP;
	}



	public String getNumeFurnizorP() {
		return numeFurnizorP;
	}



	public void setNumeFurnizorP(String numeFurnizorP) {
		this.numeFurnizorP = numeFurnizorP;
	}



	public String getAdresaP() {
		return adresaP;
	}



	public void setAdresaP(String adresaP) {
		this.adresaP = adresaP;
	}



	public String getContBancarP() {
		return contBancarP;
	}



	public void setContBancarP(String contBancarP) {
		this.contBancarP = contBancarP;
	}



	public String getBancaParteneraP() {
		return bancaParteneraP;
	}



	public void setBancaParteneraP(String bancaParteneraP) {
		this.bancaParteneraP = bancaParteneraP;
	}



	public Plata getPlata() {
		return plata;
	}



	public void setPlata(Plata plata) {
		this.plata = plata;
	}



	@Override
	public int hashCode() {
		return Objects.hash(idFurnizorP);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FurnizorPlata other = (FurnizorPlata) obj;
		return Objects.equals(idFurnizorP, other.idFurnizorP);
	}



	public FurnizorPlata(Integer idFurnizorP, String numeFurnizorP, String adresaP, String contBancarP,
			String bancaParteneraP, Plata plata) {
		super();
		this.idFurnizorP = idFurnizorP;
		this.numeFurnizorP = numeFurnizorP;
		this.adresaP = adresaP;
		this.contBancarP = contBancarP;
		this.bancaParteneraP = bancaParteneraP;
		this.plata = plata;
	}



	public FurnizorPlata() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}