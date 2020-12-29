package entregasclase;
import java.io.*;
import java.util.Scanner;
public class entreganav {

	public static void main(String[] args) {
		
		String tareainc;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca la terea a realizar ");
		tareainc = sc.next();
		
		try {
			FileWriter fichero =  new FileWriter ("C:\\Users\\HP\\git\\repository\\entregas\\src\\entregasclase\\tareasacompletar",true);
			
			PrintWriter pw = new PrintWriter(fichero);
			pw.println(tareainc);
			pw.close();
		paises.put 
	
		} catch (Exception e) {
			System.err.println("Problema para abrir el archivo");
		}
	}
	public class Hashtable {
	Hashtable paises = new Hashtable();

	}
}
