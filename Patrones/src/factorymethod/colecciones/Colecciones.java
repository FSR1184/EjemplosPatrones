/*
 *  @(#)Colecciones.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

 
package factorymethod.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import factorymethod.utilidades.FabricaFiguras;
import factorymethod.utilidades.Figura;
import factorymethod.utilidades.MiFabrica;

/**
 * Descripcion: La clase Colecciones implementa el ejemplo de manejo  
 *              de colecciones, concretamente con un ArrayList.
 *
 * @version 2.0 Marzo 2020
 * @author  ADRIAN FERNANDEZ ESPINOSA
 * fecha 	14/04/2026
 * uvus 	FSR1184 
 * holaaaa
 */
public class Colecciones {
    public static void main (String args[]) {	
        /*
         * Este ejemplo utiliza una coleccion de tipo ArrayList, 
         * que es una coleccion de la interfaz List.
         */        
    	
    	Scanner sc = new Scanner(System.in);
    	Double lado;
    	int opcionElegida=0;
    	/**
    	 * Instancio un tipo concreto de f�brica, ser� la responsable de construir la figura adecuada
    	 * Recordad que en el ejemplo original (tema de repaso OO) el cliente inclu�a los "new" para las figuras en el propio c�digo, aqu� esa responsabilidad es de la f�brica
    	 */
        FabricaFiguras mifabrica= new MiFabrica();
        List<Number> lados=new ArrayList<Number>();
        
        List<Figura> serieDeFiguras = new ArrayList<Figura>();
  
        while (opcionElegida != 6){
        	System.out.println("Introduce el numero de la opcion que quieras:");
        	System.out.println("1.-	Introducir figura en la colecci�n");
        	System.out.println("2.-	Ver n�mero de figuras en la colecci�n");  
        	System.out.println("3.-	Recorre la coleccion");
        	System.out.println("4.-	Mostrar la coleccion");
        	System.out.println("5.-	Limpiar la lista");
        	System.out.println("6.- Salir");   		
        	opcionElegida = sc.nextInt();
        	switch (opcionElegida){
        	case 1:
        	/**Se discrimina la figura creada a partir del n�mero de lados introducidos: 1, c�rculo, 2 rect�ngulo o cuadrado, 3 tri�ngulo el resto de valores ser�n ignorados**/	
        		do {
        		System.out.println("Introduce lado: (0 para terminar)");
        		lado = sc.nextDouble();
        		if(lado!=0)
        			lados.add(lado);
        		}while(lado!=0);
        		System.out.println("Introduce color:");
        		String color = sc.next();
        		/**
        		 * Uso la f�brica de modo que para este cliente es totalmente transparente el tipo de figura que se est� creando
        		 */
        		serieDeFiguras.add (mifabrica.creaFigura(lados, color));
        		lados.clear();
        	    		
        	break;
        	case 2:
        		 if(serieDeFiguras.isEmpty())
        		        System.out.println("NO hay elementos en la coleccion");
        	     else
        		        System.out.println("SI hay elementos en la coleccion, concretamente "
        	                               + serieDeFiguras.size()+"\n");    
        	break;	
        	case 3:
        		   Iterator<Figura> iterador=serieDeFiguras.iterator();
        	       while(iterador.hasNext()){
        	            System.out.println(iterador.next());
        	        }
        	break;
        	case 4:
        		 System.out.println( serieDeFiguras.toString());

        	     System.out.println( "Numero total de figuras: " + serieDeFiguras.size()); 
        	     System.out.println();
        		 
        	break;
        	case 5:
        		 serieDeFiguras.clear();
        		}
        
        }     
    	sc.close();
}
}