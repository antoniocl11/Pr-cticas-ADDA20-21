/*
 * ejercicio3Recursivo.c
 *
 *  Created on: 21 nov. 2020
 *      Author: anton
 */


#include "ejercicio3RecursivoFinal.h"

long potenciaRecursivoFinal1(long a, int n){

	return potenciaRecursivoFinal(a, n ,1);
}

long potenciaRecursivoFinal(long a, int n, long res){

	if(n>0){

		if(n%2==1){
			return potenciaRecursivoFinal(a*a, n/2, res*a);// (a^n/2)^2*a
		}

		else if(n%2==0){
			return potenciaRecursivoFinal(a * a, n / 2, res);// (a^n/2)^2
		}
	}

	//sino res = 1 (n==0)

	return res;
}
