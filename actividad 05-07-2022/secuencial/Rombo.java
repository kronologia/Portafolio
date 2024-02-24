/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "ROMBO.java."

import java.io.*;

public class Rombo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double c;
		double d;
		double l;
		double x;
		x = 0;
		l = 0;
		a = 0;
		c = 0;
		d = 0;
		System.out.println("Programa que calcule area y perimetro de un rombo");
		System.out.println("Ingrese segmento mayor del rombo: ");
		c = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese segmento menor del rombo: ");
		d = Double.parseDouble(bufEntrada.readLine());
		x = (c*d)/2;
		a = Math.sqrt((c*c)/2+((d*d)/2));
		l = a*4;
		System.out.println("El area del rombo es:"+x);
		System.out.println("El lado del rombo es:"+c);
		System.out.println("El perimetro del rombo es:"+l);
	}


}

