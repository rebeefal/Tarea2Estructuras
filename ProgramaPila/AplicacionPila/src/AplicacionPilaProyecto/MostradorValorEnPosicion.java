
package AplicacionPilaProyecto;


public class MostradorValorEnPosicion<X> {
    
    X elementoEnPosicion;
    public MostradorValorEnPosicion(){}
   
     // Método que lee el valor que se encuetran en una posicion dada en la pila y lo devuelve para ser desplegado.
    // la primera posicion es 0.
    public X MostrarValorEnPosicion( X[] elementosPila, int apuntador, int posicion){
        
        for (int i =0; i < apuntador; i++){   
            if (i == posicion){                
                elementoEnPosicion = elementosPila[i];     
            }
        }
        return elementoEnPosicion;
    }
  
}
