
package AplicacionPilaProyecto;

public class MostradorElementosPila<X> {
    

    String elementosDePilaTexto;
    public MostradorElementosPila(){}
    
    
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