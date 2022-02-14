package Inicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Combo;
import modelo.Ingredientes;
import modelo.Pedidos;
import modelo.ProductoMenu;

public class Restaurante {
	
	
	public ArrayList<Ingredientes> ingredientes; 
	public ArrayList<ProductoMenu> ProductosMenu;
	public Pedidos pedidoActual;
	public int numPedido = 1;
	
	
	public void iniciarPedido(String nombreCliente, String direccionCliente) 
	{
		String idPedido = nombreCliente + String.valueOf(numPedido);
		this.numPedido = numPedido+1;
		Pedidos pedido1 = new Pedidos(nombreCliente, direccionCliente,idPedido);
		Boolean pedidoEnCurso = true;
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
	
	
	public static void cargarInformacionRestaurante() throws FileNotFoundException, IOException 
	{
		
		ArrayList<Ingredientes> ingredientes= cargarIngredientes("./data/ingredientes.txt");
		int x = 0;
		while (x < ingredientes.size())
		{
			Ingredientes ingrediente= ingredientes.get(x);
			System.out.println(ingrediente.getNombre());
			System.out.println(ingrediente.getCostoAdicional());
			x+=1;
		}
		

		ArrayList<Combo> combos = cargarCombos("./data/combos.txt");
		int y = 0;
		while (y < combos.size())
		{
			Combo combo = combos.get(y);
			System.out.println(combo.getNombreCombo());
			System.out.println(combo.getDescuento());
			x+=1;
		}

		ArrayList<ProductoMenu> ProductosMenu = cargarProductoMenu("./data/menu.txt");
		
		int x1 = 0;
		while (x1 < ProductosMenu.size())
		{
			ProductoMenu producto= ProductosMenu.get(x1);
			System.out.println(producto.getNombre());
			System.out.println(producto.getPrecioBase());
			x1+=1;
		}
		

		
	}
	
	public static ArrayList<Ingredientes> cargarIngredientes(String nombre) throws FileNotFoundException, IOException
	{
		ArrayList<Ingredientes> lista = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(nombre))) 
		{
			String linea = br.readLine();
			linea = br.readLine();
			
			while (linea != null) 
			{
				
				String[] partes = linea.split(";");
				int precio= Integer.parseInt(partes[1]);
				Ingredientes ingrediente = new Ingredientes(partes[0], precio);
				lista.add(ingrediente);
				linea = br.readLine();
				
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return lista;
			
	}
	
	public static ArrayList<ProductoMenu> cargarProductoMenu(String nombre) throws FileNotFoundException, IOException
	{
		ArrayList<ProductoMenu> lista = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(nombre))) 
		{
			String linea = br.readLine();
			linea = br.readLine();
			
			while (linea != null) 
			{
				
				String[] partes = linea.split(";");
				int precio= Integer.parseInt(partes[1]);
				ProductoMenu producto = new ProductoMenu(partes[0], precio);
				lista.add(producto);
				linea = br.readLine();
				
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return lista;
	
	}
	
	public static ArrayList<Combo> cargarCombos(String nombre) throws FileNotFoundException, IOException
	{
		ArrayList<Combo> lista = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(nombre))) 
		{
			String linea = br.readLine();
			linea = br.readLine();
			
			while (linea != null) 
			{
				
				String[] partes = linea.split(";");
				double descuento= Integer.parseInt(partes[1]);
				Combo combo = new Combo(descuento, partes[0]);
				lista.add(combo);
				linea = br.readLine();
				
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return lista;
		
		
		
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
