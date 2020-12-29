package entregasclase;
import java.io.*;
import java.util.Scanner;
public class entreganav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fichero = "C:\\Users\\HP\\git\\repository\\entregas\\src\\entregasclase\\tareasacompletar";
		try {
			PrintWriter pw = new PrintWriter(new File (fichero));
			Scanner sc = new Scanner (System.in);
			System.out.println("Introduce la tarea a realizar ");
			String cumpleaños = sc.next();
			pw.print(cumpleaños);
			pw.close();
		} catch (Exception e) {
			System.err.println("Problema para abrir el archivo");
		}
	}

}
