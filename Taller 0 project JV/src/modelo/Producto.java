package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

interface Producto {
	
	public int getPrecio();
	public String getNombre();
	public String generarTextoFactura();

	public static void crearRecibo(String textoProductos, String nombre, String id, String direccion) {
		
		String textoBase = "Restaurante magical spoon \n  Recibo de: " + nombre + " Para la direccion: " + direccion + " \n con el ID: " + id + " \\n \\n ==================== \n \n" + textoProductos;
		
		try {
            String ruta = "/recibos/" + id + ".txt";
            File file = new File(ruta);
            
            if (!file.exists()) {
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(textoBase);
            bw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
	
	public default String generarTextoRecibo() {
		
		return "i";
		
	}

}
