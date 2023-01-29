package pachetProiect;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

public class Test {

	public static void main(String[] args) throws ParseException {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Proiect");
		EntityManager  em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Furnizor f1= new Furnizor(12345, "Electricitate SRL","Iasi, Pascani, Strada Stefan cel Mare", "BCR", "BTRLRONCRT19282736374");
		Furnizor f2= new Furnizor(12346, "Apa SRL","Iasi, Strada Zimbrului", "BRD", "BTRLRONCRT12482736374");
		Furnizor f3= new Furnizor(14553, "Internet SRL","Iasi, Tg.Frumos, Strada Florilor","CEC BANK", "BTRLRONCRT19234736374");
		Furnizor f4= new Furnizor(12535, "Televiziune SRL","Iasi, Strada Lazar"," ALPHA BANK ", "BTRLRONCRT19282836374");
		Furnizor f5= new Furnizor(11227, "Gaz SRL","Neamt, Roman, Strada Vitejilor"," BANCA TRANSILVANIA", "BTRLRONCRT19282778374");
	//	Furnizor f9= new Furnizor(11228, "Gaz SRL","Neamt, Roman, Strada Vitejilor"," BANCA TRANSILVANIA", "BTRLRONCRT19282778374");

		em.persist(f1);//Adaugare baza de date
		em.persist(f2);
		em.persist(f3);
		em.persist(f4);
		em.persist(f5);
		//em.persist(f9);

		
		
		List<Furnizor> lst=em.createQuery("select f from Furnizor f").getResultList();//citire
		for(Furnizor f:lst) {
			System.out.println(f.toString());
		}
		/*
		Furnizor fur=(Furnizor) em.createQuery("select f from Furnizor f where f.idFurnizor=12345").getSingleResult();//un singur rezultate
		fur.setNumeFurnizor("Etta SRL");//modificare
		em.merge(fur);//modificare
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");      
	    Date data1 = formatter.parse("26-09-2021"); 
	    Date data2 = formatter.parse("25-02-2022");
	    Date data3 = formatter.parse("28-02-2022");
	    Date data4 = formatter.parse("29-02-2022");
	    Date data5 = formatter.parse("21-02-2022");
	    Date data6 = formatter.parse("24-02-2022");

	    
//		Factura fa1= new Factura(1, data1,data2,f1,la1);

			Plata p0= new Plata(12356, data1, f1, 1800.0);
		/*	Plata p2= new Plata(12357, data2, f4);
			Plata p3= new Plata(12358, data1, f2);
			Plata p4= new Plata(12359, data1, f1);
			Plata p5= new Plata(123510, data1, f3);
			Plata p6= new Plata(123511, data1, f5);*/
			
			//em.persist(p0);
			/*em.persist(p2);
			em.persist(p3);
			em.persist(p4);
			em.persist(p5);
			em.persist(p6);*/
			
		/*	List<Plata> lstPla=em.createQuery("select pla from Plati pla").getResultList();//citire
			for(Plata pla:lstPla) {
				System.out.println(pla.toString());
			}
		
	/*		
		
		List<FurnizorPlata> fp1=new ArrayList<FurnizorPlata>();
		fp11.add(f1);
		fp.add();
		List<ArticolFactura> la2=new ArrayList<ArticolFactura>();
		la2.add(a2);la2.add(a10);
		List<ArticolFactura> la3=new ArrayList<ArticolFactura>();
		la3.add(a3);la3.add(a11);
		List<ArticolFactura> la4=new ArrayList<ArticolFactura>();
		la4.add(a4);
		List<ArticolFactura> la5=new ArrayList<ArticolFactura>();
		la5.add(a6);
		
	    
	    
		
		Date data5 = formatter.parse("02-12-2021"); 
	    Date data6 = formatter.parse("02-02-2022");
	//    Factura fa2= new Factura(2, data5,data6,f2,la2);
	    
	    Date data7 = formatter.parse("30-12-2021"); 
	    Date data8 = formatter.parse("30-01-2022");
//	    Factura fa3= new Factura(3, data7,data8,f3,la3);
	    
	    Date data9 = formatter.parse("13-11-2021"); 
	    Date data10 = formatter.parse("02-01-2022");
//	    Factura fa4= new Factura(4, data9,data10,f4,la4);
	    
	    Date data11 = formatter.parse("12-12-2021"); 
	    Date data12 = formatter.parse("12-03-2022");
//	    Factura fa5= new Factura(5, data11,data12,f5,la5);
	//    a1.setFactura(fa1);a5.setFactura(fa1);
	//    a2.setFactura(fa2);a10.setFactura(fa2);
	//    a3.setFactura(fa3);a11.setFactura(fa3);
	//    a4.setFactura(fa4);
	//    a6.setFactura(fa5);
	    */
	   
	em.getTransaction().commit();

}

	/*private static Date Temporal(TemporalType date) {
		// TODO Auto-generated method stub
		return null;
	}*/
	}
