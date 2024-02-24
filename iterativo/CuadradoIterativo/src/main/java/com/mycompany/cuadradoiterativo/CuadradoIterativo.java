/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cuadradoiterativo;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class CuadradoIterativo {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int X=0;
        int L=0;
        int a=0;
        X=0;
        L=0;
        a=0;
        System.out.println("\n");
        System.out.println("Programa que calcula area y perimetro de un cuadrado");
        System.out.println("Ingrese lado de cuadrado, 'a' \n");
        sc.nextLine();
        while(a<=20){
        X=a*a;
        L=4*a;
        a=a+2;
        System.out.println("el area del cuadrado es: \n"+X);
        System.out.println("el perimetro del cuadrado es: \n"+L);
        }
        }
    }
}
