package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import us.lsi.common.Files2;


public class ejercicio2Funcional {
	
	
	public static Boolean multiploFuncional(Integer a, Integer b) {
		
		Boolean res = Stream.iterate(a, x->x>=0, x->x-b)
				.anyMatch(x->x.equals(0));
		
		return res;
	}
	
	
	
	
	
	public static void main(String[] args) {
		List<String> lis = new ArrayList<>();
		lis = Files2.linesFromFile("./ficheros/PI2Ej2DatosEntrada.txt");
		int i = 0;

	
		while(i<lis.size()) {
			String[] separador = lis.get(i).split(",");
			Integer a = Integer.valueOf(separador[0].trim());
			Integer b = Integer.valueOf(separador[1].trim());
			
			Boolean res = multiploFuncional(a, b);
			System.out.println("Números: " + a + "," + b);
			System.out.println("Interativo: " + res);
			
			i = i +1;
		}

	}
}
