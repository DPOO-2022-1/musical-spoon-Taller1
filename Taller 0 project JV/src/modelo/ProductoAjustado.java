package modelo;

import java.util.ArrayList;

public class ProductoAjustado implements Producto {
	
	private String nombre;
	
	private int costo;
	
	private ArrayList<Ingredientes> agregados;
	
	private ArrayList<Ingredientes> eliminados;
	
	
	public ProductoAjustado(ProductoMenu base) 
	{
		this.nombre= base.getNombre();
		this.costo= base.getPrecioBase();
	}
	
	private int modificar_costo(Ingredientes ingrediente) 
	{	
		int x = ingrediente.getCostoAdicional();
		costo+= x;
		return costo;
	}
	
	public void agregar_ingrediente(ArrayList<Ingredientes> ingredientes, int numero) 
	{
		Ingredientes x= ingredientes.get(numero);
		modificar_costo(x);
		agregados.add(x);

	}
	
	public void eliminar_ingrediente(ArrayList<Ingredientes> ingredientes, int numero) 
	{
		Ingredientes x= ingredientes.get(numero);
		eliminados.add(x);
	}
	
	public int getPrecio() {
		return costo;
	}

	
	public String getNombre() {
		return nombre;
	}

	
	public String generarTextoFactura() {
		
		
		String texto = "\n" + nombre + ": " + costo + "\n" ;
		
		for (Ingredientes x: agregados) {
			
			String texto2 = "++ " + x.getNombre() + ": " + x.getCostoAdicional() +"\n";
			texto = texto + texto2;
			
		}
		
		for (Ingredientes x: eliminados) {
			
			String texto3 = "-- " + x.getNombre() + "\n";
			texto = texto + texto3;
			
		}
		
		return texto;
	}

}
