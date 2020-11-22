/*
 * ejercicio3Iterativo.c
 *
 *  Created on: 21 nov. 2020
 *      Author: anton
 */

#include "ejercicio3Iterativo.h"

long potenciaExterno(long a, int n){

//método externo para el calculo de la potencia de un numero
	long res = 1;
	int i = 1;

	while(i<=n){
		res = res *a;
		i++;
	}

	return res;
}

long potenciaIterativo(long a, int n){

	long res=1;
	long res1=0; //ac para a^2

	while(n>0){

		if(n%2==1){
			res = potenciaExterno(a, n / 2);
			res1 = (int) (potenciaExterno(res, 2)*a);//(a^n/2)^2*a
			return res1;

		}

		else if(n%2==0){
			res = potenciaExterno(a, n / 2);
			res1 = (int) potenciaExterno(res, 2);//(a^n/2)^2
			return res1;
		}
	}

	//sino res = 1 (n==0)

	return res;
}
