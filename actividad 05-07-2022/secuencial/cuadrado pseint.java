/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CUADRADO.java."

import java.io.*;

public class cuadrado {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int l;
		int x;
		x = 0;
		l = 0;
		a = 0;
		System.out.println("calcula area y perimetro de un cuadrado");
		System.out.println("ingrese el lado del cuadrado");
		a = Integer.parseInt(bufEntrada.readLine());
		x = a*a;
		l = 4*a;
		System.out.println("el area del cuadrado es"+x);
		System.out.println("el perimetro del cuadrado es"+l);
	}


}

