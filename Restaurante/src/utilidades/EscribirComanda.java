package utilidades;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import restaurante.Comanda;

public class EscribirComanda {

	    private String rutaArchivo = "C:\\Users\\pdmm2\\OneDrive\\Documentos\\Comandas.txt";

	    public EscribirComanda(String rutaArchivo) {
	        this.rutaArchivo = rutaArchivo;
	    }

	    public void escribirComandas(List<Comanda> comandas) throws IOException {
	        BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo));

	        for (Comanda comanda : comandas) {
	            escritor.write(comanda.getDescripcion());
	            escritor.newLine();
	        }

	        escritor.close();
	    }
	}


