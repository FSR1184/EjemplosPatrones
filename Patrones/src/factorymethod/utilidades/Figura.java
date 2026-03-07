/**
 *  @(#)Figura.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  Marzo-2016
 *  
 */


package factorymethod.utilidades;


/**
 *  Descripción: interfaz para la gestión de figuras geométricas
 *
 *  @author Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  @since Marzo-2020
 *  @version 2.0
 *  
 */
public interface Figura {  

    /**
     * Devuelve el Ã¡rea de la figura como un float
     * @return area, tipo float
     */
	float getArea();   
    /**
     * Devuelve el perÃ­metro de la figura como un float
     * @return perimetro, tipo float
     */
	float getPerimetro();
    /**
     * Devuelve el color de la figura como un String
     * @return area, tipo String
     */
	String getColor();
	
	
} //Cierre de la interfaz
