
package AplicacionPilaProyecto;

public class AgregadorElementosPila<X> {

    public AgregadorElementosPila(){}

    public AgregadorElementosPila(int tamanoDeseado){  
        //elementosPila = (X[]) new Object[tamanoDeseado];  
    }
       
    public void AgregarElementosPilaPush(X numeroAAgregar, int apuntador, X[] elementosPila){  
        elementosPila[apuntador] = numeroAAgregar;
        System.out.print("El arreglo va asi : " + elementosPila[apuntador]);
    }
}
