/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suma;

/**
 *
 * @author seba_
 */
public class Sumas {
    //Se crean 2 atributos para la clase "Sumas"
    int num1,num2;
    
    //Creacion del constructor
    public Sumas(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //Se crea metodo "sumar" que devuelve un valor de tipo primitivo int
    public int sumar() {
        //El metodo devolvera el resultado de la suma de los valores obtenidos por los getter de num1 y num2
        return getNum1() + getNum2();
        
    }

    //Metodo "getter" para el atributo num1
    public int getNum1() {
        return num1;
    }

    //Metodo "setter" para el atributo num1
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    //Metodo "getter" para el atributo num2
    public int getNum2() {
        return num2;
    }

    //Metodo "setter" para el atributo num2
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
}
