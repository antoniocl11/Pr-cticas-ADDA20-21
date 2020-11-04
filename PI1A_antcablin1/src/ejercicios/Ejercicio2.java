package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import us.lsi.math.Math2;

public class Ejercicio2 {
	
	
//	public static String ejemploN(){
//		Integer limit = 7;
//		return Stream.iterate(2,x->x<=limit,x->Math2.siguientePrimo(x))
//		.map(x->x*x)
//		.map(x->x.toString())
//		.collect(Collectors.joining("\n"));
//		}
	
	
	public static List<String> leerFichero(String fichero) {
		List<String> listaN = new ArrayList<>();
		
		try (BufferedReader bf = Files.newBufferedReader(Paths.get(fichero))){
			listaN = bf.lines().collect(Collectors.toList());
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return listaN;
	}
	
	public static List<Integer> parseaListaEnteros (List<String> list){
		List<Integer> listaEnt = new ArrayList<>();
		Integer res = 0;
		
		for(int i=0; i<list.size(); i++) {
			String[] sep = list.get(i).split(":");
			res = Integer.parseInt(sep[1].strip()); //sep[1] me leera solo los numeros(y no la palabra limite) y con strip evito los espacios en blanco
			listaEnt.add(res);
		}
		
		return listaEnt;
	}
	
	
	public static String cuadradosPrimos(Integer limit){
		
		String res = "";
		Integer ac;
		Integer i = 2;
		while(i<=limit){
			
			if(Math2.esPrimo(i)){
				ac = (i*i);
				res +=	ac.toString()+"\n";
			}
		i++;
		}

		return res;
	}
	
	public static void main(String[] args) {
		List<String> cadena = leerFichero("./ficheros/PI1Ej2DatosEntrada.txt");
		List<Integer> enteros = parseaListaEnteros(cadena);
		
		Integer limit = 0;
		
		for(int i=0; i<enteros.size(); i++) {
			limit = enteros.get(i);
			System.out.println("Límite: " + limit + ":");
			String e = cuadradosPrimos(limit);
			System.out.println(e);
			System.out.println("========================================");
		}
//		String e = cuadradosPrimos();
//		System.out.println(e);
	}
}
