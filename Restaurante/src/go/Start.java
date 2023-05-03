package go;

import java.io.IOException;
import java.util.ArrayList;

import restaurante.Comanda;
import restaurante.Restaurante;
import utilidades.ComandasOutPut;
import utilidades.EscribirComanda;

public class Start {

	public static void main(String[] args) throws IOException {
		
		 //Restaurante restaurante = new Restaurante();
		 ArrayList<Comanda> comandas = new ArrayList<Comanda>();
	        comandas.add(new Comanda("Pizza margarita"));
	        comandas.add(new Comanda("Ensalada César"));
	        comandas.add(new Comanda("Coca-Cola"));

	        EscribirComanda escritor = new EscribirComanda("C:\\Users\\pdmm2\\OneDrive\\Documentos\\Comandas.txt");
	        try {
	            escritor.escribirComandas(comandas);
	            System.out.println("Comandas escritas en el archivo exitosamente.");
	        } catch (IOException e) {
	            System.err.println("Error al escribir las comandas en el archivo: " + e.getMessage());
	        }
	    }

	     
		//Restaurante restaurante = new Restaurante();
//		Comanda comanda1 = new Comanda("Patatas");
//		Comanda comanda2 = new Comanda("Merluza");
//		Comanda comanda3 = new Comanda("Jamon");
		
		
		
//		restaurante.añadirComanda("Comanda 1");
//		restaurante.añadirComanda("Comanda 2");
//		restaurante.añadirComanda("Comanda 3");
		
//		restaurante.addComanda(comanda1);
//		restaurante.addComanda(comanda2);
//		restaurante.addComanda(comanda3);
		
		//System.out.println(restaurante.listarComandasPendientes());
		//System.out.println(restaurante);
		//restaurante.eliminarComanda();
		//restaurante.atenderComanda(comanda2);
		//System.out.println(restaurante);
		//restaurante.save();
//		Scanner miTeclado = new Scanner(System.in);
//		//ESCRIBIMOS TEXTO DESDE TECLADO A FICHERO DE TEXTO
//        System.out.print("Da nombre del fichero de texto donde escribir: ");
//        String s1 = miTeclado.next();        
//        EscribirFichero(s1);
		//System.out.println(restaurante.listarComandasPendientes());
		

	}


