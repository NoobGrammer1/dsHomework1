package com.teamverdurita.work1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author noobgrammer
 */
public class Excercise2 {

    public static void main(String[] args) {
        
        long multEnteros = 1;
        int [] arrayEnteros = new int[21];
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < arrayEnteros.length; i++){
            System.out.print("Ingrese el elemento " + (i + 1) + ":");
            arrayEnteros[i] = entrada.nextInt();
        }

        for(int i = 0; i < arrayEnteros.length; i++){
            if(arrayEnteros[i] > 0){
                multEnteros = arrayEnteros[i] * multEnteros;
            }
        }
        System.out.println("El producto de los elementos positivos es: " + multEnteros);

        sumaValores(arrayEnteros);

        int valorMaximo = arrayEnteros[0];
        int valorMinimo = arrayEnteros[0];

        for(int i = 1; i < arrayEnteros.length; i++){
            if(arrayEnteros[i] > valorMaximo){
                valorMaximo = arrayEnteros[i];
            }
            if(arrayEnteros[i] < valorMinimo){
                valorMinimo = arrayEnteros[i];
            }
        }

        System.out.println("El valor minimo es: " + valorMinimo);
        System.out.println("El valor máximo es: " + valorMaximo);
    }

    public static void sumaValores(int [] array){
        int sumaValores = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                sumaValores = array[i] + sumaValores;
            }
        }
        System.out.println("El suma de los valores del array es: " + sumaValores);
    }

}

