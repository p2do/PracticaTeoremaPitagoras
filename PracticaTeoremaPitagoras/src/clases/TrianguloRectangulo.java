package clases;

public class TrianguloRectangulo {
	double a;
	double b;
	double c;
	
	
	/**
	 *  Crea un triangulo rectangulo de catetos valor 1 y de hipotenusa valor recibido por metodo
	 */
	public TrianguloRectangulo() {
		this.a=1;
		this.b=1;
		this.c=hipotenusa();
	}
	
	/**
	 * 
	 * Crea un triangulo rectangulo con los catetos introducidos por parametros y la hipotenusa por valor recibido por metodo
	 * 
	 * @param a
	 * @param b
	 * @throws IllegalArgumentException
	 */
	public TrianguloRectangulo(double a, double b) throws IllegalArgumentException{
		if (a<=0 || b<=0) {
			throw new IllegalArgumentException("Cateto menor o igual a 0");
		}
		this.a=a;
		this.b=b;
		this.c=hipotenusa();
	}
	
	/**
	 * Muestra el valor del cateto a
	 * @return valor del cateto
	 */
	public double getA() {
		return this.a;
	}
	
	/**
	 * Muestra el valor del cateto b
	 * @return valor del cateto
	 */
	public double getB() {
		return this.b;
	}
	
	/**
	 * Muestra el valor de la hipotenusa c
	 * @return valor de la hipotenusa
	 */
	public double getC() {
		return this.c;
	}
	
	/**
	 * Calcula el area del triangulo
	 * @return valor del area
	 */
	public double area() {
		double area= (this.a*this.b)/2;
		return area;
	}
	
	/**
	 *  Calcula la hipotenusa del triangulo
	 * @return valor de la hipotenusa 
	 */
	public double hipotenusa() {
		double hipotenusa= Math.sqrt(Math.pow(this.a, 2)+Math.pow(this.b, 2));
		double resultado=Math.round(hipotenusa*100)/100;
		return resultado;
	}
	
	/**
	 *  Calcula el perimetro del triangulo
	 * @return valor del perimetro del triangulo
	 */
	public double perimetro() {
		double perimetro=this.a+this.b+this.c;
		return perimetro;
	}
	
	public String toString() {
		String frase= "El cateto 1 es: "+this.a+" el cateto 2 es: "+ this.b+" y la hipotenusa es: "+this.c;
		return frase;
	}
	
}
