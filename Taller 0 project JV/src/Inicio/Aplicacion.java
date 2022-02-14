package Inicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import modelo.Ingredientes;
import modelo.Pedidos;
import modelo.Combo;
import Inicio.Restaurante;




public class Aplicacion {
	
	Restaurante restaurante = null;
	public String nombre;
	public String direccion;
	public Pedidos pedidoActual = null;
	
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		
		Aplicacion aplicacion = new Aplicacion();
		aplicacion.ejecutarApp();
		
	}
	
	
	public void ejecutarApp() throws FileNotFoundException, IOException {
		
		boolean continuar = true;
		restaurante = new Restaurante();
		ejecutar_cargar_restaurante();
		
		while(continuar) {
			
			mostrarMenu();
			int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
			
			if (opcion_seleccionada == 0) {
				continuar = false;
			} else {
				ejecutarOpcion(opcion_seleccionada);
			}
			
		}
		
	}
	
	
	public void mostrarMenu() 
	{
		
		System.out.println("Elige una opcion: ");
		System.out.println("1) Crear un pedido");
		System.out.println("2) Añadir un elemento al pedido");
		System.out.println("3) Cerrar un pedido y generar un recibo");
		System.out.println("4) Consulta un pedido cerrado");
		System.out.println("5) Cerrar app");
		
	}
	
	
	public void ejecutarOpcion(int opcion) throws FileNotFoundException, IOException {
		
		if (opcion == 1) {
			
			this.nombre = input("Cual es tu nombre?");
			this.direccion = input("Cual es tu direccion");
			pedidoActual = restaurante.iniciarPedido(nombre, direccion);
			
			}
		else if(opcion == 2) {
			
			System.out.println("Elige una opcion: ");
			System.out.println("1) Añadir un Combo");
			System.out.println("2) Añadir un Producto Sencillo");
			System.out.println("Recuerde que no puede hacer modificaciones a un Combo");
			int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
			
				if (opcion_seleccionada == 1) {
					
					System.out.println("Elige un Combo: ");
					System.out.println("1) combo corral");
					System.out.println("2) combo corral queso");
					System.out.println("3) combo todoterreno");
					System.out.println("4) combo especial");
					int combo_seleccionado = Integer.parseInt(input("Por favor seleccione una opción"));
					if (combo_seleccionado == 1) {
						///combo corral
					} else if (combo_seleccionado == 2) {
						///combo corral queso
					} else if (combo_seleccionado == 3) {
						///combo corral todoterreno
					} else if (combo_seleccionado == 4) {
						///combo corral especial
					}
					
					
					
				} else if (opcion_seleccionada == 2) {
					
					System.out.println("Elige un Producto: ");
					System.out.println("1) corral");
					System.out.println("2) corral queso");
					System.out.println("3) corral pollo");
					System.out.println("4) corralita");
					System.out.println("5) todoterreno");
					System.out.println("6) 1/2 libra");
					System.out.println("7) especial");
					System.out.println("8) casera");
					System.out.println("9) mexicana");
					System.out.println("10) criolla");
					System.out.println("11) costeña");
					System.out.println("12) hawaiana");
					System.out.println("13) wrap de pollo");
					System.out.println("14) wrap de lomo");
					System.out.println("15) ensalada mexicana");
					System.out.println("16) papas medianas");
					System.out.println("17) papas grandes");
					System.out.println("18) papas en casco medianas");
					System.out.println("19) papas en casco grandes");
					System.out.println("20) agua cristal sin gas");
					System.out.println("21) agua cristal con gas");
					System.out.println("22) gaseosa");
					int producto_seleccionado = Integer.parseInt(input("Por favor seleccione una opción"));
					if (producto_seleccionado == 1) {
						///corral
					} else if (producto_seleccionado == 2) {
						///corral queso
					} else if (producto_seleccionado == 3) {
						///corral pollo
					} else if (producto_seleccionado == 4) {
						///corralita
					} else if (producto_seleccionado == 5) {
						///todoterreno
					} else if (producto_seleccionado == 6) {
						///1/2 libra
					} else if (producto_seleccionado == 7) {
						///especial
					} else if (producto_seleccionado == 8) {
						///casera
					} else if (producto_seleccionado == 9) {
						///mexicana
					} else if (producto_seleccionado == 10) {
						///criolla
					} else if (producto_seleccionado == 11) {
						///costeña
					} else if (producto_seleccionado == 12) {
						///hawaiana
					} else if (producto_seleccionado == 13) {
						///wrap de pollo
					}else if (producto_seleccionado == 14) {
						///wrap de lomo
					} else if (producto_seleccionado == 15) {
						///ensalada mexicana
					} else if (producto_seleccionado == 16) {
						///papas medianas
					} else if (producto_seleccionado == 17) {
						///papas grandes
					} else if (producto_seleccionado == 18) {
						///papas en casco medianas
					} else if (producto_seleccionado == 19) {
						///papas en casco grandes
					} else if (producto_seleccionado == 20) {
						///agua cristal sin gas
					} else if (producto_seleccionado == 21) {
						///agua cristal con gas
					} else if (producto_seleccionado == 22) {
						///gaseosa
					}
					
					
				}
				
			
			
			
			
		}
		
	}
	
	
	private void ejecutar_cargar_restaurante() throws FileNotFoundException, IOException
	{
		
		Restaurante.cargarInformacionRestaurante();
		
	}
		
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	
}
