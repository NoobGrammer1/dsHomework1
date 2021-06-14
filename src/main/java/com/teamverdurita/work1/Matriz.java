/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamverdurita.work1;

import java.util.Random;

/**
 *
 * @author noobgrammer
 */

    /**
 *
 * @author KEVIN
 */
public class Matriz {
      private int matriz[][];

    public Matriz(int N,int M) {
        matriz = new int[N][M];
    }

    public void setMatriz(){
        Random r= new Random();
        for (int i=0; i<this.matriz.length;i++){
            for(int j=0; j<this.matriz[i].length;j++){
                this.matriz[i][j]= r.nextInt(9)+1;
            }
        }
    }

    public Matriz multiMatrices (Matriz b){
    if ((this.matriz[0].length == b.matriz.length )){
        Matriz matrizAB=new Matriz (this.matriz.length,b.matriz[0].length);
        for (int i=0;i<this.matriz.length;i++){
            for (int j=0;j<b.matriz[0].length;j++){
                for (int k=0;k<matriz[0].length;k++){
                    matrizAB.matriz[i][j]+=this.matriz[i][k]*b.matriz[k][j];
                }
            }
        }
        return matrizAB;
 }else{
    return null;
    }
      }
    @Override
    public String toString() {
        String salida="";
        for (int i=0; i<this.matriz.length;i++){
            for (int j=0; j<this.matriz[i].length;j++){
                salida += this.matriz[i][j] + " ";
            }
            salida += "\n";
        }
        return salida;
    }
}


