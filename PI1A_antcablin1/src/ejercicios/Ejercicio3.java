package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import us.lsi.common.Files2;
import us.lsi.geometria.Punto2D;
import us.lsi.geometria.Punto2D.Cuadrante;

public class Ejercicio3 {
	
	private static Punto2D separaPunto(String sep) {
		//Método para separar por comas el resultado obtenido.
		String[] sp = sep.split(",");
		String a = sp[0].substring(1);
		String b = sp[1].substring(0, sp[1].length()-1);
		Double x = Double.parseDouble(a.trim());
		Double y = Double.parseDouble(b.trim());
		return Punto2D.create(x,y);
	}
	
	private static List<Punto2D> leeFichero(String fichero){
		//Método para leer el fichero ya separado anteriormente por comas
		List<String> file = Files2.linesFromFile(fichero);
		List<Punto2D> listaPunto = new ArrayList<Punto2D>();
		for(String s: file) {
			listaPunto.add(separaPunto(s));
		}

		return listaPunto;
	}
	
	public static Map<Punto2D.Cuadrante,Double> puntosPorCuadrante(List<Punto2D> lpuntos){		
		Map<Punto2D.Cuadrante, Double> map = new HashMap<>();//Map vacio para almacenar el resultado
		
		Integer i = 0;	//Variable iterador para recorrer cada elemento en la lista de puntos
		Double ac1 = 0.0;//acumulador cuadrante 1
		Double ac2 = 0.0;//acumulador cuadrante 2
		Double ac3 = 0.0;//acumulador cuadrante 3
		Double ac4 = 0.0;//acumulador cuadrante 4
		
		while(i<lpuntos.size()) {	//Mientras que el tamaño del iterador sea menor que el tamaño de la lista:
			if(lpuntos.get(i).getCuadrante()==Cuadrante.PRIMER_CUADRANTE) {	//Si el punto iterado esta en el primer cuadrante
				ac1 += lpuntos.get(i).getX();	//El punto que cumple la condicion junto con los demas que la cumplen los sumo y lo guardo en el acumulador ac1
				map.put(Cuadrante.PRIMER_CUADRANTE, ac1);	//Creo el map del primer cuadrante y la suma de los puntos que se encuentran en el primer cuadrante
			}
			if(lpuntos.get(i).getCuadrante()==Cuadrante.SEGUNDO_CUADRANTE) { //Si el punto iterado esta en el segundo cuadrante
				ac2 += lpuntos.get(i).getX(); //El punto que cumple la condicion junto con los demas que la cumplen los sumo y lo guardo en el acumulador ac2
				map.put(Cuadrante.SEGUNDO_CUADRANTE, ac2); //Creo el map del segundo cuadrante y la suma de los puntos que se encuentran en el segundo cuadrante
			}
			if(lpuntos.get(i).getCuadrante()==Cuadrante.TERCER_CUADRANTE) { //Si el punto iterado esta en el tercer cuadrante
				ac3 += lpuntos.get(i).getX(); //El punto que cumple la condicion junto con los demas que la cumplen los sumo y lo guardo en el acumulador ac3
				map.put(Cuadrante.TERCER_CUADRANTE, ac3); //Creo el map del tercer cuadrante y la suma de los puntos que se encuentran en el tercer cuadrante
			}
			if(lpuntos.get(i).getCuadrante()==Cuadrante.CUARTO_CUADRANTE) { //Si el punto iterado esta en el cuarto cuadrante
				ac4 += lpuntos.get(i).getX(); //El punto que cumple la condicion junto con los demas que la cumplen los sumo y lo guardo en el acumulador ac4
				map.put(Cuadrante.CUARTO_CUADRANTE, ac4); //Creo el map del cuarto cuadrante y la suma de los puntos que se encuentran en el cuarto cuadrante
			}
			
			i++;	//Incremento el iterador
		}
		
		return map;	//Devuelvo el map
		
	}

	public static void main(String[] args) {
		List<Punto2D> listaPuntos = leeFichero("./ficheros/PI1Ej3DatosEntrada.txt");
		
		Map<Punto2D.Cuadrante, Double> expl = puntosPorCuadrante(listaPuntos);
		System.out.println("La salida obtenida es: " + expl);
	}
	
}
