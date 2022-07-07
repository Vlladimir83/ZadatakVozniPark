package ZadatakVozniPark;

import java.util.ArrayList;

public class FirmaVP extends VozniPark {

	ArrayList<Vozilo> vozila2 = new ArrayList<>();
	public double ukupanPorez;
	public double porez;

	public FirmaVP(String adresa, ArrayList vozila2) {
		super(adresa);
		this.adresa = adresa;
		this.vozila2 = vozila2;
	}

	public String toString() {
		String rezultat = "";
		for (int i = 0; i < vozila2.size(); i++) {
			rezultat += "Adresa: " + this.adresa + ", Vozilo tip: " + vozila2.get(i).getTipVozila() + ", zapremina: "
					+ vozila2.get(i).getZapreminaM() + ", godiste: " + vozila2.get(i).getGodina() + "\n";
		}
		return rezultat;
	}

	public double porez(int godina) {

		for (int i = 0; i < vozila2.size(); i++) {
			if (vozila2.get(i).getTipVozila().equals("putnicko")) {
				if (vozila2.get(i).getZapreminaM() > 1 && vozila2.get(i).getZapreminaM() <= 2000) {
					if (godina - vozila2.get(i).getGodina() > 5 && godina - vozila2.get(i).getGodina() <= 10) {
						porez = 10150 - (10150 * 0.25);
						ukupanPorez = ukupanPorez + porez;

					} else if (godina - vozila2.get(i).getGodina() > 10) {
						porez = 10150 - (10150 * 0.4);
						ukupanPorez = ukupanPorez + porez;

					} else {
						porez = 10150;
						ukupanPorez = ukupanPorez + porez;
					}

				} else if (vozila2.get(i).getZapreminaM() > 2000 && vozila2.get(i).getZapreminaM() <= 3000) {
					if (godina - vozila2.get(i).getGodina() > 5 && godina - vozila2.get(i).getGodina() <= 10) {
						porez = 50350 - (50350 * 0.25);
					} else if (godina - vozila2.get(i).getGodina() > 10) {
						porez = 50350 - (50350 * 0.4);
					} else {
						porez = 50350;
					}
				} else {
					if (godina - vozila2.get(i).getGodina() > 5 && godina - vozila2.get(i).getGodina() <= 10) {
						porez = 210920 - (210920 * 0.25);
					} else if (godina - vozila2.get(i).getGodina() > 10) {
						porez = 210920 - (210920 * 0.4);
					} else {
						porez = 210920;
					}

				}

			}

			else {
				if (vozila2.get(i).getZapreminaM() > 1 && vozila2.get(i).getZapreminaM() <= 500) {
					if (godina - vozila2.get(i).getGodina() > 5 && godina - vozila2.get(i).getGodina() <= 10) {
						porez = 3400 - (3400 * 0.25);
					} else if (godina - vozila2.get(i).getGodina() > 10) {
						porez = 3400 - (3400 * 0.4);
					} else {
						porez = 3400;
					}
				} else if (vozila2.get(i).getZapreminaM() > 500 && vozila2.get(i).getZapreminaM() <= 1100) {
					if (godina - vozila2.get(i).getGodina() > 5 && godina - vozila2.get(i).getGodina() <= 10) {
						porez = 8800 - (8800 * 0.25);
					} else if (godina - vozila2.get(i).getGodina() > 10) {
						porez = 8800 - (8800 * 0.4);
					} else {
						porez = 8800;
					}
				} else {
					if (godina - vozila2.get(i).getGodina() > 5 && godina - vozila2.get(i).getGodina() <= 10) {
						porez = 11890 - (11890 * 0.25);
					} else if (godina - vozila2.get(i).getGodina() > 10) {
						porez = 11890 - (11890 * 0.4);
					} else {
						porez = 11890;
					}

				}

			}
			ukupanPorez = ukupanPorez + porez;

		}

		return ukupanPorez;

	}

}
