package factorymethod.utilidades;


import java.util.List;

public interface FabricaFiguras {
	 
    Figura  creaFigura(List<Number> lados, String color);
}
