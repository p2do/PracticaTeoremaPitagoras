package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		
		TrianguloRectangulo t1= new TrianguloRectangulo();
		TrianguloRectangulo t2= new TrianguloRectangulo(3,6);
		
		double area1=t1.area();
		double perimetro1=t1.perimetro();
		
		double area2=t2.area();
		double perimetro2=t2.perimetro();
	}

}
