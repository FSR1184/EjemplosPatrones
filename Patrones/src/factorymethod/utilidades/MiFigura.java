/*
 *  @(#)MiFigura.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Implementaci√≥n de la interfaz Figura gen√©rica, para m√©todos
 * comunes, en este caso solamente el m√©todo toString, para mostrar las clases 
 * como interesa.
 *
 * @version 1.0 Marzo 2016
 * @author  Fundamentos de Programacion II
 */
package factorymethod.utilidades;

public abstract class MiFigura implements Figura { 

    /**
     * Sobreescritura del metodo toString, que facilita la depuracion
     * y analisis del codigo.
     *
     * @return la figura como un String, tipo String
     * @see java.lang.Object#toString
     */
        public String toString(){
            int indicepunto=this.getClass().getName().lastIndexOf(".");
	    return this.getClass().getName().substring(indicepunto+1)
                   + " de color " + this.getColor() + "\n"+ "¡rea= "+this.getArea()+"\nPerÌmetro= "+this.getPerimetro()+"\n";
        }
        
   /**
     * Devuelve el ·rea de la figura como un float
     * @return area, tipo float
     */
    abstract public float  getArea();        
    
   /**
     * Devuelve el perÌmetro de la figura como un float
     * @return perimetro, tipo float
     */
    abstract public float getPerimetro();
       
    /**
     * Devuelve el color de la figura como un String
     * @return area, tipo String
     */
    abstract public String getColor();
} 

	
