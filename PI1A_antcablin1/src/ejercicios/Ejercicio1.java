package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import us.lsi.math.Math2;


public class Ejercicio1 {
	
	
	public static List<List<Integer>> leeFichero(String fichero) {
        
		List<List<Integer>> listaDeL = new ArrayList<List<Integer>>(); //Lista vacia para guardar los elementos que lea el metodo

        try {
           BufferedReader bf = new BufferedReader (new FileReader(fichero));//Invoco al metodo bufferedReader para que lea el texto de una secuencia de entrada de caracteres
           String linea;

            while((linea = bf.readLine()) != null) {	//mientras que siga leyendo lineas del fichero
                List<Integer> li = new ArrayList<Integer>();	//lista vacia para almacenar cada línea
                if(linea.length() != 0) {	//si la linea no esta vacia
                  li = Arrays.asList(linea.split(", "))	//lee cada linea separada por comas y un espacio (segun el fichero)
                          .stream()
                          .map(s->Integer.parseInt(s))	//lo parsea a entero 
                          .collect(Collectors.toList());	//lo guarda en la lista
                }
                listaDeL.add(li);//y lo añade a la lista de listas
            } bf.close();
        }catch (Exception e) {
            System.err.println("Excepción capturada:" +e);
        }
        return listaDeL;

    }
	
	private static List<Integer> aplana(List<List<Integer>> numeros){
		//Metodo para hacer el aplanamiento de la lista de listas
		List<Integer> lis = numeros.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		
		return lis;
		
	}
	
	
	public static List<Integer> filtraLosPrimos(List<Integer> listas){
		
		List<Integer> nums = new ArrayList<>();	//Lista de integer vacia que utilizare para la salida
	
		Integer i = 0;	//vriable que itera sobre cada uno de los elementos de la lista
		Integer res = 0;//varaible acumuladora
		
		while(i<listas.size()) {//mientras que el tamaño del iterador sea menor que el de la lista de entrada..
			if(Math2.esPrimo(listas.get(i))==true) {//si el elemento que estoy iterando es primo 
				res = listas.get(i);	//obtengo el elemento y lo añado al acumulador res
				nums.add(res);//añado el elemento a la lista de salida
			}
			
			i++;//incremento el iterador
		}
		return nums;	//devuelvo la lista
	}
	
//	public static List<Integer> filtraLosPrimos(List<List<Integer>> ls){
//		List<Integer> nums = new ArrayList<>();
//		Integer i = 0;
//		Integer res = 0;
//		
//		while(i<ls.size()) {
//			Iterator<Integer> it = ls.get(i).iterator();
//			while(it.hasNext()) {
//				if(Math2.esPrimo(ls.get(i))==true) {
//					res = ls.get(i);
//					nums.add(res);
//				}
//			
//				i++;
//			}
//		}
//	}
	

	public static void main(String[] args) {
		
		List<List<Integer>> numeros = leeFichero("./ficheros/PI1Ej1DatosEntrada.txt");
		List<Integer> aplanados = aplana(numeros);
		List<Integer> primos = filtraLosPrimos(aplanados);
		System.out.println("La lista de números primos es " + primos);
		
	}
	
}
