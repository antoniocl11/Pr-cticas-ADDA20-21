/*
 * ejercicio1.c
 *
 *  Created on: 3 nov. 2020
 *      Author: anton
 */

#include "ejercicio1.h"


void enteros_to_list(list* res, char* txt) {
	//Metodo que le entra una lista de enteros y los parsea por coma y espacio

	iterator it = split_iterable_pchar(txt, ", ");	//declaro el iterator con
													//separador correspondiente
	while(iterable_has_next(&it)) {	//Mientras que el iterador tenga un siguiente elemento...
		char* tk = (char*) iterable_next(&it);	//Char para hacer el parseo de los enteros
		int* e = malloc(sizeof(int));	//cada uno de los enteros del fichero
		int_parse(e, tk);	//int_parse para parsear los enteros
		//int e = int_parse_s(tk);
		list_add(res, e);	//los voy añadiendo a la lista que le meto como parametro
	}

}

list leeFichero1(char * fichero){
	//metodo para leer fichero con iterator
	list ls2 = list_empty(list_type);	//lista de listas vacias que me va a devolver el metodo
	iterator it = file_iterable_pchar(fichero);

	while (iterable_has_next(&it)){	//mientras el iterator tenga un siguiente elemento...
		list ls = list_empty(int_type);	//declaro una lista vacia(será cada una de las lista dentro
										//de la lista de listas)
		char * c = (char*) iterable_next(&it);	//guardo los elementos iterados por it en un char
		enteros_to_list(&ls, c);//llamo al metodo anterior para guardar los elementos en las listas de
								//dentro de la lista de listas
		list_add(&ls2, &ls);	//guardo cada una de las listas dentro de la lista de listas..
	}



	return ls2;
}



list numerosPrimos(list primos){

	list nums2 = list_empty(int_type);
	int i = 0;

	while(i<list_size(&primos)){	//mientras que el valor de la variable iteradora sea menor que
									//el tamaño de la lista de primos del parámetro

		int j = 0;	//variable "secundaria" para recorrer las listas de dentro de la lista de listas
		list ls = *(list*) list_get(&primos, i);//por cada elemento recorrido por i lo obtengo y lo
												//guardo en una lista
		while(j<list_size(&ls)){
			int e = *(int*) list_get(&ls, j);//por cada elemento recorrido por i lo obtengo y lo
											 //guardo en una lista
				if(es_primo(e)){	//si cumple que es primo los voy aañadiendo a la lista resultado 'nums2'
					list_add(&nums2, &e);
				}
		j++;
		}
	i++;
	}

	return nums2;
}
