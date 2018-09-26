package schneckenrennen;

import java.util.*;

public class Rennschnecke {

	private String name;
	private String rasse;
	private int maximalGeschwindigkeit;
	private int gesamtWeg;

	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRasse() {
		return rasse;
	}

	public void setRasse(String rasse) {
		this.rasse = rasse;
	}

	public int getMaximalGeschwindigkeit() {
		return maximalGeschwindigkeit;
	}

	public void setMaximalGeschwindigkeit(int maximalGeschwindigkeit) {
		this.maximalGeschwindigkeit = maximalGeschwindigkeit;
	}

	public int getGesamtWeg() {
		return gesamtWeg;
	}

	public void setGesamtWeg(int gesamtWeg) {
		this.gesamtWeg = gesamtWeg;
	}

	// constructor
	public Rennschnecke(String name, String rasse, int maximalGeschwindigkeit, int gesamtWeg) {
		this.name = name;
		this.rasse = rasse;
		this.maximalGeschwindigkeit = maximalGeschwindigkeit;
		this.gesamtWeg = gesamtWeg;
	}

	public void krieche() {
		//double zufallsZahl = Math.random();
		//return Math.round(this.maximalGeschwindigkeit * zufallsZahl);

		Random random = new Random();
		this.gesamtWeg += maximalGeschwindigkeit * (random.nextInt(100) + 1) / 100;
	}

	public String toString() {

		String rückgabe;
		rückgabe = "Die Schnecke heißt: " + this.getName() + "\nDie Rasse ist: " + this.getRasse()
				+ "\nMaximalgeschwindigkeit: " + this.getMaximalGeschwindigkeit() + "\nzurückgelegter Weg: "
				+ this.getGesamtWeg();
		return rückgabe;

	}

}
