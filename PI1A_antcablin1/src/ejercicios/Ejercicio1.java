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
        List<List<Integer>> texto = new ArrayList<List<Integer>>();

        try {
           BufferedReader bf = new BufferedReader (new FileReader(fichero));
           String linea;


            while((linea = bf.readLine()) != null) {
                List<Integer> li = new ArrayList<Integer>();
                if(linea.length() != 0) {
                  li = Arrays.asList(linea.split(", "))
                          .stream()
                          .map(s->Integer.parseInt(s))
                          .collect(Collectors.toList());
                }
                texto.add(li);
            } bf.close();
        }catch (Exception e) {
            System.err.println("Excepción capturada:" +e);
        }
        return texto;

    }
	
	private static List<Integer> aplana(List<List<Integer>> numeros){
		List<Integer> lis = numeros.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		
		return lis;
		
	}
	
	
	
	
	public static List<Integer> filtraLosPrimos(List<Integer> listas){
		
		List<Integer> nums = new ArrayList<>();
	
		
		Integer i = 1;
		Integer res = 0;
		
		while(i<listas.size()) {
			if(Math2.esPrimo(listas.get(i))==true) {
				res = listas.get(i);
				nums.add(res);
			}
			
			i++;

		}
		return nums;
	}
	

	public static void main(String[] args) {
		List<List<Integer>> numeros = leeFichero("./ficheros/PI1Ej1DatosEntrada.txt");
		List<Integer> aplanados = aplana(numeros);
//		System.out.println(aplanados.size());
		List<Integer> primos = filtraLosPrimos(aplanados);
		System.out.println("La lista de números primos es " + primos);
		
	}
	
}
