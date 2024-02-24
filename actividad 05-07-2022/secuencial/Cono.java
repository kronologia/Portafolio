/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "CONO.java."

import java.io.*;

public class Cono {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double g;
		double h;
		double l;
		double p;
		double r;
		double x;
		x = 0;
		l = 0;
		r = 0;
		g = 0;
		h = 0;
		p = 0;
		p = 3.14;
		System.out.println("Programa que calcule �rea y volumen de un cono");
		System.out.println("Ingrese radio de la base: ");
		r = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese altura: ");
		h = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese altura inclinada: ");
		g = Double.parseDouble(bufEntrada.readLine());
		x = p*r*(g+r);
		l = (p*r*r*h)/3;
		System.out.println("El �rea del cono es:"+x);
		System.out.println("El volumen del ocno es:"+l);
	}


}

