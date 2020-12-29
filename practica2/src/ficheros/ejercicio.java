package ficheros;
import java.io.*;
import java.util.Scanner;
public class ejercicio {

	public static void main(String[] args) {
		String fichero = "C:\\Users\\Dam lucia\\eclipse-workspace\\practica2\\src\\ficheros\\archivo.txt";
		try {
			PrintWriter pw = new PrintWriter(new File (fichero));
			Scanner sc = new Scanner (System.in);
			System.out.println("Tu fecha de cumpleaños");
			String cumpleaños = sc.next();
			pw.print(cumpleaños);
			pw.close();
		} catch (Exception e) {
			System.err.println("Problema para abrir el archivo");
		}

	}
	
}
