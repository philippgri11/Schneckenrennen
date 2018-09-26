package wettbuero;

import java.util.ArrayList;

import Rennen.Rennen;

import java.util.*;

public class Wettbuero {

	// Attribute

	ArrayList<Wette> wettListe = new ArrayList<Wette>();
	double WETT_EINSATZ_FAKTOR;

	Rennen rennen;

	// Konstruktor
	public Wettbuero(Rennen rennen, double WETT_EINSATZ_FAKTOR) {
		this.rennen = rennen;
		this.WETT_EINSATZ_FAKTOR = WETT_EINSATZ_FAKTOR;
		this.wettListe = new ArrayList<Wette>();
	}

	public void wetteAnnehmen(String schneckenName, int wettEinsatz, String spieler) {
		wettListe.add(new Wette(schneckenName, wettEinsatz, spieler));
	}

	public void rennenDurchfuehren() {
		this.rennen.durchfuehren(); //TODO Methode fehlt
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		// Name des Rennens ausgeben
		sb.append("Rennen:\n");
		sb.append(this.rennen);
		sb.append("Wette:\n");

		// Wetten, wenn vorhanden, ausgeben
		if (wettListe.size() > 0) {
			for (Wette neueWette : this.wettListe) {
				sb.append(neueWette);
				sb.append("\n");
			}
		} else {
			sb.append("(keine)");
		}

		// Infos zum Wettbüro ausgeben
		sb.append("Wettbüro für:\n");
		sb.append(this.rennen.getPrintString()); //TODO Methode fehlt
		sb.append("Wetten:\n");

		return sb.toString();
	}
	
	public void print() {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.toString());
	}
}
