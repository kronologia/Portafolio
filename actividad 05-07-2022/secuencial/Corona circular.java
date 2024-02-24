/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CORONA_CIRCULAR.java."

import java.io.*;

public class corona_circular {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double lmayor;
		double lmenor;
		double p;
		double rmayor;
		double rmenor;
		double x;
		x = 0;
		lmayor = 0;
		lmenor = 0;
		rmayor = 0;
		rmenor = 0;
		p = 3.14;
		System.out.println("Programa que calcule área, perímetro mayor y perimetro menor de una corona circular");
		System.out.println("Ingrese radio mayor: ");
		rmayor = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese radio menor: ");
		rmenor = Double.parseDouble(bufEntrada.readLine());
		x = p*((rmayor*rmayor)-(rmenor*rmenor));
		lmayor = 2*p*rmayor;
		lmenor = 2*p*rmenor;
		System.out.println("El área de la corona circular es:"+x);
		System.out.println("El perimetro mayor de la corona circular es:"+lmayor);
		System.out.println("El perimetro menor de la corona circular es:"+lmenor);
	}


}

