
package AplicacionPilaProyecto;


public class MostradorValorEnPosicion<X> {
    
    X elementoEnPosicion;
    public MostradorValorEnPosicion(){}
   
    public X MostrarValorEnPosicion( X[] elementosPila, int apuntador, int posicion){
        
        for (int i =0; i < apuntador; i++){   
            if (i == posicion){                
                elementoEnPosicion = elementosPila[i];     
            }
        }
        return elementoEnPosicion;
    }
  
}
