/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "ORTOEDRO.java."

import java.io.*;

public class Ortoedro {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		int c;
		int l;
		int x;
		x = 0;
		l = 0;
		a = 0;
		b = 0;
		c = 0;
		System.out.println("Programa que calcule area y volumen de un ortoedro");
		System.out.println("Ingrese arista a: ");
		a = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese arista b: ");
		b = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese arista c: ");
		c = Integer.parseInt(bufEntrada.readLine());
		x = 2*((a*b)+(a*c)+(b*c));
		l = a*b*c;
		System.out.println("El area del ortoedro es:"+x);
		System.out.println("El volumen del ortoedro es:"+l);
	}


}

