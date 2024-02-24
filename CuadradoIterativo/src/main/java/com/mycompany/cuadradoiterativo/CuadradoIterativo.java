/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cuadradoiterativo;

/**
 *
 * @author TWK
 */
import java.util.Scanner;
public class CuadradoIterativo {

    public static void main(String[] args) {
        try(Scanner obj = new Scanner(System.in)){
        int X;
        int L; 
        int a;
        X=0;
        L=0;
        a=0;
        System.out.println("\n");
        System.out.println("Programa que calcula area y perimetro de un cuadrado");
        System.out.println("Ingrese lado a");
        a = obj.nextInt();
        while(a>0){
        X=a*a;
        L=4*a;
        System.out.println("el area del cuadrado es: \n"+X);
        System.out.println("el perimetro del cuadrado es: \n"+L);
        System.out.println("Ingrese lado a");
        a = obj.nextInt();
        }
        }
        
    }
}
