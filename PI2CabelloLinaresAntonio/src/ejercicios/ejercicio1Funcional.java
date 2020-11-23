package ejercicios;

import java.util.stream.Stream;




public class ejercicio1Funcional {
	
	//misma metodologia que en el ejercicio 3 funcional pero bucle infinito..
	
	public static Integer cadenasFuncional(String cadena1, String cadena2) {
		
		return Stream.iterate(tuplaEj1.initial(cadena1, cadena2), t->true, t->t.next())
				.filter(t->!t.guard())//filtra por los que no cumplan el predicado
				.findFirst()
				.get()
				.posicion;//devuelve la posicion del elemento distinto
	}
	

}
