/*
 * tests.c
 *
 *  Created on: 2 nov. 2020
 *      Author: anton
 */

#include "ejercicios/ejercicio1.h"
#include "ejercicios/ejercicio2.h"
#include "ejercicios/ejercicio3.h"


//int main(){
//	char mem[10000];
//	char * c;
//
//
///*EJERCICIO 1*/
//	printf("Resultados Ej1:\n");
//	list enteros = leeFichero1("ficheros/PI1Ej1DatosEntrada.txt");
//	list primos = numerosPrimos(enteros);
//	c = list_tostring(&primos, mem);
//	printf("%s\n", c);
//
//
///*EJERCICIO 2*/
//
//	printf("Resultados Ej2:\n");
//	iterator it = file_iterable_pchar("ficheros/PI1Ej2DatosEntrada.txt");
//
//	while(iterable_has_next(&it)){
//		char * data = iterable_next(&it);
//		iterator nums = split_iterable_pchar(data, "Limite: ");
//		int num = int_parse_s(iterable_next(&nums));
//		string res = cuadradosPrimos(num);
//		printf("Limite: %d\n", num);
//		printf("%s\n" , string_tostring(&res, mem));
//		printf("====================================\n");
//
//	}
//
///*EJERCICIO 3*/
//
//	printf("Resultados Ej3:\n");
//	list puntos = leeFichero3("ficheros/PI1Ej3DatosEntrada.txt");
//	hash_table p = ejercicioCuadrantes(puntos);
//	c = hash_table_tostring(&p, mem);
//	printf("%s\n", c);
//
//	return 0;
//}

