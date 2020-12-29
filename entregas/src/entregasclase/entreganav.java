package entregasclase;
import java.io.*;
import java.util.Scanner;
public class entreganav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] letra= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'}; 
		String tareai;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca la terea a realizar ");
		tareai = sc.next();
		try {
			FileWriter fichero =  new FileWriter ("C:\\Users\\HP\\git\\repository\\entregas\\src\\entregasclase\\tareasacompletar",true);
			
			PrintWriter pw = new PrintWriter(fichero);
			
			pw.println(tareai);
			
			pw.close();
			
	
		} catch (Exception e) {
			System.err.println("Problema para abrir el archivo");
		}
	}

}
