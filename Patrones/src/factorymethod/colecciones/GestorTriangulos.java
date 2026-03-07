package factorymethod.colecciones;

import java.util.Scanner;

import factorymethod.utilidades.Figura;
import factorymethod.utilidades.Triangulo;
/**
 * Implementación del método factoría crearFigura en la clase encargada de triángulos
 * @author Isabel Román
 *
 */
public class GestorTriangulos extends GestorColeccion{
	protected Figura crearFigura(Scanner sc) {
	
		float lado1;
		float lado2;
		float lado3;
		String color;
		System.out.println("Introduzca el lado 1\n");
		lado1=sc.nextFloat();
		System.out.println("Introduzca el lado 2 \n");
		lado2=sc.nextFloat();
		System.out.println("Introduzca el lado 3 \n");
		lado3=sc.nextFloat();
		System.out.println("Introduzca el color \n");
		color=sc.next();
		//sc.close();
		return new Triangulo(lado1,lado2,lado3,color);
	};
}
