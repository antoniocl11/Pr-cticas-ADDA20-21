/*
 * test.c
 *
 *  Created on: 17 nov. 2020
 *      Author: anton
 */

#include "test.h"

#define msg_logico(x) x==0?"false":"true"

int main(){
	//RESULTADOS EJERCICIO 1



	void testEj1(char * file1){
		printf("SALIDA EJERCICIO 1\n");
			iterator it = file_iterable_pchar(file1);

			while(iterable_has_next(&it)){
				char * linea = (char*) iterable_next(&it);
				list cadenas = list_empty(pchar_type);
				iterator sec = split_iterable_pchar(linea, "#"); //establezco el parseo

				while(iterable_has_next(&sec)){
					char * linea2 = iterable_next(&sec);
					list_add(&cadenas,linea2);
				}

			char * cadena1 = (char*) list_get(&cadenas, 0);
			char * cadena2 = (char*) list_get(&cadenas, 1);
			printf("%s, %s\n1. Iterativo: %d\n2. Recursivo final: %d\n\n",cadena1,cadena2,cadenasIterativo(cadena1, cadena2),cadenasRecursivo(cadena1, cadena2));
			}
	}


	/*------------------------------------------------------------------------------------------------------------------------------------------------------*/

	//RESULTADOS EJERCICIO 2

	void testEj2(char * file2){
		printf("SALIDA EJERCICIO 2\n");
		iterator it = file_iterable_pchar(file2);

		while(iterable_has_next(&it)){
			char * linea = (char*) iterable_next(&it);
			list enteros = list_empty(int_type);
			iterator sec = split_iterable_pchar(linea, ","); //establezco el parseo

			while(iterable_has_next(&sec)){
				char * linea2 = iterable_next(&sec);
				int num = int_parse_s(linea2);
				list_add(&enteros, &num);
			}

		int a = *(int*) list_get(&enteros, 0);
		int b = *(int*) list_get(&enteros, 1);
		printf("%d, %d\n1. Iterativo: %s\n2. Recursivo final: %s\n\n",a,b,msg_logico(multiploIterativo(a,b)), msg_logico(multiploRecursivo(a,b)));

		//1 true 0 false (ARREGLAR)



		}
	}



	/*------------------------------------------------------------------------------------------------------------------------------------------------------*/

	/*------------------------------------------------------------------------------------------------------------------------------------------------------*/



	//LLAMADAS A TESTS

	testEj1("ficheros/PI2Ej1DatosEntrada.txt");
	testEj2("ficheros/PI2Ej2DatosEntrada.txt");
}

