package Inicio;

import java.io.File;

import modelo.Pedidos;

public class Restaurante {
	
	public static void main(String[] args) 
	{
	
		
		
	}
	
	
	
	public void iniciarPedido(String nombreCliente, String direccionCliente) 

	{
		Pedidos pedido1 = new Pedidos(nombreCliente, direccionCliente);
		System.out.println("Iniciando pedido");
		System.out.println("Se creo el pedido para el cliente :" + pedido1.getNombreCliente() + "de direccion: " + pedido1.getDireccionCliente());
		
	}
	
	public void cerrarYGuardarPedido() 
	{
		
		System.out.println("Guarda Pedido");
		
	}
	
	public Pedidos getPedidoEnCurso() 
	{
		Pedidos pedido = null;
		System.out.println("getPedidoEnCurso");
		return pedido;
		
	}
	
	public String getMenuBase() 
	{
		String menuBase = "menuBase";
		System.out.println("menuBaseo");
		return menuBase;
		
	}
	
	public String getIngredientes() 
	{
		String Ingredientes = "Ingredientes";
		System.out.println("Ingredientes");
		return Ingredientes;
		
	}
	
	
	public void cargarInformacionRestaurante(File archivoIngredientes, File archivoMenu, File archivoCombos) 
	{
		
		System.out.println("cargarInformacionRestaurante");
		
		
	}
	
	public void cargarIngredientese(File archivoIngredientes) 
	{
		
		System.out.println("archivoIngredientes");
		
		
	}
	
	public void cargarMenu(File archivoMenu) 
	{
		
		System.out.println("archivoMenu");
		
		
	}
	
	public void cargarCombos(File archivoCombos) 
	{
		
		System.out.println("archivoCombos");
		
		
	}
	
	
}
