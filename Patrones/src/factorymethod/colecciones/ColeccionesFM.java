/*
 *  @(#)Colecciones.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

 
package factorymethod.colecciones;

import java.util.Scanner;

/**
 * Descripcion: La clase Colecciones implementa el ejemplo de manejo  
 *              de colecciones, concretamente con un ArrayList.
 *              La interfaz GestorColeccion
 *
 * @version 2.0 Marzo 2020
 * @author  irm
 */
public class ColeccionesFM {
    public static void main (String args[]) {	
     
    	
    	int opcionElegida=0;
    	Scanner sc = new Scanner(System.in);
           
     //   GestorColeccion gestor=new GestorCuadrados();
     //	GestorColeccion gestor=new GestorCirculos();
    	//GestorColeccion gestor=new GestorTriangulos();
    	GestorColeccion gestor=new GestorRectangulos();
  
        while (opcionElegida != 4){
        	
        	System.out.println("Introduce el numero de la opcion que quieras:");
        	System.out.println("1.-	Introducir figura en la colección");
          	System.out.println("2.-	Recorre la coleccion");
           	System.out.println("3.-	Limpiar la lista");
        	System.out.println("4.- Salir");   		
        	
        	opcionElegida = sc.nextInt();
        	switch (opcionElegida){
        	case 1:	
        		gestor.addFigura(sc);
        	    		
        	break;
        	case 2:
        		 gestor.muestraColeccion();
        	break;	
        	case 3:
        		  gestor.limpiaColeccion();
        	break;
            case 5:
        		 System.out.println("Espero verle pronto\n");
        	break;
        	default:
        		System.out.println("Opción no válida\n");
        	break;
        		}      	
        	 	
        }     
        sc.close();
       
}
    
}