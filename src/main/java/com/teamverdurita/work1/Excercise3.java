/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamverdurita.work1;
    
/**
 *
 * @author KEVIN
 */
public class Excercise3 {


    public static void main(String[] args) {
        String salida = "";
        Matriz matriz1,matriz2,matrizr;
        matriz1 = new Matriz(3,3);
        matriz2 = new Matriz(3,3);
        matrizr = new Matriz(3,3);
        matriz1.setMatriz();
        matriz2.setMatriz();
        salida += "Matriz1\n" + matriz1.toString();
        salida += "Matriz2\n" + matriz2.toString();
        matrizr = matriz1.multiMatrices(matriz2);
        if (matrizr==null){
            salida += "NO ES POSIBLE REALIZAR LA MULTIPLICACION";
        }else{
            salida += "MATRIZ MULTIPLICACION \n" + matrizr.toString();
        }
        System.out.print(salida);
    }

}


