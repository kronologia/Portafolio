/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CASQUETE_ESFERICO.java."

import java.io.*;

public class casquete_esferico {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double h;
		double l;
		double p;
		double r;
		double x;
		x = 0;
		l = 0;
		r = 0;
		h = 0;
		p = 0;
		System.out.println("Programa que calcule area y volumen de casquete esferico");
		System.out.println("Ingrese radio: ");
		r = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese altura: ");
		h = Double.parseDouble(bufEntrada.readLine());
		x = 2*p*r*h;
		l = (h*h*p*(3*r*h))/3;
		System.out.println("El área del casquete es:"+x);
		System.out.println("El volumen del casquete es:"+l);
	}


}

