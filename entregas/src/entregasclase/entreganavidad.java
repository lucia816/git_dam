package entregasclase;

import java.io.*;
import java.text.*;
import java.time.LocalTime;
import java.util.*;
import entregasclase.metodosTareas;

public class entreganavidad {

	public static void main(String[] args) {
		
		int opcionqhacer;
		boolean salir = false;
		Hashtable tareasincomp = new Hashtable();
		Hashtable tareascomp = new Hashtable();
		Date fecha = new Date();

		Scanner sc = new Scanner(System.in);

		metodosTareas tareainc1 = new metodosTareas();

		try {
			while (!salir) {
				FileWriter fichero = new FileWriter(
						"C:\\Users\\HP\\git\\repository\\entregas\\src\\entregasclase\\tareasacompletar 1", true);
				PrintWriter pw = new PrintWriter(fichero);

				System.out.println("Que desea hacer? ");
				System.out.println("1- Crear una nueva tarea pendiente ");
				System.out.println("2- Crear una nueva tarea completa");
				System.out.println("3- Leer tareas pendientes ");
				System.out.println("4- Dar por terminada una tarea pendiente ");
				System.out.println("5- Salir del programa");

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
						pw.print(tareainc1.getestado(false));
						pw.print(fecha);
						tareasincomp.put(titulo, tareainc1.getestado(false));
						System.out.println(tareasincomp);
					}
				case 2: 
					if (opcionqhacer ==2) {
						System.out.println("titulo de la tarea");
						String titulo = sc.next();
						tareainc1.settitulo(titulo);
						tareainc1.setestado(true);
						System.out.println(tareainc1.gettitulo(" ") + "_" + fecha + "_" + tareainc1.getestado(true));

						pw.println();
						pw.print(titulo);
						pw.print(tareainc1.getestado(false));
						pw.print(fecha);
						tareascomp.put(titulo, tareainc1.getestado(true));
						System.out.println(tareascomp);
					}
				case 3:
					if (opcionqhacer == 3) {
						/*File ficheros = new File(
								"C:\\Users\\HP\\git\\repository\\entregas\\src\\entregasclase\\tareasacompletar 1");
						Scanner leer = new Scanner(ficheros);
						/* while (leer.hasNextLine()) {
							String datos = leer.next();
							System.out.println(datos);
						}*/
						System.out.println(tareasincomp);
					}
				case 4:
					if (opcionqhacer == 4) {

						System.out.println("Indique el Titulo de la tarea a completar ");
						String tituloacamb = sc.next();
						
						tareasincomp.get(tituloacamb);
						tareasincomp.remove(tituloacamb);
						tareascomp.put(tituloacamb, true);
						pw.println();
						pw.println (tareasincomp);
						pw.println(tareascomp);

					}
				case 5:
					if (opcionqhacer == 5) {
						salir = true;
					}
				}

				pw.close();

			}
		} catch (Exception e) {
			System.err.println("Problema para abrir el archivo");
		}
	}
}
