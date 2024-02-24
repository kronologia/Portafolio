import java.util.Scanner;

public class NumeroEnterosPositivos{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int Numero_uno = 0;
        int Numero_dos = 0;
        int Respaldo = 0;

        System.out.println( "programa que intercambia valores");
        System.out.println("valor del primer dato");
        Numero_uno = scn.nextInt();
        System.out.println("valor del segundo dato");
        Numero_dos = scn.nextInt();
        if(Numero_uno>Numero_dos){
             Respaldo = Numero_uno;
             Numero_uno = Numero_dos;
             Numero_dos = Respaldo;
        }
    }
}