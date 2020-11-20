/*
 * ejercicio1.h
 *
 *  Created on: 3 nov. 2020
 *      Author: anton
 */

#ifndef EJERCICIO1_H_
#define EJERCICIO1_H_


#include "types/iterables.h"
#include "types/list.h"
#include "types/types.h"

void enteros_to_list(list* res, char* txt);
list leeFichero1(char * fichero);
list numerosPrimos(list primos);

#endif /* EJERCICIO1_H_ */
