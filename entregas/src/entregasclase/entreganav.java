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
		   String tarea1,tarea2,tarea3,tarea4,tarea5;
		   Scanner sc = new Scanner (System.in);
		try {
			FileWriter fichero =  new FileWriter ("C:\\Users\\HP\\git\\repository\\entregas\\src\\entregasclase\\tareasacompletar",true);
			Hashtable tareas  = new Hashtable();
			Hashtable tareascomp = new Hashtable (); 
			
			System.out.println("Ingresar las tareas pendientes (hasta 5)");
			tarea1 = sc.next();
			tarea2 = sc.next();
			tarea3 = sc.next();
			tarea4 = sc.next();
			tarea5 = sc.next();
			
			PrintWriter pw = new PrintWriter(fichero);
			pw.println(tarea1);
			pw.println(tarea2);
			pw.println(tarea3);
			pw.println(tarea4);
			pw.println(tarea5);
			
			System.out.println("Que desea hacer? ");
			System.out.println("1- Crear una nueva tarea pendiente ");
			System.out.println("2- Mostrar las tareas pendientes ");
			System.out.println("3- Dar por terminada una tarea pendiente ");
			
			opcionqhacer = sc.nextInt();
			switch (opcionqhacer){
			
			case 1 : 
				if (opcionqhacer == 1) {
					System.out.println("Indicar la nueva tarea ");
					String tareanueva = sc.next();
					
					tareas.put(tareanueva, true);
					
					pw.println(tareanueva);
					pw.println(fecha);
					
					break;
				}
			case 2: 
				if (opcionqhacer == 2) {
					
					pw.println(tareas);
					pw.println(fecha);
					break;
				}
			case 3: 
				
				if (opcionqhacer== 3) {
					System.out.println("Cual quieres modificar? ");
					System.out.println("1- Poner arbol");
					System.out.println("2- Poner la mesa ");
					System.out.println("3- El ingresado anteriormente");
					opcionqeliminar = sc.nextInt();
					switch (opcionqeliminar) {
					case 1:
						if (opcionqeliminar == 1) {
							
								tareas.remove("Poner arbol");
								tareascomp.put("Poner arbol", true);
								
								pw.println("Tareas aun pendientes ");
								pw.println("----------------------");
								pw.println(tareas);
								pw.println();
								pw.println("Tareas completas ");
								pw.println("------------------");
								pw.println(tareascomp);
								break;
							}
					case 2:
						if (opcionqeliminar == 2) {
							
							tareas.remove("Poner la mesa ");
							
							
							pw.println("Tareas aun pendientes");
							pw.println("-----------------------");
							pw.println(tareas);
							pw.println();
							tareascomp.put("Poner la mesa ", true);
							pw.println("Tareas completas ");
							pw.println("------------------");
							pw.println(tareascomp);
							break;
						}
					case 3:
						if (opcionqeliminar == 3){
							tareas.remove(sc);
						
							pw.println("Tareas aun pendientes");
							pw.println("-----------------------");
							pw.println(tareas);
							pw.println();
							tareascomp.put("Poner la mesa ", true);
							pw.println("Tareas completas ");
							pw.println("------------------");
							pw.println(tareascomp);
							break;
						}
					}
				}
			}
			pw.close();
			
		} catch (Exception e) {
			System.err.println("Problema para abrir el archivo");
		}
	}
}
