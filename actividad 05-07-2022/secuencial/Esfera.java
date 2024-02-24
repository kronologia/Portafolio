/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "ESFERA.java."

import java.io.*;

public class Esfera {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double l;
		double p;
		double r;
		double x;
		x = 0;
		l = 0;
		r = 0;
		p = 3.14;
		System.out.println("Programa que calcule �rea y volumen de una esfera");
		System.out.println("Ingrese radio de la esfera: ");
		r = Double.parseDouble(bufEntrada.readLine());
		x = 4*p*r*r;
		l = (4*p*r*r*r)/3;
		System.out.println("El �rea de la esfera es:"+x);
		System.out.println("El volumen de la esfera es:"+l);
	}


}

