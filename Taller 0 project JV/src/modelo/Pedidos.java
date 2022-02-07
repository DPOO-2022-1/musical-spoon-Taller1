package modelo;

public class Pedidos {
	
	private int idPedido;
	
	private String nombreCliente;
	
	private String direccionCliente;
	
	
	public Pedidos(String nombreCliente, String direccionCliente) 
	{
		
		this.setNombreCliente(nombreCliente);
		this.setDireccionCliente(direccionCliente);

	}


	public int getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(int idPedido) {
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
