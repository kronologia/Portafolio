/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */

import java.util.Scanner;
public class CuboS {
    int lado;//Variable global
    double area;
    int perimetro; 
    double Volumen;
    
    Scanner sc = new Scanner(System.in);
    
    public void Inicializar(){
    lado = 0; 
    area = 0;
    perimetro = 0;
    Volumen = 0;
    }
    
    public void Instruccion(){
    System.out.println("Programa que calcula area y perimetro y volumen de un cubo");
    }
    
    public void Ingresar(){
        System.out.print("Ingresar valor del lado: ");
        lado=sc.nextInt();
    }
    
    public double area(int lado/*esta es propia del metodo*/){
    double resultado = 0;
    resultado = 6*Math.pow(lado,2);
    return resultado;
    }
    
    public int perimetro(int lado){
    int resultado=0;
    resultado=12*lado;
    return resultado;
    }
    
    public double Volumen(int lado){
            double resultado=0;
            resultado = Math.pow(lado,3);
            return resultado;
            }
            
            public void Mostrar(){
            System.out.println("el valor del area es: "+area);
            System.out.println("el valor del perimetro es: "+perimetro);
            System.out.println("el valor del volumen es: "+Volumen);
            }
    
    }
