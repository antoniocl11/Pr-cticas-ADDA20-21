/*
 * ejercicio2.c
 *
 *  Created on: 4 nov. 2020
 *      Author: anton
 */

#include "ejercicio2.h"


string cuadradosPrimos(int limit){
	string res = string_empty();	//declaro el string vacío
	int i = 2;	//iterador i a partir de 2
	int ac = 0;	//variable acumuladora

	while(i<=limit){	//mientras que el tamaño del a variable iteradora
						//que el tamaño del limite que entra como parametro
		char * s = (char*) malloc(13 * sizeof(char));
		//creo un char para almacenar los string
		ac = (i*i);//calculo el cuadrado
		sprintf(s, "%d\n", ac);	//invoco a la funcion sprintf para retornar
								//el numero de caracteres escritos al array..
		string_add_pchar(&res, s);	//añado los char al string
		i = siguiente_primo(i);	//mediante la funcion siguiente_primo voy
								//comprobando si es primo y obtengo el siguiente

	}
	return res;
}
