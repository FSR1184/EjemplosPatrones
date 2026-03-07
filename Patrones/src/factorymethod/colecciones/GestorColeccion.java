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

import factorymethod.utilidades.Figura;

/**
 * Descripcion: demostración del patrón método factoría
 * El método crearFigura se deja en manos de los ijos.
 * Cada gestor concreto creará figuras del tipo apropiado
 *
 * @version 2.0 Marzo 2020
 * @author  irm
 */
public abstract class GestorColeccion {
	
	protected List<Figura> serieDeFiguras = new ArrayList<Figura>();
	protected abstract Figura crearFigura(Scanner sc);
	
	
	public void addFigura(Scanner sc)
	{
		serieDeFiguras.add(this.crearFigura(sc));
	}
	public void muestraColeccion() {
		 if(serieDeFiguras.isEmpty())
		        System.out.println("NO hay elementos en la coleccion");
		 else {
		   Iterator<Figura> iterador=serieDeFiguras.iterator();
	       while(iterador.hasNext()){
	            System.out.println(iterador.next());
	        }
		 }
		
	}
	public void limpiaColeccion() {
		serieDeFiguras.clear();
	}
    
  
}