package entregasclase;
import java.io.*;
import java.util.*;
public class entreganav {

	public static void main(String[] args) {
		
		String tareainc;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca la terea a realizar ");
		tareainc = sc.next();
		String tareas []= {fichero};
		    
		try {
			FileWriter fichero =  new FileWriter ("C:\\Users\\HP\\git\\repository\\entregas\\src\\entregasclase\\tareasacompletar",true);
			
			PrintWriter pw = new PrintWriter(fichero);
			pw.println(tareainc);
			pw.close();
			
			for (int i = 0;i < tareas.length; i++) {
				Hashtable direccion  = new Hashtable();
				direccion.put(tareainc,false);
				Integer minumero = (Integer) direccion.get("numero");

				System.out.println("Tarea : " + tareas [0]);	
			}
		
			
		} catch (Exception e) {
			System.err.println("Problema para abrir el archivo");
		}
	}
}
