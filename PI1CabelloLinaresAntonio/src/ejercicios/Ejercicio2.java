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
		
	
	public static List<String> leerFichero(String fichero) {
		//Metodo para la lectura del fichero
		List<String> listaN = new ArrayList<>();
		
		try (BufferedReader bf = Files.newBufferedReader(Paths.get(fichero))){	//Creo un objeto bufferedReader al que le paso como 
																				//parametro el String que me entra como parametro al 
																				//metodo --> la direccion del fichero
			
			listaN = bf.lines().collect(Collectors.toList()); //Itero por cada linea del fichero y lo almaceno en la lista listaN
		}
		
		catch(IOException e) {	//Si no hay elementos en el fichero o no se ha encontrado lanzo la excepcion
			e.printStackTrace();//Mostrando la linea donde da se produce la excepcion
		}
		
		return listaN;
	}
	
	public static List<Integer> parseaListaEnteros (List<String> list){
		//Metodo para parsear el fichero leído, ya que nos entra tal que --> Limite: 23
		//y tenemos que quedarnos con el entero que marcaran los limites para el calculo del algoritmo.
		
		List<Integer> listaEnt = new ArrayList<>();	//Creo la lista donde voy a almacenar los enteros
		Integer res = 0;	//varaible resultado
		Integer i =0;		//variable iteradora
		while(i<list.size()) {	//mientras el valor del iterador sea menor que el tamaño de la lista sigo...
			String[] sep = list.get(i).split(":");	//Declaro el separador para :
			res = Integer.parseInt(sep[1].strip()); //sep[1] me leera solo los numeros(y no la palabra limite) y con strip 
													//evito los espacios en blanco
			
			listaEnt.add(res);	//añado los numeros primos a la lista
			
		i++;
		}
		
		return listaEnt;
	}
	
	
	public static String cuadradosPrimos(Integer limit){
		
		String res = "";	//String que devolveremos
		Integer ac = null;			//Variable para acumular resultados
		Integer i = 2;		//Variable iteradora, empezaremos a iterar a partir de 2 hasta el limite
		while(i<=limit){	//mientras que la variable iteradora sea menor o igual que el limite
				
			ac = (i*i);//Calculamos su cuadrado			
			res +=	ac.toString()+"\n";	//Paso el entero a cadena de caracteres	
			i = Math2.siguientePrimo(i);//Iteramos con el siguiente primo
		
		}

		return res;
	}
	
	public static void main(String[] args) {
		List<String> cadena = leerFichero("./ficheros/PI1Ej2DatosEntrada.txt");
		List<Integer> enteros = parseaListaEnteros(cadena);
		
		Integer limit = 0;	//Declaro el limite
		
		for(int i=0; i<enteros.size(); i++) {	//voy iterando la lista de enteros
			limit = enteros.get(i);	//Obtengo cada elemento de la lista
			System.out.println("Límite: " + limit + ":");	//Imprimo los limites por pantalla
			String e = cuadradosPrimos(limit);	//Invoco al metodo para calcular los primos del fichero
			System.out.println(e);	//Y los imprimo
			System.out.println("========================================");
			
			
		}

	}
}
