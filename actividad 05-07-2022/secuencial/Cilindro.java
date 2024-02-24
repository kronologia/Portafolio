

public class Cilindro {
	public static void main(String args[]){
		
		double h;
		double l;
		double p;
		double r;
		double x;
		x = 0;
		l = 0;
		r = 0;
		h = 0;
		p = 3.14;
		System.out.println("Programa que calcule area y volumen de un cilindro");
		System.out.println("Ingrese radio de la base: ");
		r = Double.parseDouble(readLine());
		System.out.println("Ingrese altura: ");
		h = Double.parseDouble(readLine());
		x = 2*p*r*(h+r);
		l = p*r*r*h;
		System.out.println("El area del cilindro es:"+x);
		System.out.println("El volumen del cilindro es:"+l);
	


}

    private static String readLine() {
        return null;
    }
}
