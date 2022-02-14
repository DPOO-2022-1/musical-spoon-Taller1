package modelo;

public class ProductoMenu implements Producto {
	
	private String nombre;
	
	private int precioBase;
	
	public ProductoMenu(String nombre, int precioBase) 
	{
		this.setNombre(nombre);
		this.setPrecioBase(precioBase);
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}


	@Override
	public int getPrecio() {
		return precioBase;
	}


	@Override
	public String generarTextoFactura() {
		
		String texto = "\n  --" + nombre + ": " + precioBase + "\n" ;
		
		return texto;
	}

}
