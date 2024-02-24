/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
 
package com.mycompany.cuadradosecuencial;

/**
 * @author TWK
 */
import java.util.Scanner;
public class CuadradoSecuencial {

    public static void main(String[] args) {
       try(Scanner obj = new Scanner(System.in)){
           int a;
           int l;
           int x;
           x = 0;
           l = 0;
           a = 0;
           System.out.println("calcula area y perimetro de un cuadrado");
           System.out.println("Ingrese el lado del cuadrado");
           a = obj.nextInt();
           x = a*a;
           l = 4*a;
           System.out.println("el area del cuadrado es: "+x);
           System.out.println("el perimetro del cuadrado es: "+l);
       }
    }
}
