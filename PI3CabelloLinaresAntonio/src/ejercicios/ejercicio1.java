package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import us.lsi.common.Files2;
import us.lsi.common.Streams2;

public class ejercicio1 {
	
	
	public static Boolean ejercicio1Recursivo(int[][] matriz, Integer i, Integer j, Boolean matrizEsSubmatriz) {
		 Integer tamanyo = matriz.length;
		 Boolean res = true;
		 
		 //caso base
		 if(matrizEsSubmatriz==true) {
			 res = matriz[i][j] == matriz[i+tamanyo-1][j+tamanyo-1] && matriz[i][j+tamanyo-1] ==  matriz[i+tamanyo-1][j];
			 
			 return res;
		 }
		 else {
			
		 }
	}
	
	
	
	
	
	
	public static List<String> leeFichero1(String fichero){
		return Files2.linesFromFile(fichero);
	}
	
	public static List<int[][]> leeFichero2(String fichero2){
		
		return Files2.linesFromFile(fichero2).stream().map(linea->leeLinea(linea)).collect(Collectors.toList());
	}
	
	public static int[][] leeLinea(String linea){
		
		String[] filas = linea.split(" ");
		int[][] mat = new int[filas.length][filas.length];
		
		List<String> filas1 = new ArrayList<>();
		
		for(int i=0; i<filas.length; i++) {
			filas1.add(filas[i]);
		}
		
		for(int i = 0; i<filas.length; i++) {
			String[] columnas = filas1.get(i).trim().split(" ");
			
			for(int j=0; j<columnas.length; j++) {
				mat[i][j] = Integer.valueOf(columnas[j]);
			}
		}
		
		return mat;
				
	
	}
	
	public static void main(String[] args) {
		
		//System.out.println(leeFichero1("./ficheros/PI3Ej1DatosEntrada1.txt"));
		
		System.out.println(leeFichero2("./ficheros/PI3Ej1DatosEntrada1.txt"));
		
	}
}
