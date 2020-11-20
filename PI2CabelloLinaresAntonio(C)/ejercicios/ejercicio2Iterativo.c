/*
 * ejercicio2Iterativo.c
 *
 *  Created on: 17 nov. 2020
 *      Author: anton
 */


#include "ejercicio2Iterativo.h"

bool multiploIterativo(int a, int b){

	bool res = true;

	while(a>0){
		a=a-b;

		if(a>0 && a<b){
			res = false;
		}
	}
	return res;
}
