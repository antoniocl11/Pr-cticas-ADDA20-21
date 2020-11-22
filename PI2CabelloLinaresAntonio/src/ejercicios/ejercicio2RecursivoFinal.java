package ejercicios;

public class ejercicio2RecursivoFinal {

	public static Boolean multiploRecursivo(Integer a, Integer b) {

		if (a < b) {
			return a == 0;// true si a 0

		} else {

			return multiploRecursivo(a - b, b);// llamada recursiva de la funcion realizando la resta de los enteros

		}

	}

}
