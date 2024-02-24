/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "CIRCULO.java."

import java.io.*;

public class circunferencia {

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
		System.out.println("programa que calcular area y perimetro de una circunferencia");
		System.out.println("ingrese el radio de la circunferencia");
		r = Double.parseDouble(bufEntrada.readLine());
		x = p*r*r;
		l = 2*p*r;
		System.out.println("el area de la circunferencia es"+x);
		System.out.println("el perimetro de la circunferencia es"+l);
	}


}

