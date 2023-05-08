package juego;

import java.util.ArrayList;

public class Carton {

	ArrayList<Bombo> carton;
	Bombo bombo;
	
	public Carton() {
		carton = new ArrayList<Bombo>();
		bombo = new Bombo();
	}
	
	public void Add() {
		for(int i=0; i<19; i++) {
			carton.add(bombo);
		}
	}
}
