/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PIRAMIDE_CUADRANGULAR.java."

import java.io.*;

public class piramide_cuadrangular {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		double l;
		double x;
		x = 0;
		l = 0;
		a = 0;
		b = 0;
		c = 0;
		System.out.println("Programa que calcule área y volumen de una piramide cuadrangular");
		System.out.println("Ingrese arista de la base: ");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese apotema: ");
		b = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese altura: ");
		c = Double.parseDouble(bufEntrada.readLine());
		x = 2*(2*b+a);
		l = (a*a*c)/3;
		System.out.println("El área es:"+x);
		System.out.println("El volumen es:"+l);
	}


}

