/*
 *  @(#)Cuadrado.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

/**
 * Descripcion: ImplementaciÃ³n de la interfaz Figura para un cuadrado,
 * heredando de MiFigura
 *
 * @version 1.0 Marzo 2016
 * @author  Fundamentos de Programacion II
 */
package factorymethod.utilidades;

public class Cuadrado extends MiFigura {

    private float lado;
    private String color;

    /**
     * El constructor recibe la longitud de lado y el color de la figura, 
     * como un parametro de tipo Color.
     * @param lado  tipo float, lado del cuadrado
     * @param color tipo Color de java.awt
     * @see java.awt.Color
     * (https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html)
     */
    public Cuadrado (float lado, String color) { 
        this.lado = lado; 
        this.color = color;               
    }

    /**
     * Implementación del método getArea de la interfaz Figura
     * @return area, float
     */

    public float getArea() { 
        return lado*lado;
    }

    /**
     * Implementación del método getPerimetro de la interfaz Figura
     * @return perimetro, float
     */
    public float getPerimetro(){
        return 4*lado;
    }

    /**
     * Implementación del método getColor de la interfaz Figura
     * @return color, String
     */
    public String getColor() { 
        return this.color;
    }
} 

	
