package factorymethod.utilidades;

import java.util.List;

public class MiFabrica implements FabricaFiguras{

    public Figura  creaFigura(List<Number> lados, String color) {
    	Figura nuevaFigura=null;
    	switch (lados.size()){
    	case 1: nuevaFigura=new Circulo(lados.get(0).floatValue(), color);
    	   break;
    	case 2: if(lados.get(0).floatValue()==lados.get(1).floatValue()) {
    		nuevaFigura=new Cuadrado(lados.get(0).floatValue(), color);
    	} else {
    		nuevaFigura=new Rectangulo(lados.get(0).floatValue(),lados.get(1).floatValue(),color);
    	}
    	break;
    	default: nuevaFigura=new Triangulo(lados.get(0).floatValue(),lados.get(1).floatValue(),lados.get(2).floatValue(),color);
    	         if(lados.size()>3) {
    	        	 System.out.println("Se están ignorando "+ (lados.size()-3) + " lados");
    	         }
    	}
    	return nuevaFigura;
    }
}
