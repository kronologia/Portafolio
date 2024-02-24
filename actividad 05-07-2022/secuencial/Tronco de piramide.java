/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TRONCO_DE_PIRAMIDE.java."

import java.io.*;
import java.math.*;

public class tronco_de_piramide {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		double h;
		double l;
		double x;
		x = 0;
		l = 0;
		a = 0;
		b = 0;
		c = 0;
		h = 0;
		System.out.println("Programa que calcule area y volumen de tronco de piramide");
		System.out.println("Ingrese arista mayor: ");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese arista menor: ");
		b = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese apotema: ");
		c = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese altura: ");
		h = Double.parseDouble(bufEntrada.readLine());
		x = 2*a+2*b+((4*a+4*b)/2)*c;
		l = (h*(2*a+2*b+Math.sqrt(2*a+2*b)))/3;
		System.out.println("El area del tronco de piramide es:"+x);
		System.out.println("El volumen del tronco de piramide es:"+l);
	}


}

