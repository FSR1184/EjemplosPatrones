/*
 *  @(#)OtroCirculo.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


package factorymethod.utilidades;

/**
 * Descripcion: Implementación de la interfaz Figura para un circulo que se construye 
 *              con el radio y el color de la clase Color, heredando de MiFigura.
 *              Esta clase hereda de MiFigura (que implementa la interface Figura).
 *
 * @version 2.0 Marzo 2020
 * @author  irm
 */
public class OtroCirculo extends MiFigura{ 

    private float radio;
    private float PI = 3.1416f;
    private String color;
      
	
   /**
     * El constructor recibe el radio y el color de la figura, 
     * como un parámetro de tipo String.
     * @param radio tipo float, radio del circulo
     * @param color tipo String
     */
    public OtroCirculo (float radio, String color) { 
        this.radio = radio; 
        this.color = color;  
    }

    /**
     * Implementación del método getArea de la interfaz Figura.
     * @return area, float
     */
    public float getArea() { 
        return (PI*radio*radio); 
    }

    /**
     * Implementación del método getPerimetro de la interfaz Figura.
     * @return perimetro, float
     */
    public float getPerimetro(){
        return 2*PI*radio;
    }

    /**
     * Implementación del método getColor de la interfaz Figura.
     * @return color, String
     */
    public String getColor() { 
        return color;
    }
} 

	
