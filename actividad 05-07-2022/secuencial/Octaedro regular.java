/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "OCTAEDRO_REGULAR.java."

import java.io.*;
import java.math.*;

public class octaedro_regular {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double i;
		double l;
		double x;
		x = 0;
		l = 0;
		i = 0;
		System.out.println("Programa que calcule �rea y volumen de un octaedro regular");
		System.out.println("Ingrese arista: ");
		i = Double.parseDouble(bufEntrada.readLine());
		x = 2*i*i*Math.sqrt(3);
		l = (i*i*i*Math.sqrt(2))/3;
		System.out.println("El �rea de octaedro regular es:"+x);
		System.out.println("El volumen del octaedro regular es:"+l);
	}


}

