package juego;

import java.util.TreeSet;

public class Bombo {

	TreeSet<Integer> bombo;
	
	public Bombo() {
		bombo = new TreeSet<Integer>();
		for(int i = 1; i<90; i++) {
			bombo.add(i);
		}
	}
	
	
}
