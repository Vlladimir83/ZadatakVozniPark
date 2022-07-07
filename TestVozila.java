package ZadatakVozniPark;

import java.util.ArrayList;
import java.util.Scanner;

public class TestVozila {

	public static void main(String[] args) {
		
		
		Vozilo vozilo = new Vozilo();  

		ArrayList<Vozilo> vozila = new ArrayList();

	
		System.out.println("----------PRAG----------");
		
		Scanner test = new Scanner(System.in);
		System.out.println("Unesite adresu voznog parka: ");
		String adresa = test.nextLine();
		System.out.println("Unesite vozni park koji zelite p - privatni ili f - poslovni");
		String vozniPark = test.nextLine();
		if(vozniPark.equals("p")) {
			System.out.println("privatni");
			PrivatniVP privatni = new PrivatniVP(adresa, vozilo);
			
			System.out.println("Unesite tip vozila (p - putnicko, m - motocikl)");
			String obj = test.nextLine();
			
			if(obj.equals("p")) {
				
				vozilo.setTipVozila("putnicko");
			
				System.out.println("Unesite zapreminu motora: ");
				double zapreminaM = test.nextDouble();
				vozilo.setZapreminaM(zapreminaM);
				System.out.println("Unesite godinu proizvodnje: ");
				int godina = test.nextInt();
				vozilo.setGodina(godina);
				System.out.println("Porez koji treba da platite je: " + privatni.porez(2022));
				System.out.println(vozilo.toString());

			}
			else if(obj.equals("m")) {
				

				vozilo.setTipVozila("motocikl");
				System.out.println("Unesite zapreminu motora: ");
				double zapreminaM = test.nextDouble();
				vozilo.setZapreminaM(zapreminaM);
				System.out.println("Unesite godinu proizvodnje: ");
				int godina =test.nextInt(); 
				vozilo.setGodina(godina);
				
				System.out.println("Porez koji treba da platite je: " + privatni.porez(2022));
				
				
				System.out.println(vozilo.toString());
				
			}
			
		}else {
			
			System.out.println("poslovni");
			
			System.out.println("Unesite broj vozila u voznom parku: ");
			int brojVozila = test.nextInt();
			
			for(int i =1;i <=brojVozila;i++) {
				System.out.println("Unesite tip vozila (p - putnicko, m - motocikl)");
				Scanner skener = new Scanner(System.in);
				String obj = skener.nextLine();
				
				if(obj.equals("p")) {
				
					System.out.println("Unesite zapreminu motora vozila " +i);
					double zapreminaM = test.nextDouble();
					
					System.out.println("Unesite godinu proizvodnje vozila " +i);
					int godina = test.nextInt();
					
					Vozilo v = new Vozilo(obj,zapreminaM,godina);
					vozila.add(v);
					
				}
				else if(obj.equals("m")) {
					
					System.out.println("Unesite zapreminu motora vozila " +i);
					double zapreminaM = test.nextDouble();
					
					
					System.out.println("Unesite godinu proizvodnje vozila " +i);
					int godina =test.nextInt(); 
					
					Vozilo v = new Vozilo(obj,zapreminaM,godina);
					vozila.add(v);
				
				}
			
			}
		
			FirmaVP vpFirma = new FirmaVP(adresa, vozila);
			System.out.println("Ukupan porez iznosi: " + vpFirma.porez(2022));
			System.out.println(vpFirma.toString());
			
			
			
		}
		
		
		
	
//		System.out.println("-----PRIVATNI VOZNI PARK----------");
//		
//		PrivatniVP privatni = new PrivatniVP("Suboticka", vozilo);
//		System.out.println(privatni.toString());
//	
//		System.out.println("----------POSLOVNI VOZNI PARK----------");
//		
//			Vozilo v2 = new Vozilo("motocikl", 1800, 2004);
//			Vozilo v3 = new Vozilo("motocikl", 1000, 2008);
//			Vozilo v4 = new Vozilo("putnicko", 2000, 2010);
//			
//            
//		
//		ArrayList vozila = new ArrayList();
//			vozila.add(v2);
//			vozila.add(v3);
//			vozila.add(v4);
//			
//			FirmaVP firma = new FirmaVP("Suboticka", vozila);
//			
//			System.out.println(firma.toString());
	
	}

}
