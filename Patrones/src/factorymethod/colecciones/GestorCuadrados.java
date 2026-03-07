package factorymethod.colecciones;

import java.util.Scanner;

import factorymethod.utilidades.Cuadrado;
import factorymethod.utilidades.Figura;
/**
 * Implementación del método factoría crearFigura en la clase encargada de cuadrados
 * @author Isabel Román
 *
 */
public class GestorCuadrados extends GestorColeccion{
	protected Figura crearFigura(Scanner sc) {
	
		float lado;
		String color;
		System.out.println("Introduzca el lado \n");
		lado=sc.nextFloat();
		System.out.println("Introduzca el color \n");
		color=sc.next();
	
		return new Cuadrado(lado,color);
	};
}
