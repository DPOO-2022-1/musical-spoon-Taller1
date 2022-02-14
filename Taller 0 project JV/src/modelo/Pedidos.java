package modelo;

import java.util.ArrayList;

public class Pedidos {
	
	private String idPedido;
	
	private String nombreCliente;
	
	private String direccionCliente;
	
	private ArrayList<Combo> combos;
	
	
	public Pedidos(String nombreCliente, String direccionCliente, String idPedido) 
	{
		
		this.setNombreCliente(nombreCliente);
		this.setDireccionCliente(direccionCliente);
		this.setIdPedido(direccionCliente);

	}


	public String getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public String getDireccionCliente() {
		return direccionCliente;
	}


	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}
	
}
