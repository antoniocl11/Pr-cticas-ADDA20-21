package ejercicios;

import java.util.stream.Stream;


public class ejercicio3Funcional {
	
	//Para la realizacion de este algoritmo en notacion funcional he
	//creado una clase "tuplaEj3" donde creo un tuple 3 en el
	//que le meto los datos de mi metodo y lo contenido en el while
	//del iterativo para que me itere de igual forma que lo hace
	//en el ejercicio iterativo.
	
	public static long potenciaFuncional(long a, Integer n) {
		
		return Stream.iterate(tuplaEj3.initial(a, n), t->true, t->t.next())
				.filter(t->!t.guard())//filtra por los que no cumplan el predicado
				.findFirst()
				.get()
				.res;//devuelve el resultado de la potencia
	}
	

}
