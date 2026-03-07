package com.javacodegeeks.patterns.builderpattern;
/**
 * Este ejemplo es sencillo, los atributos de los coches son los mismos, simplemente los valores que se asignan son diferentes en función del tipo de coche
 * Pero las diferencias pueden ser más "severas", por ejemplo que las clases de las partes también sean diferentes, de este modo la tarea de construcción difiere más, pero desde fuera sigue siendo igual 
 * @author irm
 *
 */
public class TestBuilderPattern {
    private final static String context="Sports";
	public static void main(String[] args) {
		CarBuilder carBuilder;
		if (context=="Sedan")
			carBuilder = new SedanCarBuilder();
		
		if (context=="Sports") 
			carBuilder = new SportsCarBuilder();
		
		CarDirector director = new CarDirector(carBuilder);
		
		/**
		 * A partir de aquí puede ser necesario instanciar cientos de coches con la configuración adecuada
		 * Cada vez que se necesite uno llamar al director
		 */
		director.build();
		Car car = carBuilder.getCar();
		System.out.println(car);	
		
	}

}
