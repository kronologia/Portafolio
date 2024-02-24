/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matrices;

/**
 *
 * @author PC
 */
public class Matrices {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        
        matriz[0][0]= 1;
        matriz[0][1]= 2;
        matriz[0][2]= 3;
        matriz[1][0]= 4;
        matriz[1][1]= 5;
        matriz[1][2]= 6;
        matriz[2][0]= 7;
        matriz[2][1]= 8;
        matriz[2][2]= 9;
        
        int[][] matriz2 ={{11, 12, 13},{14, 15, 16},{17,18,19}};
        for(int a = 0; a<matriz.length; a++){
            for(int b = 0; b<matriz.length; b++){
                System.out.print(" "+matriz2[a][b]);
            }
        }
        
    }
}
