/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vectores;

/**
 *
 * @author PC
 */
public class Vectores {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        /*aqui le estamos diciendo que la primera posicion es igual a uno
        las posiciones empiezan en 0 mientras que el conteo de elementos 
        empieza en uno*/
              /*[0] -> posicion*/ /*1 -> elemento*/
        numeros[0]=1;
        numeros[1]=2;
        numeros[2]=3;
        numeros[3]=4;
        numeros[4]=5;
        //Tambien se puede hacer de esta forma.
        int[] numeros2 = {1,2,3,4,5,6,7,8,9};
        //usamos un for paa indicar el estado inicial y asi recorrer nuestro arreglo
        for(int a=0; a<numeros2.length; a++){
            System.out.println(numeros2[a]);
        }
    }
}
