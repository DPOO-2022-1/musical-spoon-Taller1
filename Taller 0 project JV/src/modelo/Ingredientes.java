package modelo;

public class Ingredientes {
	
	private String nombre;
	
	private int costoAdicional;
	
	public Ingredientes(String nombre, int costoAdicional) 
	{
		this.setNombre(nombre);
		this.setCostoAdicional(costoAdicional);
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCostoAdicional() {
		return costoAdicional;
	}

	public void setCostoAdicional(int costoAdicional) {
		this.costoAdicional = costoAdicional;
	}

}
