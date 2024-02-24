/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "CUBO.java."

import java.io.*;

public class Cubo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int i;
		int l;
		int v;
		int x;
		x = 0;
		l = 0;
		v = 0;
		i = 0;
		System.out.println("Programa que calcule �rea, perimetro y volumen de un cubo");
		System.out.println("Ingrese arista del cubo: ");
		i = Integer.parseInt(bufEntrada.readLine());
		x = 6*(i*i);
		l = 12*i;
		v = i*i*i;
		System.out.println("El �rea del cubo es:"+x);
		System.out.println("El per�metro del cubo es:"+l);
		System.out.println("El volumen del cubo es:"+v);
	}


}

