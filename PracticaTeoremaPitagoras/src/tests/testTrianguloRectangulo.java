package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {

	static TrianguloRectangulo t1;
	static TrianguloRectangulo t2;
	
	@BeforeAll
	
	static void setup() {
		t1= new TrianguloRectangulo();
		t2=new TrianguloRectangulo(3,6);
	}
	
	@Test
	void testArea1() {
		double areaObtenida=Math.round(t1.area()*100)/100;
		double areaEsperada=Math.round(0.5*100)/100;
		
		assertEquals(areaEsperada, areaObtenida);
	}

	@Test
	void testArea2() {
		double areaObtenida=Math.round(t2.area()*100)/100;
		double areaEsperada=Math.round(9*100)/100;
		
		assertEquals(areaEsperada, areaObtenida);
	}

	@Test
	void testHipotenusa1() {
		double hipotenusaObtenida=t1.hipotenusa();
		double hipotenusaEsperada=Math.round(1.4142135623731*100)/100;;
		
		assertEquals(hipotenusaEsperada, hipotenusaObtenida);
	}

	@Test
	void testHipotenusa2() {
		double hipotenusaObtenida=t2.hipotenusa();
		double hipotenusaEsperada=Math.round(6.7082039324994*100)/100;
		
		assertEquals(hipotenusaEsperada, hipotenusaObtenida);
	}

	@Test
	void testPerimetro1() {
		double perimetroObtenida=Math.round(t1.perimetro()*100)/100;
		double perimetroEsperado=Math.round(3.4142135623731*100)/100;
		
		assertEquals(perimetroEsperado, perimetroObtenida);
	}
	
	@Test
	void testPerimetro2() {
		double perimetroObtenida=Math.round(t2.perimetro()*100)/100;
		double perimetroEsperado=Math.round(15.708203932499*100)/100;
		
		assertEquals(perimetroEsperado, perimetroObtenida);
	}
	
	@Test
	void testException() {
	
	Exception e = assertThrows(IllegalArgumentException.class,
					() -> new TrianguloRectangulo(1,-2)
				);
	
	String mensajeEsperado="Cateto menor o igual a 0";
	String mensajeObtenido= e.getMessage();
	
	assertEquals(mensajeEsperado, mensajeObtenido);
		
	}

}
