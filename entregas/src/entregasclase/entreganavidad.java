package entregasclase;

import java.io.*;
import java.util.*;
import entregasclase.metodosTareas;

public class entreganavidad {

	public static void main(String[] args) {
		int opcionqhacer;

		metodosTareas tareainc1 = new metodosTareas();

		Date fecha = new Date();
		Scanner sc = new Scanner(System.in);
		
		
		try {
			FileWriter fichero = new FileWriter(
					"C:\\Users\\HP\\git\\repository\\entregas\\src\\entregasclase\\tareas.txt", true);
			PrintWriter pw = new PrintWriter(fichero);
			
			System.out.println("Que desea hacer? ");
			System.out.println("1- Crear una nueva tarea pendiente ");
			System.out.println("2- Leer tareas pendientes ");
			System.out.println("3- Dar por terminada una tarea pendiente ");

			opcionqhacer = sc.nextInt();
			switch (opcionqhacer) { 

			case 1:
				if (opcionqhacer == 1) {
					System.out.println("titulo de la tarea");
					String titulo = sc.next();
					tareainc1.settitulo(titulo);
					tareainc1.setestado(true);
					System.out.println(tareainc1.gettitulo(" ") + "_" + fecha + "_" + tareainc1.getestado(true));
					
					pw.println();
					pw.print(titulo);
					pw.print("_");
					pw.print(fecha);
					pw.print("_");
					pw.print(tareainc1.getestado(false));
					
					break;
				}
			case 2: 
				if (opcionqhacer == 2) {
				
				
				}
			case 3:
				if (opcionqhacer == 3) {
					
				}
			}
			pw.close();
		} catch (Exception e) {
			System.err.println("Problema para abrir el archivo");
		}
	}
}
