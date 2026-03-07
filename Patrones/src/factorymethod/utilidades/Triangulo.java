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
public class Triangulo extends MiFigura {

    private float lado1;
    private float lado2;
    private float lado3;
    private String color;
      
   /**
     * El constructor recibe la base y la altura y el color de la figura, 
     * como un parámetro de tipo String.
     *
     * @param lado1, lado1 del triángulo
     * @param lado2, lado2 del triángulo
     * @param lado2, lado3 del triángulo
     * @param color tipo String
     */
    public Triangulo (float lado1, float lado2, float lado3, String color) { 
        this.lado1 = lado1; 
        this.lado2 = lado2; 
        this.lado3 = lado3; 
        this.color = color;           
    }

   /**
     * Implementación del método getArea de la interfaz Figura
     * @return area, float
     */
    public float getArea() { 
    	float s;
    	s=(lado1+lado2+lado3)/2f;
    	
        return (float) Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }

   /**
     * Implementación del método getPerimetro de la interfaz Figura
     * @return perimetro, float
     */
    public float getPerimetro(){
        return (lado1+lado2+lado3);
    }

  /**
    * Implementación del método getColor de la interfaz Figura
    * @return color, String
    */
    public String getColor() { 
        return color;
    }
}