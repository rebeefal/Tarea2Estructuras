
package AplicacionPilaProyecto;

public class VaciadorPila<X> {
    
    public VaciadorPila(){}

    public X[] VaciarPila( X[] elementosPila){   
        
        X [] arregloVaciado = (X[]) elementosPila;
        elementosPila = null;   
        
        return elementosPila;
    }
}
