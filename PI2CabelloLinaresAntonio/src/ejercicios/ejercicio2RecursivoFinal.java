package ejercicios;

import java.util.ArrayList;
import java.util.List;

import us.lsi.common.Files2;

public class ejercicio2RecursivoFinal {

	public static Boolean multiploRecursivo(Integer a, Integer b) {

		if (a < b) {
			return a == 0;//true si a 0
			
		} else {

			return multiploRecursivo(a - b, b);//llamada recursiva de la funcion realizando la resta de los enteros

		}

	}

	public static void main(String[] args) {
		List<String> lis = new ArrayList<>();
		lis = Files2.linesFromFile("./ficheros/PI2Ej2DatosEntrada.txt");
		int i = 0;

		while (i < lis.size()) {
			String[] separador = lis.get(i).split(",");
			Integer a = Integer.valueOf(separador[0].trim());
			Integer b = Integer.valueOf(separador[1].trim());

			Boolean res = multiploRecursivo(a, b);
			System.out.println(a + ", " + b);
			System.out.println("Interativo: " + res);

			i = i + 1;
		}

	}
}
