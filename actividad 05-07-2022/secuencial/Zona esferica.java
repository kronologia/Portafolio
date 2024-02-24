/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "ZONA_ESFERICA.java."

import java.io.*;

public class zona_esferica {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double h;
		double l;
		double p;
		double r;
		double s;
		double x;
		x = 0;
		l = 0;
		r = 0;
		s = 0;
		h = 0;
		p = 0;
		p = 3.14;
		System.out.println("Programa que calcule área y volumen de zona esferica");
		System.out.println("Ingrese radio mayor: ");
		r = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese radio menor: ");
		s = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese altura: ");
		h = Double.parseDouble(bufEntrada.readLine());
		x = 2*p*r*h;
		l = (p*h*((h*h)+3*(r*r)+3*(s*s)))/6;
		System.out.println("El área de la zona esferica es:"+x);
		System.out.println("El volumen de la zona esferica es:"+l);
	}


}

