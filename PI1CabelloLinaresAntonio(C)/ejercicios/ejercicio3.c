/*
 * ejercicio1.c
 *
 *  Created on: 2 nov. 2020
 *      Author: anton
 */

#include "ejercicio3.h"


list leeFichero3(char * fichero){
//método para leer fichero usado para el ejercicio 1
	list l = list_empty(punto_type);//en este caso es lista de puntos
	iterator f = file_iterable_pchar(fichero);

	while(iterable_has_next(&f)){
		char * linea = (char *) iterable_next(&f);
		punto e = punto_parse_s(linea);//parseo los puntos
		list_add(&l, &e);

	}
	return l;
}


hash_table ejercicioCuadrantes(list puntos){

	hash_table m = hash_table_empty(int_type, double_type);//declaro el 'map' vacio

	int i = 0;
	//declaro los acumuladores de mi resultado
	double ac1 = 0;
	double ac2 = 0;
	double ac3 = 0;
	double ac4 = 0;

	while(i<puntos.size){
		punto * p = (punto *) list_get(&puntos, i);	//Declaro un tipo punto
		Cuadrante c = punto_cuadrante(p);	//Declaro un tipo cuadrante

		if(c==0){//Si el punto iterado por i en la lista puntos esta en el primer cuadrante
			double x = p->x;//obtengo la coordenada x del primer cuadrante
			ac1 += x;//sumo todos los puntos (coordenadas x) y almaceno en el acumulador
			hash_table_put(&m, &c, &ac1);//guardo resultados en el map con su correpsondiente cuadrante
		}
		if(c==1){//Si el punto iterado por i en la lista puntos esta en el segundo cuadrante
			double x = p->x;//obtengo la coordenada x del segundo cuadrante
			ac2 += x;
			hash_table_put(&m, &c, &ac2);
		}
		if(c==2){//Si el punto iterado por i en la lista puntos esta en el tercer cuadrante
			double x = p->x;//obtengo la coordenada x del tercer cuadrante
			ac3 += x;
			hash_table_put(&m, &c, &ac3);
		}
		if(c==3){//Si el punto iterado por i en la lista puntos esta en el cuarto cuadrante
			double x = p->x;//obtengo la coordenada x del cuarto cuadrante
			ac4 += x;
			hash_table_put(&m, &c, &ac4);
		}

		i++;
	}

	return m;


}


