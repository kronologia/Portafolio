/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author seba_
 */
public class Auto {
    //Atributos de la clase Auto
    String marca;
    String modelo;
    String anio;
    int valor;
    
    
    
    //Constructor del objeto, con parametros de entrada en todos sus atributos
    public Auto(String marca, String modelo, String anio, int valor) {
        /*
        this.attribute
        Mediante el "this." se especifica al programa que se esta accediendo al atributo de la clase
        y no al parametro del mismo nombre que fue creado en el metodo, normalmente su uso mencionado
        se ve cuando el atributo de la clase, con el parametro de entrada ingresado en el constructor
        comparten el mismo nombre.
        */
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.valor = valor;
    }
    
    //Constructor del objeto. Asignando valores directamente dentro del constructor
    public Auto() {
        this.marca="Peugeot";
        this.modelo="stellar";
        this.anio="2021";
        this.valor=31445000;
    }
    
    //Constructor del objeto. Recibiendo un atributo por parametro de entrada, y asignando valor al resto dentro del mismo constructor
    public Auto(String marca) {
        this.marca=marca;
        this.modelo="Coupe";
        this.anio="2019";
        this.valor=3500000;
    } 
    
    //Comportamiento
    
    //Metodo de encendido
    public void encender() {
        System.out.print("Encendiste el auto");
    }
    
    //Metodo de apagado
    public void apagar() {
        
        System.out.print("Apagaste el auto");
    }
    
    //Metodo de partida o acelerado
    public void acelerar() {
       System.out.print("Estas Acelerando el auto");
    }
    
    //Metodo de detencion o frenado
    public void frenar(){
        System.out.print("Frenaste el auto");
    }
}
