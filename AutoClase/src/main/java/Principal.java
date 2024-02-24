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
    public static void main(String[] args) {
        Auto auto1= new Auto();
        
        auto1.marca ="Kia";
        auto1.modelo ="Rio";
        auto1.año="2000";
        auto1.valor =1500;
        
        System.out.println(auto1.marca);
        System.out.println(auto1.modelo);
        System.out.println(auto1.año);
        System.out.println(auto1.valor);
    }
    
}
