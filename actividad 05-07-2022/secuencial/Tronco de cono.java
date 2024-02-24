/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TRONCO_DE_CONO.java."

import java.io.*;

public class tronco_de_cono {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double g;
		double h;
		double l;
		double p;
		double r;
		double s;
		double x;
		x = 0;
		l = 0;
		p = 0;
		g = 0;
		s = 0;
		r = 0;
		h = 0;
		p = 3.14;
		System.out.println("Programa que calcule área y volumen de tronco de cono");
		System.out.println("Ingrese radio de la base mayor: ");
		s = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese radio de la base menor: ");
		r = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese altura: ");
		h = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese altura inclinada: ");
		h = Double.parseDouble(bufEntrada.readLine());
		x = p*(g*(s+r)+(s*s)+(r*r));
		l = ((h*p)/3)*((s*s)+(r*r)+s+r);
		System.out.println("El área del tronco de cono es:"+x);
		System.out.println("El volumen del tronco de cono es:"+l);
	}


}

