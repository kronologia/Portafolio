/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "TRAPECIO.java."

import java.io.*;

public class Trapecio {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		double d;
		double h;
		double l;
		double x;
		x = 0;
		l = 0;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		h = 0;
		System.out.println("Programa que calcule �rea y per�metro de un trapecio");
		System.out.println("Ingrese lado a: ");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese lado b: ");
		b = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese lado c: ");
		c = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese lado d: ");
		d = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese altura: ");
		h = Double.parseDouble(bufEntrada.readLine());
		x = h*((b+d)/2);
		l = a+b+c+d;
		System.out.println("El �rea del trapecio es:"+x);
		System.out.println("El per�metro del trapecio es:"+l);
	}


}

