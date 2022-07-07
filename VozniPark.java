package ZadatakVozniPark;

abstract class  VozniPark {

	String adresa;

	public VozniPark(String adresa) {
		this.adresa =adresa;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public abstract double porez (int godina);
	
	
}
