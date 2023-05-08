package juego;

public class Jugadores {

	private String nombre;
	private Carton carton;
	
	public Jugadores(String nombre) {
		this.nombre = nombre;
		carton = new Carton();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Carton getCarton() {
		return carton;
	}
}
