/*
Se tiene un Arreglo de “N” posiciones que almacenará datos enteros positivos (pares e impares) y se desea saber lo siguiente:
         La cantidad de números pares.
         La cantidad de números impares.
         La suma de los números pares.
         La suma de los números impares.
        */
package com.company;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] ArraylistNumeros = new int[5]; // se define el array de n elementos (5)

        int suma_impares = 0, suma_pares = 0; //la suma de los numeros.
        int cant_impares = 0,cant_pares = 0 ;// contador de los numeros.

        System.out.println("llene el arreglo con 5 numeros....");
        for (int i= 0; i <5 ; i++)
        {
            System.out.println((i+1)+" Ingrese un numero:");
            ArraylistNumeros[i] = teclado.nextInt();

            // contador para los numeros impares

            if (ArraylistNumeros[i] % 2 == 0) {  //si es par
                cant_pares++; //aumenta la lista
                suma_pares += ArraylistNumeros [i];
            }
                else{       //sino aumenta los impares
                    cant_impares++;
                    suma_impares += ArraylistNumeros[i];
            }
        }
        /*int pares[] = new  int[cant_pares];
        int impares[]=new  int[cant_impares];
         */
        System.out.println("Numeros impares son *cantidad*:  "+cant_impares);
        System.out.println("Numeros pares son *cantidad*:  "+cant_pares);
        System.out.println("La suma de impares son:"+ suma_impares );
        System.out.println("La suma de pares son:"+ suma_pares );

    }
}
