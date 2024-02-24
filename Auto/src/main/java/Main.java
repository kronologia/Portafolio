
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author seba_
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * 
     */
    public static void main(String[] args) throws IOException { //IOException para utilizar el BufferReader
        try(Scanner sc = new Scanner(System.in)){
            Main AU = new Main();
            
    //Variables de trabajo del metodo main
        String mk,md,an;
        int va;
        boolean estado = false;
        boolean encender = true;
        boolean acelerar = true;
        boolean frenar = false; 
        boolean apagar = false;
     
        
        mk="";md="";an="";va=0;
        
        //Creacion de un primer objeto auto, sin asignacion de valores desde el objeto
        Auto auto1 = new Auto();
        //Creacion de un segundo objeto auto, asignando valores desde el objeto
        Auto auto2 = new Auto("KIA","Pop","2022",7350000);
        //Creacion de un tercer objeto auto entregando un valor desde el objeto
        Auto auto3 = new Auto("Mercedes-Benz");
        //Creacion de un cuarto objeto, entregando valor haciendo uso de las variables creadas dentro del metodo main
        Auto auto4 = new Auto(mk,md,an,va);
        
        //Entrega valor a los atributos del constructor asociado al objeto 1. Accediendo a la clase a traves del objeto auto1
        auto1.marca="KIA";
        auto1.modelo="Rio";
        auto1.anio="2020";
        auto1.valor=5000000;
        
        //Imprime en consola el valor de los atributos del constructor asociado al objeto auto1
        System.out.println(auto1.marca);
        System.out.println(auto1.modelo);
        System.out.println(auto1.anio);
        System.out.println("$"+auto1.valor);
        System.out.println("\n");
        
        System.out.println("Marca: "+auto1.marca);
        System.out.println("Modelo: "+auto1.modelo);
        System.out.println("Anio: "+auto1.anio);
        System.out.println("Precio: $"+auto1.valor);
        System.out.println("\n");
        
        //Imprime en consola el valor de los atributos del constructor asociado al objeto auto3
        System.out.println(auto3.marca);
        System.out.println(auto3.modelo);
        System.out.println(auto3.anio);
        System.out.println(auto3.valor);
        System.out.println("\n");
        
        //imrpime en consola el valor de los atributos del constructor asociado al objeto auto2
        System.out.println(auto2.marca);
        System.out.println(auto2.modelo);
        System.out.println(auto2.anio);
        System.out.println(auto2.valor);
        System.out.println("\n");
        
        //Accede mediante el objeto auto3 a los metodos de comportamiento de la clase Auto
         System.out.print("encienda el auto: ");
        auto3.encender();
        auto3.acelerar();
        auto3.frenar();
        auto3.apagar();
        
        //Instancia la clase InputStreamReader y BufferReader para leer valores ingresados por teclado en la consola
        InputStreamReader st = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(st);
        /* BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        */
        
        
        //Ingresa los valores por consola a las variables del metodo main que dan valor a los atributos
        //de la clase mediante el objeto auto4
        System.out.print("Ingrese marca: ");
        mk = bf.readLine();
        
        System.out.print("Ingrese modelo: ");
        md=bf.readLine();
        
        System.out.print("Ingrese el anio del vehiculo: ");
        an=bf.readLine();
        
        System.out.print("Ingrese valor del vehiculo: ");
        //Realiza una conversion a tipo primitivo entero sobre un tipo primitivo String leido en consola
        va=Integer.parseInt(bf.readLine());
        
        //Imprime los valores del objeto auto4, accediendo a las variables que guardan su valor
        System.out.println("Marca: "+mk);
        System.out.println("Modelo: "+md);
        System.out.println("Anio: "+an);
        System.out.println("Valor: "+va);
        
    /**
     *
     * @param Ace
     */
    
        
       System.out.println("\t\tModelado de un Auto");
                System.out.println("\t\t\tencender[1]");
                System.out.println("\t\t\tsalir de programa[2]");
                int opcion = sc.nextInt();
                if(opcion == 1){
                    estado = AU.encender();
                }
                while(estado){
                    System.out.println("Acelerar[1]"+acelerar);
                    System.out.println("Frenar[2]"+frenar);
                    System.out.println("Apagar[3]"+apagar);
                    opcion = sc.nextInt();
                    sc.nextLine();
                    switch(opcion){
                        case 1:
                            AU.encender();
                            sc.nextLine();
                           break; 
                        case 2:
                            AU.acelerar();
                           sc.nextLine();
                           break; 
                           case 3:
                            AU.frenar();
                            sc.nextLine();
                           break; 
                           case 4:
                            AU.apagar();
                            sc.nextLine();
                           break; 
                           
                    }
                    
            }
        }
    }

    private boolean encender() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void acelerar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void frenar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void apagar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
    

