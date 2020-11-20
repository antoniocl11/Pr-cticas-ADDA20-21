/*
 * test.h
 *
 *  Created on: 17 nov. 2020
 *      Author: anton
 */

#ifndef TEST_H_
#define TEST_H_

#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

#include "ejercicios/ejercicio1Iterativo.h"
#include "ejercicios/ejercicio1Recursivo.h"
#include "ejercicios/ejercicio2Iterativo.h"
#include "ejercicios/ejercicio2Recursivo.h"

#include "types/iterables.h"
#include "types/list.h"
#include "types/types.h"

int main();

void testEj1(char * file);
void testEj2(char * file);


void parsearLista(list * ls, char * cadena);



#endif /* TEST_H_ */
