package pachetProiect;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Furnizor {
	@Id
	private Integer idFurnizor;
private String numeFurnizor;
	
	private String adresa;
	private String contBancar;
	private String bancaPartenera;
	
	@Override
	public String toString() {
		return "Furnizor [idFurnizor=" + idFurnizor + ", numeFurnizor=" + numeFurnizor +  ", adresa=" + adresa + ", contBancar=" + contBancar + ", bancaPartenera=" + bancaPartenera + "]";
	}
	
	
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}



	public Integer getIdFurnizor() {
		return idFurnizor;
	}



	public void setIdFurnizor(Integer idFurnizor) {
		this.idFurnizor = idFurnizor;
	}



	public String getNumeFurnizor() {
		return numeFurnizor;
	}



	public void setNumeFurnizor(String numeFurnizor) {
		this.numeFurnizor = numeFurnizor;
	}






	public String getAdresa() {
		return adresa;
	}



	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}



	public String getContBancar() {
		return contBancar;
	}



	public void setContBancar(String contBancar) {
		this.contBancar = contBancar;
	}



	public String getBancaPartenera() {
		return bancaPartenera;
	}



	public void setBancaPartenera(String bancaPartenera) {
		this.bancaPartenera = bancaPartenera;
	}



	public Furnizor(Integer idFurnizor, String numeFurnizor,  String adresa, String contBancar,
			String bancaPartenera) {
		super();
		this.idFurnizor = idFurnizor;
		this.numeFurnizor = numeFurnizor;
		
		this.adresa = adresa;
		this.contBancar = contBancar;
		this.bancaPartenera = bancaPartenera;
	}



	public Furnizor() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public int hashCode() {
		return Objects.hash(idFurnizor);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Furnizor other = (Furnizor) obj;
		return Objects.equals(idFurnizor, other.idFurnizor);
	}

}
