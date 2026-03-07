/*
 *  @(#)Rectangulo.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package factorymethod.utilidades;

/**
 * Descripcion: Implementación de la interfaz Figura para un rectangulo, 
 *              heredando de MiFigura.
 *
 * @version 2.0 Marzo 2020
 * @author  irm
 */
public class Rectangulo extends MiFigura {

    private float base;
    private float altura;
    private String color;
      
   /**
     * El constructor recibe la base y la altura y el color de la figura, 
     * como un parámetro de tipo String.
     *
     * @param base tipo float, base del rectangulo
     * @param altura tipo float, base del rectangulo
     * @param color tipo String
     */
    public Rectangulo (float base, float altura, String color) { 
        this.base = base; 
        this.altura=altura;
        this.color = color;           
    }

   /**
     * Implementación del método getArea de la interfaz Figura
     * @return area, float
     */
    public float getArea() { 
        return base*altura;
    }

   /**
     * Implementación del método getPerimetro de la interfaz Figura
     * @return perimetro, float
     */
    public float getPerimetro(){
        return ((2*base)+(2*altura));
    }

  /**
    * Implementación del método getColor de la interfaz Figura
    * @return color, String
    */
    public String getColor() { 
        return color;
    }
} 

	
