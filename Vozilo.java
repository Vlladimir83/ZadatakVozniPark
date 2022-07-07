package ZadatakVozniPark;

public class Vozilo {

	String tipVozila;
	double zapreminaM;
	int godina;

	public Vozilo (String tipVozila,double zapreminaM,int godina) {
		
		this.tipVozila = tipVozila;
		this.zapreminaM = zapreminaM;
		this.godina = godina;
	}
	
	public Vozilo () {}

	public String getTipVozila() {
		return tipVozila;
	}

	public void setTipVozila(String tipVozila) {
		this.tipVozila = tipVozila;
	}

	public double getZapreminaM() {
		return zapreminaM;
	}

	public void setZapreminaM(double zapreminaM) {
		this.zapreminaM = zapreminaM;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}

	public String toString() {
		return "Vozilo je tipa " + tipVozila + " , ima zapreminu motora " + zapreminaM +" ccm " +  " proizvedeno je " 
				+ godina + " godine"+ "\n";
	}
}
