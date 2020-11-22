package ejercicios;



public class ejercicio1Iterativo {

	public static Integer cadenasIterativo(String cadena1, String cadena2) {
		Integer izquierda = 0;
		Integer derecha = cadena1.length();

		Integer posicion = 0;

		Integer it = (izquierda + derecha) / 2;

		while (izquierda <= derecha) {

			// establezco dos tipos de filtros, uno para cuando el elemento del medio
			// es igual en las dos cadenas y otro para cuando es distinto

			if (cadena1.charAt(it) == cadena2.charAt(it)) {
				// Si el elemento del medio es igual voy a buscar el distinto empezando por el
				// medio y yendo para la derecha
				if (cadena1.charAt(it) != cadena2.charAt(it)) { // si iterando las cadenas por el
																				// principio
																				// encuentro un caracter
																				// distinto(comparando las dos cadenas)

					posicion = it + 1; // obtengo la posicion del elemento por la derecha
					
					return posicion;
				}

				else {// sino vuelvo a repetir la iteracion
					izquierda = it;// esta linea repite el problema dividiendolo en 2 cada vez mas
				}
			}

			else if (cadena1.charAt(it) != cadena2.charAt(it)) {
				//si el elemento que me encuentro en medio es distinto en las dos cadenas, estará en la izquierda (it-1)

				if (cadena1.charAt(it - 1) == cadena2.charAt(it - 1)) {// si iterando las cadenas por el
																						// principio y hacia la
																						// izquierda encuentro un
																						// caracter distintos(comparando
																						// las dos cadenas)
					posicion = it;
					return posicion;
				}

				else {
					derecha = it;
				}
			}

			it = (izquierda + derecha) / 2;

		}

		return -1;

	}


}
