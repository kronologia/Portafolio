
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TWK
 */
public class Auto {
    String marca;
    String modelo;
    String anio;
    String Peso;
    String Dimensiones;
    String Frenos;
    String Tcomblt;
    int valor;

public Auto(String marca, String modelo, String anio, String Peso, String Dimensiones, String Frenos, String Tcomblt,int valor){
this.marca=marca;
this.modelo=modelo;
this.anio=anio;
this.Peso=Peso;
this.Dimensiones=Dimensiones;
this.Frenos=Frenos;
this.Tcomblt=Tcomblt;
this.valor=valor;    

}
    


public Auto(){
    this.marca="Peugout";
    this.modelo="Stellar";
    this.anio="2022";
    this.valor=31450000;
}    
    
public Auto(String marca){
    this.marca=marca;
    this.modelo="Coupe";
    this.anio="2019";
    this.valor=3500000;
}

    Auto(String mk, String mo, String an, int va) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

public void encender(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Encendido");
    System.out.println("[1] Avanzar " + "[3] Apagar");
    int a;
    a=sc.nextInt();
    if(a==1){
    acelerar();
    }
    if(a==2){
        
    }
    else{
        apagar();
    }
}

public void apagar(){
    System.out.println("Apagado");
    System.exit(0);
}
        
public void acelerar(){
    System.out.println("Acelerando");
}
        
public void frenar(){
    System.out.println("Frenando");
}
}