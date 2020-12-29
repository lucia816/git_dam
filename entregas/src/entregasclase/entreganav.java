package entregasclase;
import java.io.*;
import java.util.Date;
import java.util.*;
public class entreganav {

	public static void main(String[] args) {
		   Date fecha = new Date(); 
		   int opcionqhacer;
		   int opcionqeliminar;
		   int cualelimina;
		   Scanner sc = new Scanner (System.in);
		try {
			FileWriter fichero =  new FileWriter ("C:\\Users\\HP\\git\\repository\\entregas\\src\\entregasclase\\tareasacompletar",true);
			Hashtable tareas  = new Hashtable();
			System.out.println("Que desea hacer? ");
			System.out.println("1- Crear una nueva tarea pendiente ");
			System.out.println("2- Dar por terminada una tarea pendiente ");
			System.out.println("3- Mostrar las tareas pendientes ");
			opcionqhacer = sc.nextInt();
			switch (opcionqhacer){
			
			case 1 : 
				if (opcionqhacer == 1) {
					String tareanueva = sc.next();
					tareas.put(sc, true);
					PrintWriter pw = new PrintWriter(fichero);
					pw.println(tareanueva);
					break;
				}
			case 2: 
				
				if (opcionqhacer== 2) {
					tareas.put("Poner arbol", true);
					tareas.put("Poner la mesa",true);
					System.out.println("Cual quieres modificar? ");
					cualelimina = sc.nextInt();
					opcionqeliminar = sc.nextInt();
					switch (opcionqeliminar) {
					case 1:
						if (opcionqeliminar == 1) {
								tareas.remove("Poner arbol");
								break;
							}
					case 2:
						if (opcionqeliminar == 2) {
							tareas.remove("Poner la mesa");
							break;
						}
					}
					
					
					PrintWriter pw = new PrintWriter(fichero);
					pw.println(tareas);
				
				}
			}
			System.out.println("Tareas pendientes: ");
			
			tareas.put("Poner arbol", true);
			tareas.put("Poner la mesa",true);

			System.out.println("1- Poner arbol: " + tareas.get("Poner arbol"));
			System.out.println("2- Poner la mesa: " + tareas.get("Poner la mesa"));
			System.out.println();
			PrintWriter pw = new PrintWriter(fichero);
			pw.close();
			
		} catch (Exception e) {
			System.err.println("Problema para abrir el archivo");
		}
	}
}
