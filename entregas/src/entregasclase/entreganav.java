package entregasclase;
import java.io.*;
import java.util.Date;
import java.util.*;
public class entreganav {

	public static void main(String[] args) {
		   Date fecha = new Date();  
		try {
			FileWriter fichero =  new FileWriter ("C:\\Users\\HP\\git\\repository\\entregas\\src\\entregasclase\\tareasacompletar",true);
			Hashtable tareas  = new Hashtable();
			System.out.println("Tareas pendientes: ");
			tareas.put("Poner arbol",true);
			tareas.put("Poner la mesa",true);
			
			

			System.out.println("1- Poner arbol: " + tareas.get("Poner arbol"));
			System.out.println("2- Poner la mesa: " + tareas.get("Poner la mesa"));
			PrintWriter pw = new PrintWriter(fichero);
			pw.println("Tareas pendientes" );
			pw.println("-------------------");
			pw.println("1- Poner arbol: " +tareas.get("Poner arbol"));
			pw.println(fecha);
			pw.println("2- Poner la mesa: " +tareas.get("Poner la mesa"));
			pw.println(fecha);
			pw.close();
			
		
					
			
		
			
		} catch (Exception e) {
			System.err.println("Problema para abrir el archivo");
		}
	}
}
