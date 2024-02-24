/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "PRISMA.java."

import java.io.*;

public class Prisma {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double h;
		double l;
		double x;
		x = 0;
		l = 0;
		a = 0;
		b = 0;
		h = 0;
		System.out.println("Programa que calcule �rea y volumen de prisma regular");
		System.out.println("Ingrese arista de base: ");
		b = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese apotema: ");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese altura: ");
		h = Double.parseDouble(bufEntrada.readLine());
		x = 5*b*(h+a);
		l = h*((5*b*a)/2);
		System.out.println("El �rea del prima es:"+x);
		System.out.println("El volumen del primsa es:"+l);
	}


}

