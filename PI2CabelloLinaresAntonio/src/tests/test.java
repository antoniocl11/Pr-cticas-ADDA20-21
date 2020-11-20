package tests;

import ejercicios.*;

import java.util.ArrayList;
import java.util.List;

import us.lsi.common.Files2;

public class test {

	public static void main(String[] args) {
		
		
		System.out.println("SALIDA EJERCICIO 1");
		
			List<String> file = Files2.linesFromFile("./ficheros/PI2Ej1DatosEntrada.txt");

			for (int i = 0; i < file.size(); i++) {
				String[] sep = file.get(i).split("#");
				String c1 = sep[0].trim();
				String c2 = sep[1].trim();

				System.out.println(c1 + c2 + "\n"+ "1. iterativa(while): "+ ejercicio1Iterativo.cadenasIterativo(c1, c2) +"\n" + "2. Recursiva final: " + ejercicio1RecursivoFinal.cadenasRecursivo(c1, c2)+ "\n");
			}

		System.out.println("\n");
		System.out.println("SALIDA EJERCICIO 2");
		
		
			List<String> lis = new ArrayList<>();
			lis = Files2.linesFromFile("./ficheros/PI2Ej2DatosEntrada.txt");
			Integer i = 0;

		
			while(i<lis.size()) {
				String[] separador = lis.get(i).split(",");
				Integer a = Integer.valueOf(separador[0].trim());
				Integer b = Integer.valueOf(separador[1].trim());
				
				Boolean res = ejercicio2Iterativo.multiploIterativo(a, b);
				Boolean resRec = ejercicio2RecursivoFinal.multiploRecursivo(a, b);
				System.out.println(a + ", " + b);
				System.out.println("1. Interativo: " + res+ "\n" + "2. Recursiva final: " + resRec + "\n");
				
				i++;
			

			}
			
		System.out.println("\n");
		System.out.println("SALIDA EJERCICIO 3");
		
	}
	
}