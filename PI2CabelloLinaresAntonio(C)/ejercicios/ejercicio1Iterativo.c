/*
 * ejercicio1Iterativo.c
 *
 *  Created on: 19 nov. 2020
 *      Author: anton
 */

#include "ejercicio1Iterativo.h"

int cadenasIterativo(char *cadena1, char *cadena2) {
	//las dos cadenas son del mismo tamaño
	int izquierda = 0;
	int derecha = strlen(cadena1);
	int posicion = 0; //entero que me indicara la posicion
	int it = (izquierda + derecha) / 2; //elemento del medio de la cadena

	while (izquierda <= derecha) {

		//establezco dos tipos de filtros, uno para cuando el elemento del medio
		//es igual en las dos cadenas y otro para cuando es distinto

		if (cadena1[it] == cadena2[it]) {

			if (cadena1[it] != cadena2[it]) {	//si iterando las cadenas por el principio y hacia la izquierda encuentro un caracter distintos(comparando las dos cadenas)
				posicion = it + 1;//obtengo la posicion mas 1 pq empieza a iterar desde 0
				return posicion;
			}

			else {		//sino, vuelvo a repetir la iteracion
				izquierda = it;//se va dividiendo el problema hasta encontrar la solucion
			}

		}

		else if (cadena1[it] != cadena2[it]) {

			if (cadena1[it - 1] == cadena2[it - 1]) {	//si iterando las cadenas por el principio y hacia la izquierda encuentro un caracter distintos(comparando las dos cadenas)
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
