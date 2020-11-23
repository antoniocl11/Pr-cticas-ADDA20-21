/*
 * ejercicio3RecursivoNoFinal.c
 *
 *  Created on: 21 nov. 2020
 *      Author: anton
 */


#include "ejercicio3RecursivoNoFinal.h"

long potenciaRecursivoNoFinal1(long a, int n){

	return potenciaRecursivoNoFinal(a, n);
}

long potenciaRecursivoNoFinal(long a, int n){

	long res = 1;

	if(n>0){

		if(n%2==1){
			return potenciaRecursivoNoFinal(a*a, n/2)*a;// (a^n/2)^2*a
		}

		else if(n%2==0){
			return potenciaRecursivoNoFinal(a * a, n / 2);// (a^n/2)^2
		}
	}

	//sino res = 1 (n==0)

	return res;
}
