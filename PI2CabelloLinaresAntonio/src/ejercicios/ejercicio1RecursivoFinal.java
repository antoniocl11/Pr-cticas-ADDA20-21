package ejercicios;



public class ejercicio1RecursivoFinal {
	
	public static Integer cadenasRecursivo(String cadena1, String cadena2) {
		return cadenasRecursivo(cadena1,cadena2,0,cadena1.length(), 0);
	}
	
	public static Integer cadenasRecursivo(String cadena1, String cadena2, Integer izquierda, Integer derecha, Integer posicion) {
		
		Integer it = (izquierda+derecha)/2; 
		
		
		if(izquierda<=derecha) {
			
			//establezco dos tipos de filtros, uno para cuando el elemento del medio
			//es igual en las dos cadenas y otro para cuando es distinto
			
			if(cadena1.charAt(it)==cadena2.charAt(it)) {
				//Si el elemento del medio es igual voy a buscar el distinto empezando por el medio y yendo para la derecha
				if(cadena1.charAt(it) != cadena2.charAt(it)) { //si iterando las cadenas encuentro un caracter distinto(comparando las dos cadenas)
					
					posicion = it+1; //obtengo la posicion mas 1 pq empieza a iterar desde 0
					return posicion;
				}
				
				else {//sino vuelvo a repetir la iteracion
					return cadenasRecursivo(cadena1, cadena2, it, derecha, 0);//esta linea repite el problema dividiendolo en 2 cada vez mas
				}
			}
			
			else if(cadena1.charAt(it) != cadena2.charAt(it)){
				
				if(cadena1.charAt(it-1) == cadena2.charAt(it-1)) {//si iterando las cadenas encuentro un caracter igual(comparando las dos cadenas)
					posicion = it;
					return posicion;
				}
				
				else {
					return cadenasRecursivo(cadena1, cadena2, izquierda, it, 0);
				}
			}
			
		}
		
		return -1;
	}
	

}

