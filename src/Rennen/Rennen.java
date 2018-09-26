package Rennen;

import schneckenrennen.Rennschnecke;

public class Rennen {
	private String name = "";
	private int anzahl = 0;
	private Rennschnecke[] schnecken;
	private int laenge = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

	public Rennschnecke[] getSchnecken() {
		return schnecken;
	}

	public void setSchnecken(Rennschnecke[] schnecken) {
		this.schnecken = schnecken;
	}

	public int getLaenge() {
		return this.laenge;
	}

	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}

	public Rennen(String name, int anzahl, Rennschnecke[] schnecken, int laenge) {
		this.name = name;
		this.anzahl = anzahl;
		this.schnecken = schnecken;
		this.laenge = laenge;
	}

	public void addRennschnecke(Rennschnecke neueSchnecke) {
		Rennschnecke[] neuesSchneckenArray = new Rennschnecke[getAnzahl() + 1];
		for (int i = 0; i < getAnzahl(); i++) {
			neuesSchneckenArray[i] = getSchnecken()[i];
		}
		neuesSchneckenArray[getAnzahl()] = neueSchnecke;
	}

	public void removeRennschnecke(String name) {

	}

	public String toString() {
		return this.getName() + ", " + Integer.toString(this.getAnzahl()) + ", " + this.getSchnecken().toString() + ", "
				+ Integer.toString(this.getLaenge());
	}

	public Rennschnecke ermittleGewinner() {
		for(int i = 0; i < this.getAnzahl(); i++) {
			if(this.getSchnecken()[i].getGesamtWeg() == getLaenge()) {
				return this.getSchnecken()[i];
			}
		}
		return null;
	}
	
	public void lassSchneckenKriechen() {
		for(int i = 0; i < this.getAnzahl(); i++) {
			this.getSchnecken()[i].krieche();
		}
	}
	
	public void durchfuehren() {
		while(this.ermittleGewinner() == null) {
			this.lassSchneckenKriechen();
		}
	}
}