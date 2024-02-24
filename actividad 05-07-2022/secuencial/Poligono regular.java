/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "POLIGONO_REGULAR.java."

import java.io.*;

public class poligono_regular {

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
		System.out.println("Programa que calcule área y perímetro de un poligono regular");
		System.out.println("Ingrese lado del poligono: ");
		b = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese apotema: ");
		a = Integer.parseInt(bufEntrada.readLine());
		l = 6*b;
		x = a*(l/2);
		System.out.println("El área del poligono es:"+x);
		System.out.println("El perímetro del poligono es:"+l);
	}


}

