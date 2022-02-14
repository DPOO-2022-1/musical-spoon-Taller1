package modelo;

public class Combo {
	
	private double descuento;
	
	private String nombreCombo;
	
	public Combo(double descuento, String nombreCombo) 
	{
		this.setDescuento(descuento);
		this.setNombreCombo(nombreCombo);
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
	
	
	
	

}
