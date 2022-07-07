package ZadatakVozniPark;

public class PrivatniVP extends VozniPark {

	Vozilo vozilo = new Vozilo();

	public PrivatniVP(String adresa, Vozilo vozilo) {
		super(adresa);
		this.adresa = adresa;
		this.vozilo = vozilo;
	}

	public String toString() {
		return "Adresa voznog parka: " + adresa + ". Vozilo je tipa: " + vozilo.getTipVozila() + ", zapremina je: "
				+ vozilo.zapreminaM + " ccm" + ", godiste: " + vozilo.godina + " god" + "\n";
	}

	public double porez(int godina) {
		double porez = 0;
		if (vozilo.tipVozila.equals("putnicko")) {
			if (vozilo.zapreminaM > 1 && vozilo.zapreminaM <= 2000) {
				if (godina - vozilo.godina > 5 && godina - vozilo.godina <= 10) {
					System.out.println(porez = 10150 - (10150 * 0.25));
				} else if (godina - vozilo.godina > 10) {
					System.out.println(porez = 10150 - (10150 * 0.4));
				} else {
					System.out.println(porez = 10150);
				}

			} else if (vozilo.zapreminaM > 2000 && vozilo.zapreminaM <= 3000) {
				if (godina - vozilo.godina > 5 && godina - vozilo.godina <= 10) {
					System.out.println(porez = 50350 - (50350 * 0.25));
				} else if (godina - vozilo.godina > 10) {
					System.out.println(porez = 50350 - (50350 * 0.4));
				} else {
					System.out.println(porez = 50350);
				}
			} else {
				if (godina - vozilo.godina > 5 && godina - vozilo.godina <= 10) {
					System.out.println(porez = 210920 - (210920 * 0.25));
				} else if (godina - vozilo.godina > 10) {
					System.out.println(porez = 210920 - (210920 * 0.4));
				} else {
					System.out.println(porez = 210920);
				}

			}

		}

		else {
			if (vozilo.zapreminaM > 1 && vozilo.zapreminaM <= 500) {
				if (godina - vozilo.godina > 5 && godina - vozilo.godina <= 10) {
					System.out.println(porez = 3400 - (3400 * 0.25));
				} else if (godina - vozilo.godina > 10) {
					System.out.println(porez = 3400 - (3400 * 0.4));
				} else {
					System.out.println(porez = 3400);
				}
			} else if (vozilo.zapreminaM > 500 && vozilo.zapreminaM <= 1100) {
				if (godina - vozilo.godina > 5 && godina - vozilo.godina <= 10) {
					System.out.println(porez = 8800 - (8800 * 0.25));
				} else if (godina - vozilo.godina > 10) {
					System.out.println(porez = 8800 - (8800 * 0.4));
				} else {
					System.out.println(porez = 8800);
				}
			} else {
				if (godina - vozilo.godina > 5 && godina - vozilo.godina <= 10) {
					System.out.println(porez = 11890 - (11890 * 0.25));
				} else if (godina - vozilo.godina > 10) {
					System.out.println(porez = 11890 - (11890 * 0.4));
				} else {
					System.out.println(porez = 11890);
				}

			}

		}
		
		return porez;

	}

}
