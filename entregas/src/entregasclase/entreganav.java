package entregasclase;
import java.io.*;
import java.util.Scanner;
public class entreganav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fichero = "C:\\Users\\HP\\git\\repository\\entregas\\src\\entregasclase\\tareasacompletar";
		try {
			FileWriter pw = new FileWriter(new File (fichero),true);
			Scanner sc = new Scanner (System.in);
			System.out.println("Introduce la tarea a realizar ");
			String incomptarea = sc.next();
			pw.write(incomptarea);
			sc.nextLine();
			pw.close();
			
			while (sc.hasNextLine()) {
				String linea = sc.nextLine(); 
				System.out.println(linea);  
			}
		} catch (Exception e) {
			System.err.println("Problema para abrir el archivo");
		}
	}

}
