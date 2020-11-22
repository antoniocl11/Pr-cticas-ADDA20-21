package tests;

import ejercicios.*;

import java.util.ArrayList;
import java.util.List;

import us.lsi.common.Files2;

public class test {

	public static void main(String[] args) {
		
		
		System.out.println("SALIDA EJERCICIO 1");
		
			List<String> file = Files2.linesFromFile("./ficheros/PI2Ej1DatosEntrada.txt");

			for (int i1 = 0; i1 < file.size(); i1++) {
				String[] sep = file.get(i1).split("#");
				String c1 = sep[0].trim();
				String c2 = sep[1].trim();

				System.out.println(c1 +", "+ c2 + "\n"+ "1. iterativa(while): "+ ejercicio1Iterativo.cadenasIterativo(c1, c2) +"\n" + "2. Recursiva final: " + ejercicio1RecursivoFinal.cadenasRecursivo(c1, c2)+ "\n");
			}

		System.out.println("\n");
		System.out.println("SALIDA EJERCICIO 2");
		
		
			List<String> lis = new ArrayList<>();
			lis = Files2.linesFromFile("./ficheros/PI2Ej2DatosEntrada.txt");
			Integer i2 = 0;

		
			while(i2<lis.size()) {
				String[] separador = lis.get(i2).split(",");
				Integer a = Integer.valueOf(separador[0].trim());
				Integer b = Integer.valueOf(separador[1].trim());
				
				Boolean res = ejercicio2Iterativo.multiploIterativo(a, b);
				Boolean resRec = ejercicio2RecursivoFinal.multiploRecursivo(a, b);
				Boolean resFuncional = ejercicio2Funcional.multiploFuncional(a, b);
				System.out.println(a + ", " + b);
				System.out.println("1. Interativo: " + res+ "\n" + "2. Recursiva final: " + resRec + "\n" + "3. Funcional: " + resFuncional + "\n");
				
				i2++;
			

			}
			
		System.out.println("\n");
		System.out.println("SALIDA EJERCICIO 3");
		
		
			List<String> listaN = new ArrayList<>();
			listaN = Files2.linesFromFile("./ficheros/PI2Ej3DatosEntrada.txt");
			Integer i3 = 0;
			while (i3 < listaN.size()) {
				String[] sep = listaN.get(i3).split(",");
				Long a = Long.valueOf(sep[0].trim());
				Integer n = Integer.valueOf(sep[1].trim());
	
				Long res = ejercicio3Iterativo.potenciaIterativo(a, n);
				Long resRec = ejercicio3RecursivoFinal.potenciaRecursivoFinal(a, n);
				Long resRecNF = ejercicio3RecursivoNoFinal.potenciaRecursivoNoFinal1(a, n);
				Long resFuncional = ejercicio3Funcional.potenciaFuncional(a, n);
				
				System.out.println(a+ "," +n);
				System.out.println("1. Interativo (while): " + res+ "\n" + "2. Recursiva no final: " + resRecNF + "\n" + "3. Recursiva final: " + resRec + "\n" + "4. Funcional: " + resFuncional + "\n");
				
				i3++;
			}
	
		
	}
	
}