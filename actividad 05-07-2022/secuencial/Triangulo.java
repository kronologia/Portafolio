/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "TRIANGULO.java."

import java.io.*;

public class Triangulo {

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
		System.out.println("Programa que calcule area, hipotenusa y perimetro de un triangulo rectangulo");
		System.out.println("Ingrese cateto a del triangulo: ");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese cateto b del triangulo: ");
		b = Double.parseDouble(bufEntrada.readLine());
		x = (a*b)/2;
		c = Math.sqrt((a*a)+(b*b));
		l = a+b+c;
		System.out.println("El �rea del triangulo rectangulo es: "+x);
		System.out.println("La hipotenusa del triangulo rectangulo es:"+c);
		System.out.println("El per�metro del triangulo rectangulo es: "+l);
	}


}

