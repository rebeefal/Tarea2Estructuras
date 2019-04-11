
package AplicacionPilaProyecto;

public class AgregadorElementosPila<X> {

    public AgregadorElementosPila(){}
      
    //Método para agregar los elementos a la pila, se invoca cuando el boton Agregar es precionado. 
    
    public void AgregarElementosPilaPush(X numeroAAgregar, int apuntador, X[] elementosPila){  
        elementosPila[apuntador] = numeroAAgregar;
    }
}
