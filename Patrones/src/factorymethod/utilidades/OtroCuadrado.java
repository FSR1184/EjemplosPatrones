/*
 *  Fichero: OtroCuadrado.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


package factorymethod.utilidades;

/**
 * Descripcion: Esta clase representa un cuadrado. La clase hereda de  MiFigura
 *              que implementa la interfaz Figura. 
 *
 * @version 1.0 Marzo 2016
 * @author  Fundamentos de Programacion II
 */
public class OtroCuadrado extends MiFigura { 

    private float lado;
    private String color;
	
    /**
     * El constructor recibe la longitud de lado y el color de la figura, 
     * como un parámetro de tipo String.
     * @param lado tipo float, lado del cuadrado
     * @param color tipo String
     */
    public OtroCuadrado (float lado, String color) { 
        this.lado = lado; 
        this.color = color;
    }

    /**
     * Implementación del método getArea de la interfaz Figura
     * @return area float
     */
    public float getArea() { 
        return lado*lado;
    }

    /**
     * Implementación del método getPerimetro de la interfaz Figura
     * @return perimetro float
     */
    public float getPerimetro(){
        return 4*lado;
    }

    /**
     * Implementación del método getColor de la interfaz Figura
     * @return color, String
     */
    public String getColor() { 
        return color;
    }
} 

	
