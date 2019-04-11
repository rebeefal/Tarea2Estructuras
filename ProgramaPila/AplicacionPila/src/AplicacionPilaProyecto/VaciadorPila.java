
package AplicacionPilaProyecto;

public class VaciadorPila<X> {
    
    public VaciadorPila(){}

    
    //Método para agregar los elementos a la pila, se invoca cuando el boton Agregar es precionado. 
    public X[] VaciarPila( X[] elementosPila){           
        X [] arregloVaciado = (X[]) elementosPila;
        elementosPila = null;   
        return elementosPila; // devuelve la pila vacia o con el valor null. 
    }
}
