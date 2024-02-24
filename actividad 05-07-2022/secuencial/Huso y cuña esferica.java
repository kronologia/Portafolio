/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "HUSO_Y_CUÑA_ESFERICA.java."

import java.io.*;

public class huso_y_cuña_esferica {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double l;
		double n;
		double p;
		double r;
		double x;
		x = 0;
		l = 0;
		r = 0;
		p = 0;
		n = 0;
		p = 3.14;
		System.out.println("Programa que calcule huso y cuña esferica");
		System.out.println("Ingrese radio: ");
		r = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese angulo: ");
		n = Double.parseDouble(bufEntrada.readLine());
		x = (4*p*r*r*n)/360;
		l = (4*p*r*r*r*n)/(3*360);
		System.out.println("El huso esferico es:"+x);
		System.out.println("La cuña esferica es:"+l);
	}


}

