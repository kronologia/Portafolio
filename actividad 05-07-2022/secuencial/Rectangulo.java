/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "RECTANGULO.java."

import java.io.*;

public class Rectangulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		int l;
		int x;
		x = 0;
		l = 0;
		a = 0;
		b = 0;
		System.out.println("Programa que calcule �rea y per�metro de un rect�ngulo");
		System.out.println("Ingrese lado a del rect�ngulo: ");
		a = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese lado b del rect�ngulo: ");
		b = Integer.parseInt(bufEntrada.readLine());
		x = a*b;
		l = 2*(a+b);
		System.out.println("El �rea del rectangulo es:"+x);
		System.out.println("El per�metro del rectangulo es:"+l);
	}


}

