//Lucia Calabrese Maffei
//en github: https://github.com/lucia816/git_dam/blob/master/entregas/src/entregasclase/entreganavidad.java

package entregasclase;

import java.io.*;
import java.util.*;
import entregasclase.*;
import java.time.*;

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
						"C:\\Users\\Dam lucia\\git\\repository2\\practica2\\src\\entreganav\\tareasacompletar 1", true);
				PrintWriter pw = new PrintWriter(fichero);

				System.out.println("Que desea hacer? ");
				System.out.println("1- Crear una nueva tarea pendiente ");
				System.out.println("2- Leer tareas pendientes ");
				System.out.println("3- Dar por terminada una tarea pendiente ");
				System.out.println("4- Salir del programa");

				opcionqhacer = sc.nextInt();
				sc.nextLine();
				
				switch (opcionqhacer) {

				case 1:
					if (opcionqhacer == 1) {
						System.out.println("titulo de la tarea");
						String titulo = sc.nextLine();
						tareainc1.settitulo(titulo);
						tareainc1.setestado(true);
						System.out.println(tareainc1.gettitulo(" ") + "_" + fecha + "_" + tareainc1.getestado(true));

						pw.println();
						pw.print(titulo);
						pw.print("_");
						pw.print(tareainc1.getestado(false));
						pw.print("_");
						pw.print(fecha);
						tareasincomp.put(titulo, tareainc1.getestado(false));
						System.out.println(tareasincomp);
					}

				case 2:
					if (opcionqhacer == 2) {
						File ficheros = new File(
								"C:\\\\Users\\\\Dam lucia\\\\git\\\\repository2\\\\practica2\\\\src\\\\entreganav\\\\tareasacompletar 1");
						Scanner leer = new Scanner(ficheros);
						while (leer.hasNextLine()) {
							String datos = leer.nextLine();
							System.out.println(datos);
						}
					}
				case 3:
					if (opcionqhacer == 3) {

						System.out.println("Indique el Titulo de la tarea a completar ");
						String tituloacamb = sc.next();

						tareasincomp.get(tituloacamb);
						tareasincomp.remove(tituloacamb);
						tareascomp.put(tituloacamb, true);
						pw.println();
						pw.print("Tareas por completar");
						pw.println(tareasincomp);
						pw.print("Tareas completas");
						pw.println(tareascomp);

					}
				case 4:
					if (opcionqhacer == 4) {
						salir = true;
					}
				}

				pw.close();

			}
		} catch (Exception e) {
			System.err.println("Problema para abrir el archivo");
			e.printStackTrace();
		}
	}
}
