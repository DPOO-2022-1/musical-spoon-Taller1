package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

interface Producto {
	
	public int getPrecio();
	public String getNombre();
	public String generarTextoFactura();	
	

}
