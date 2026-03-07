/*
 *  @(#)Circulo.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: ImplementaciÃ³n de la interfaz Figura para un circulo, heredando de MiFigura
 *
 * @version 1.0 Marzo 2016
 * @author  Fundamentos de Programacion II
 */
package factorymethod.utilidades;

public class Circulo extends MiFigura{

	
	private float perimetro;
	private float PI = 3.1416f;
	private String color;
      
    /**
     * El constructor recibe el diametro y el color de la figura, 
     * como un parametro de tipo Color.
     * @param diametro - tipo float, diametro del circulo
     * @param color - tipo Color de java.awt
     * @see java.awt.Color (https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html)
     */
    public Circulo (float perimetro, String color) { 
        this.perimetro = perimetro; 
        this.color = color; 
    }

    /**
     * Implementación del método getArea de la interfaz Figura
     * @return area, float
     */
    public float getArea() { 
    	float diametro=this.perimetro/PI;
        return (PI*diametro*diametro/4f);
    }

    /**
     * Implementación del métodoo getPerimetro de la interfaz Figura
     * @return perimetro, float
     */
    public float getPerimetro(){
        return perimetro;
    }

    /**
     * Implementación del método getColor de la interfaz Figura
     * @return color, String
     */
    public String getColor() { 
        return this.color;
    }
} 

	
