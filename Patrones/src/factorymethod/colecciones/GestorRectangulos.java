package factorymethod.colecciones;

import java.util.Scanner;

import factorymethod.utilidades.Figura;
import factorymethod.utilidades.Rectangulo;
/**
 * Implementación del método factoría crearFigura en la clase encargada de rectángulos
 * @author Isabel Román
 *
 */
public class GestorRectangulos extends GestorColeccion{
	protected Figura crearFigura(Scanner sc) {
	
		float lado1;
		float lado2;
		String color;
		System.out.println("Introduzca el lado 1\n");
		lado1=sc.nextFloat();
		System.out.println("Introduzca el lado 2 \n");
		lado2=sc.nextFloat();
		System.out.println("Introduzca el color \n");
		color=sc.next();
		
		return new Rectangulo(lado1,lado2,color);
	};
}
