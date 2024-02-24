
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author TWK
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Auto mov1=new Auto();
        
        Auto mov2=new Auto("Kia","Rio","2022","1090kg","4495mm | 1740mm | 1465mm","Delanteros: Disco | Traseros: Tambor","41 litros",7350000);
        
        Auto mov3=new Auto("MercedesBenz");
        

        
        mov1.marca="Kia";
        mov1.modelo="Rio";
        mov1.anio="2018";
        mov1.valor=5000000;
        
        
        System.out.println(mov1.marca);
        System.out.println(mov1.modelo);
        System.out.println(mov1.anio);
        System.out.println(mov1.valor);
        
        System.out.println("La marca del automovil 1 es: "+mov1.marca);
        System.out.println("El modelo del automovil 1 es: "+mov1.modelo);
        System.out.println("El anio del automovil 1 es: "+mov1.anio);
        System.out.println("El valor marca del automovil 1 es: "+mov1.valor);
        
        
        System.out.println(mov3.marca);
        System.out.println(mov3.modelo);
        System.out.println(mov3.anio);
        System.out.println(mov3.valor);
        
        mov3.encender();
        mov3.apagar();
        mov3.acelerar();
        mov3.frenar();
        
        InputStreamReader st = new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(st);
        
        /* BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));*/
        
        System.out.println("Ingrese la marca del vehiculo ");
        String mk=bf.readLine();
        
        System.out.println("Ingrese el modelo del vehiculo ");
        String mo=bf.readLine();
        
        System.out.println("Ingrese el anio del vehiculo ");
        String an=bf.readLine();
        
        System.out.println("Ingrese el valor del vehiculo ");
        int va=Integer.parseInt(bf.readLine());
        
        
        Auto mov4=new Auto(mk,mo,an,va);

        
        System.out.println("La marca del automovil 1 es: "+mov4.marca);
        System.out.println("El modelo del automovil 1 es: "+mov4.modelo);
        System.out.println("El anio del automovil 1 es: "+mov4.anio);
        System.out.println("El valor marca del automovil 1 es: "+mov4.valor);
    }
    
}
