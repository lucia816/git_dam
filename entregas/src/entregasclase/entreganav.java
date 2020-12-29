package entregasclase;
import java.io.*;
import java.util.*;
public class entreganav {

	public static void main(String[] args) {
		    
		try {
			FileWriter fichero =  new FileWriter ("C:\\Users\\HP\\git\\repository\\entregas\\src\\entregasclase\\tareasacompletar",true);
			Hashtable tareas  = new Hashtable();
			tareas.put("Poner arbol",true);
			tareas.put("Matematica",true);
			
			
			Integer minumero = (Integer) tareas.get("numero");

			System.out.println("Poner arbol: " + tareas.get("Poner arbol"));
			PrintWriter pw = new PrintWriter(fichero);
			pw.println("Poner arbol: " +tareas.get("Poner arbol"));
			pw.close();
			
		
					
			
		
			
		} catch (Exception e) {
			System.err.println("Problema para abrir el archivo");
		}
	}
}
