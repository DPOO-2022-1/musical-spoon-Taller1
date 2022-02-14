package modelo;

import java.util.ArrayList;

public class Combo implements Producto{
	
	private double descuento;
	
	private String nombreCombo;
	
	private ArrayList<ProductoMenu> items;
	
	private int costo;
	
	public Combo(double descuento, String nombreCombo, ArrayList<ProductoMenu> items) 
	{
		this.setDescuento(descuento);
		this.setNombreCombo(nombreCombo);
		this.items = items;
	}
	
	
	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public String getNombreCombo() {
		return nombreCombo;
	}

	public void setNombreCombo(String nombreCombo) {
		this.nombreCombo = nombreCombo;
	}


	public int getPrecio() {
		int x = 0;
		this.costo = 0;
		while (x < items.size()) 
		{
			ProductoMenu producto = items.get(x);
			costo += producto.getPrecioBase();
			x+=1;
		}
		costo = (int) (costo - costo*descuento);
		return costo;
	}


	public String getNombre() {
		return nombreCombo;
	}


	@Override
	public String generarTextoFactura() {
		
		String texto = "\n" + nombreCombo + ": " + costo + "\n" ;
		
		for (ProductoMenu x: items) {
			
			String texto2 = "\t -- " + x.getNombre();
			texto = texto + texto2;
			
		}
		
		
		
		return texto;
	}
	
	
	
	

}
