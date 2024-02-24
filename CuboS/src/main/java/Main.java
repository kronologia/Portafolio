/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuboS C = new CuboS();
        C.Inicializar();
        C.Instruccion();
        C.Ingresar();
        C.area = C.area(C.lado);
        C.perimetro = C.perimetro(C.lado);
        C.Volumen = C.Volumen(C.lado);
        C.Mostrar();
        
        
    }
    
}
