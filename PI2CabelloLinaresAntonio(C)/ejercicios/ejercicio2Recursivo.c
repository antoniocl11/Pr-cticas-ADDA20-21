/*
 * ejercicio2Recursivo.c
 *
 *  Created on: 17 nov. 2020
 *      Author: anton
 */

#include "ejercicio2Recursivo.h"


bool multiploRecursivo(int a, int b){


	if(a<b){
		return a==0;//true si a 0
	}

	else{
		return multiploRecursivo(a-b, b);//llamada recursiva de la funcion realizando la resta de los enteros

	}
}
