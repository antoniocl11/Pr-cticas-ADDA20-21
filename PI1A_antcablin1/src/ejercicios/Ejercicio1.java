package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import us.lsi.math.Math2;


public class Ejercicio1 {
	
	
	public static List<List<Integer>> leeFichero(String fichero) {
        
		List<List<Integer>> listaDeL = new ArrayList<List<Integer>>(); //Lista vacia para guardar los elementos que lea el metodo

        try {
           BufferedReader bf = new BufferedReader (new FileReader(fichero));//Invoco al metodo bufferedReader para que lea el 
           																	//texto de una secuencia de entrada de caracteres
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
	
	
	public static List<Integer> filtraLosPrimos(List<List<Integer>> ls){
		List<Integer> nums = new ArrayList<>();	//Declaro la lista donde voy a almacenar los resultados
		Integer i = 0;	//Declaro el iterador
		
		while(i<ls.size()){	//Mientras que el tamaño del iterador sea menor al de la lista sigo...
				ListIterator<Integer> iter = ls.get(i).listIterator();	//Invoco a listIterator para poder "aplanar" las listas
				
				while(iter.hasNext()){	//Mientras que el iterador se siga encontrando con elementos anteriormente no iterados sigo...
					Integer e = iter.next();	//En la variable e voy almacenando los siguientes elementos de la lista
					if(Math2.esPrimo(e)==true)	//Si el elemento iterado cumple la condicion de que es primo
						nums.add(e);	//lo almaceno en mi lista resultado
		        }
		i++;
		}
		
		return nums;
	}
	

	public static void main(String[] args) {
		
		List<List<Integer>> numeros = leeFichero("./ficheros/PI1Ej1DatosEntrada.txt");
		List<Integer> primos = filtraLosPrimos(numeros);
		System.out.println("La lista de números primos es " + primos);
		
	}
	
}
