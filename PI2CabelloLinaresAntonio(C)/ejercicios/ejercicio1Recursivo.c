/*
 * ejercicio1Recursivo.c
 *
 *  Created on: 19 nov. 2020
 *      Author: anton
 */


#include "ejercicio1Iterativo.h"

int cadenasRecursivo(char * cadena1, char * cadena2){

	return cadenasRecursivo1(cadena1, cadena2, 0, strlen(cadena1), 0);
}


int cadenasRecursivo1(char * cadena1, char * cadena2, int izquierda, int derecha, int posicion){
	//las dos cadenas son del mismo tamaño
	int it = (izquierda+derecha)/2;//elemento del medio de la cadena

		//establezco dos tipos de filtros, uno para cuando el elemento del medio
		//es igual en las dos cadenas y otro para cuando es distinto

		if(cadena1[it] == cadena2[it]){

			if(cadena1[it] != cadena2[it]){//si iterando las cadenas por el principio y hacia la izquierda encuentro un caracter distintos(comparando las dos cadenas)
				posicion = it+1;//obtengo la posicion mas 1 pq empieza a iterar desde 0
				return posicion;
			}

			else{//sino, vuelvo a repetir la iteracion
				return cadenasRecursivo1(cadena1, cadena2, it, derecha, 0);//se va dividiendo el problema hasta encontrar la solucion
			}

		}

		else if(cadena1[it] != cadena2[it]){

			if(cadena1[it-1] == cadena2[it-1]){//si iterando las cadenas por el principio y hacia la izquierda encuentro un caracter distintos(comparando las dos cadenas)
				posicion = it;
				return posicion;
			}

			else{
				return cadenasRecursivo1(cadena1, cadena2, izquierda, it, 0);//se va dividiendo el problema hasta encontrar la solucion
			}

		}


	return -1;

}
