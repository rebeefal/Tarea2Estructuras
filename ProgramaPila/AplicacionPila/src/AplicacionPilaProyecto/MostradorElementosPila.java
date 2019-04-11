
package AplicacionPilaProyecto;

public class MostradorElementosPila<X> {
    
    String elementosDePilaTexto;
    
    public MostradorElementosPila(){}

    
    // Método que lee los valores que se encuetran en la pila y los devuelve para ser desplegados. 
    public String mostrarElementos( X[] elementosPila, int apuntador){
        for (int i =0; i < apuntador; i++){          
            if(i==0){
                elementosDePilaTexto = String.valueOf(elementosPila[i]);
            }else{
                elementosDePilaTexto = elementosDePilaTexto + String.valueOf(elementosPila[i]);
            }
        }
        return elementosDePilaTexto;   
    }
    
}