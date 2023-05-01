package restaurante;

import java.util.ArrayList;

public class Restaurante {

	    private ArrayList<Comanda> comandas;
	    
	    public Restaurante() {
	       comandas = new ArrayList<Comanda>();
	    }
	    
	    public void aceptarComanda(String descripcion) {
	        Comanda comanda = new Comanda(descripcion);
	        comandas.add(comanda);
	    }
	    
	    public void listarComandasPendientes() {
	        for (Comanda comanda : comandas) {
	            comanda.getDescripcion();
	        }
	    }
	    
	    public void eliminarComanda(Comanda comanda) {
	        //Comanda comanda = comandas.get(comnadaSinAtender);
	        
	    	if(comandas.contains(comanda)) {
	        comandas.remove(comanda);
	    	}
	    }
}
