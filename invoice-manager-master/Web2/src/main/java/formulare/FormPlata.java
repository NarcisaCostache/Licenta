package formulare;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.postgresql.jdbc.AbstractBlobClob;

import pachetProiect.*;

@ManagedBean
@ApplicationScoped

public class FormPlata {
	
	private EntityManager em;
	private Plata plata;
	//private java.util.Date creationDate;
	private StarePlata stare;  
	private Furnizor furnizor;
	private List<Furnizor> furnizori = new ArrayList<Furnizor>();
	private List<Plata> plati = new ArrayList<Plata>();
	private StarePlata[] stari;
	private DataModel<FurnizorPlata> furnizorPlata;
	
	
	
	public DataModel<FurnizorPlata> getFurnizorPlata() {
		return furnizorPlata;
	}


	

//	public void setFurnizorPlata(FurnizorPlata furnizorPlata) {
//		this.furnizorPlata = furnizorPlata;
//	}



	public void setFurnizorPlata(DataModel<FurnizorPlata> furnizorPlata) {
		this.furnizorPlata = furnizorPlata;
	}




	public StarePlata getStare() {
		return stare;
	}



	public FormPlata() throws ParseException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Proiect");
		em = emf.createEntityManager();
		initModelPlati();
		initModelFurnizori();
		setStari();
	}
	
	

	public StarePlata getStarePlata() {
		return this.plata.getStare();
	}

	public void setStare(StarePlata stare) {
		this.plata.setStare(stare);
	}

	public StarePlata[] getStari() {
		return this.stari;
	}

	public void setStari() {
		this.stari = StarePlata.values();
	}

	
	
///////////////////////////////GETTERI SI SETTERI///////////
	public Plata getPlata() {
		return plata;
	}
	

	public void setPlata(Plata plata) {
		this.plata = plata;
	}
	


//	public Furnizor getFurnizor() {
//		return furnizor;
//	}

//	public void setFurnizor(Furnizor furnizor) {
//		this.furnizor = furnizor;
//	}
	
	public List<Furnizor> getFurnizori() {
		return furnizori;
	}

	public void setFurnizori(List<Furnizor> furnizori) {
		this.furnizori = furnizori;
	}
	public Furnizor getFurnizor() {
		return this.plata.getFurnziorDestinatar();
	}
	public void setFurnizor(Furnizor furnizor) {
		this.plata.setFurnziorDestinatar(furnizor);
	}
	
////////////////////////////////////////////////////////////////////////////////////
	public Integer getIdFurnizor() {
		return this.plata.getFurnziorDestinatar().getIdFurnizor();
	}
//////////////////////////////////////////////////////////////////////////////////////
	

/////////////////////////////////////////////////////	
/*	public DataModel<FurnizorPlata> getFurnizorPlataDataModel() {
		furnizorPlataDataModel = new ListDataModel<FurnizorPlata>(this.plata.getFurnziorDestinatar());
		return furnizorPlataDataModel;
	}*/
//////////////////////////////////////////////////////////////
	
	public void setStari(StarePlata[] stari) {
		this.stari = stari;
	}

	public List<Plata> getPlati() {
		return plati;
	}

	public void setPlati(List<Plata> plati) {
		this.plati = plati;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////

	private void initModelFurnizori() {
		this.furnizori = em.createQuery("SELECT o FROM Furnizor o", Furnizor.class).getResultList();
		if (this.furnizori != null && !this.furnizori.isEmpty())
			Collections.sort(this.furnizori, (p1, p2) -> p1.getIdFurnizor().compareTo(p2.getIdFurnizor()));
	}
	
	private void initModelPlati() throws ParseException {
		this.plati = em.createQuery("select p from Plata p").getResultList();
		if (this.plati != null && !this.plati.isEmpty()) {
			Collections.sort(this.plati, (p1, p2) -> p1.getIdPlata().compareTo(p2.getIdPlata()));
			if (!this.plati.contains(this.plata))
				this.plata = this.plati.get(0);
		}
		if (this.plata == null)
			adaugarePlata(null);  //?????????????????????//

	}


	
///////////////////////OK///////////////////////////////////////////////
	/*public void prevPlata(ActionEvent evt) {
		Integer idCurent = this.plati.indexOf(plata);
		if (idCurent > 0)
			this.plata = this.plati.get(idCurent - 1);
		else
			this.plata = this.plati.get(0);
	}*/

	public void nextFactura(ActionEvent evt) {
		Integer idCurent = this.plati.indexOf(plata);
		if (idCurent < this.plati.size() - 1)
			this.plata = this.plati.get(idCurent + 1);
		else
			this.plata = this.plati.get(this.plati.size() - 1);
	}
	
/////////////////////////oK/////////////////////////ADAUGARE PLATA
	public void adaugarePlata(ActionEvent evt) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date data1 = formatter.parse("01-01-2000");
			this.plata = new Plata();
		this.plata.setIdPlata(999);
		;
		this.plata.setCreationDate(data1);
		
		this.plati.add(this.plata);
	}
////////////////////STERGERE PLATA
	public void stergerePlata(ActionEvent evt) {
		this.plati.remove(this.plata);
		if (this.em.contains(this.plata)) {
			this.em.getTransaction().begin();
			this.em.remove(this.plata);
			this.em.getTransaction().commit();
		}

		if (!this.plati.isEmpty())
			this.plata = this.plati.get(0);
		else
			this.plata = null;
	}

//////////////SALVARE PLATA
	public void salvarePlata(ActionEvent evt) {
		System.out.println("Salvare");
		if (this.em.contains(this.plata)) {
			this.em.getTransaction().begin();
			this.em.merge(this.plata);
			this.em.getTransaction().commit();
		} else {
			this.em.getTransaction().begin();
			this.em.persist(this.plata);
			this.em.getTransaction().commit();
		}
	}
////////////ABANDON PLATA
	public void abandonPlata(ActionEvent evt) throws ParseException {
		System.out.println("Abandon plata !");
		em.clear();
		initModelPlati();
	}

	
/////////////////////NEXT & PREV PLATA
	
	private void prevPlata(ActionEvent evt) {
		Integer idCurent=this.plati.indexOf(plata);
		if(idCurent >0)
			this.plata=this.plati.get(idCurent -1);
		else
			this.plata=this.plati.get(0);
	}
	
private void nextPlata(ActionEvent evt) {
	Integer idCurent=this.plati.indexOf(plata);
	if(idCurent<this.plati.size()-1)
	this.plata=this.plati.get(idCurent +1);
	else
		this.plata=this.plati.get(this.plati.size()-1);
	
}
//////////////////////////////////////////////////////////

	
	

	public void setIdPlata(Integer id, Date Data, Furnizor furnizorDestinatar) {
		Integer idx = this.plati.indexOf(new Plata(id, Data, furnizorDestinatar, 178.0));
		this.plata = this.plati.get(idx);
	}
	public void setIdFurnizor(Integer id) {
		Integer idy= this.furnizori.indexOf(id);
		//Integer idx = this.furnizori.indexOf(new Furnizor(id));
		Furnizor furnizor = this.furnizori.get(idy);
		this.plata.setFurnziorDestinatar(furnizor);
	}
	
	/*public void setIdPlata(Integer id) {
		Integer idx = this.plati.indexOf(new Plata(id));
		this.plata = this.plati.get(idx);
	}*/
	
	public Integer getIdPlata() {
		return this.plata.getIdPlata();
		}

	

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	

	
///////////////////////STERGERE FURNIZOR ////////////////////////////////////////////////////////
	/*public void stergeFurnizor(ActionEvent evt) {
		FurnizorPlata furnizorModel = this.furnizorPlataDataModel.getRowData();
		this.plata.getFurnziorDestinatar().remove(furnizorModel);
	}*/
//////////////////////////////////////////////////////////////////////////////////////////
	
////////////////////////Inregistrare furnizor nou////////////////////////////
	/*public void adaugaFurnizor(ActionEvent evt) {
		Furnizor furnizorNou= new Furnizor(idFurnizor, numeFurnizor, adresa, contBancar, bancaPartenera)
		//ArticolFactura articolNou = new ArticolFactura(null, this.produse.get(0), 0.0);
		this.plata.getFurnizor().add(furnizorNou);
		furnizorNou.setPlata(this.plata);
		
	}*/
////////////////////////////////////////////////////////////////////////////////////////////////////

}
