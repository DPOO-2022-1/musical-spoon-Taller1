package Inicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import modelo.Ingredientes;
import modelo.Combo;



public class Aplicacion {
	
	Restaurante restaurante = null;
	
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		
		Aplicacion aplicacion = new Aplicacion();
		aplicacion.ejecutarApp();
		
	}
	
	
	public void ejecutarApp() throws FileNotFoundException, IOException {
		
		boolean continuar = true;
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
		System.out.println("1) Cargar restaurante");
		System.out.println("2) Crear un pedido");
		System.out.println("3) Añadir un elemento al pedido");
		System.out.println("4) Cerrar un pedido y generar un recibo");
		System.out.println("5) Consulta un pedido pedido");
		System.out.println("0) Cerrar app");
		
	}
	
	
	public void ejecutarOpcion(int opcion) throws FileNotFoundException, IOException {
		
		if (opcion == 1 && restaurante != null) {
			
			restaurante = new Restaurante();
			ejecutar_cargar_restaurante();
			
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
