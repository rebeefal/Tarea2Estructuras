package AplicacionPilaProyecto;


import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ProgramaPila<X> extends JFrame {
    
    //Declaración de los elementos de la interfaz gráfica.   
    private javax.swing.JButton tamanoDeseadoButton;
    private javax.swing.JButton agregaNumeroButton;
    private javax.swing.JButton estadoVacioLlenoButton;
    private javax.swing.JButton extraerValorButton;
    private javax.swing.JLabel extraerValorLabel;
    private javax.swing.JScrollPane AreaDeDespliegueScrollPane1;
    private javax.swing.JTextArea AreaDeDespliegue;
    private javax.swing.JButton mostrarElementosButton;
    private javax.swing.JLabel numeroAAgregarLabel;
    private javax.swing.JTextField numeroAAgregarTextField;
    private javax.swing.JTextField posicionTextField;
    private javax.swing.JButton tamanoActualButton;
    private javax.swing.JLabel tamanoDeseadoLabel;
    private javax.swing.JTextField tamanoDeseadoTextField;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JButton vaciarButton;
    
    
    //variales para el ciclo do-while del manejo de excepciones 
    int x=1;
    
    // variable apuntador para la posicion de la pila 
    private int apuntador = 0;
     
    //Arreglo de tipo X para alamcenar diferentes elementos en la pila.  
    private X[] elementosPila;

    
    public ProgramaPila() {
    
        
        // creación de objetos de la interfaz gráfica. 
        tamanoDeseadoLabel = new javax.swing.JLabel();
        tamanoDeseadoButton = new javax.swing.JButton();
        numeroAAgregarLabel = new javax.swing.JLabel();
        agregaNumeroButton = new javax.swing.JButton();
        numeroAAgregarTextField = new javax.swing.JTextField(10);
        tamanoDeseadoTextField = new javax.swing.JTextField(10);
        tamanoActualButton = new javax.swing.JButton();
        estadoVacioLlenoButton = new javax.swing.JButton();
        vaciarButton = new javax.swing.JButton();
        mostrarElementosButton = new javax.swing.JButton();
        AreaDeDespliegueScrollPane1 = new javax.swing.JScrollPane();
        AreaDeDespliegue = new javax.swing.JTextArea();
        extraerValorLabel = new javax.swing.JLabel();
        posicionTextField = new javax.swing.JTextField(10);
        extraerValorButton = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        
        // elementos relacionados al tamaño de la pila, el usuario debe ingresar un valor y dar clic en Guardar Tamaño 
        // para crear el arreglo de tipo X del tamaño ingresado.
        tamanoDeseadoLabel.setText("Ingrese el tamaño deseado: ");
        tamanoDeseadoButton.setText("Guardar tamaño");        
        tamanoDeseadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                do{
                    try {                          
                        elementosPila = (X[]) new Object[Integer.parseInt(tamanoDeseadoTextField.getText())];       
                    }catch (NumberFormatException numberFormatException) {
                        JOptionPane.showMessageDialog(null,
                                "El valor ingresado no es válido");
                    }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");
                        apuntador--;
                    }
                    x=2;
                }while(x!=2); 
            }
        });
        
        
        // Elementos relacionado al ingreso de valores a la pila. Al ingrear un valor se debe dar clic en 
        // Agregar para que ese valor se almacene, en caso de alcanzar el límite de espacios en la pila, 
        // el usuario sera notificado por medio del manejor de excepciones. 
        
        numeroAAgregarLabel.setText("Ingrese un numero para agreagar a la pila:");
        agregaNumeroButton.setText("Agregar");
        agregaNumeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                do{
                    try {
                        AgregadorElementosPila agregadorElementosPila = new AgregadorElementosPila();                       
                        agregadorElementosPila.AgregarElementosPilaPush(
                                Integer.parseInt(numeroAAgregarTextField.getText()), 
                                apuntador++, elementosPila);
                        
                    }catch (NumberFormatException numberFormatException) {
                        JOptionPane.showMessageDialog(null,
                                "El valor ingresado no es válido");
                    }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha alcanzado el tamaño del arreglo");
                        apuntador--;
                    }catch (NullPointerException nullPointerException) {
                        JOptionPane.showMessageDialog(null,
                                "Debe guardar el tamaño de la pila antes de agregar valores.");
                        apuntador--;
                    }
                    x=2;
                }while(x!=2); 
            }
        });
     
        
        // Elementos relacionado al tamaño actual de la pila. Si el usuario aun no ingresado todos los valores 
        // que soporta la pila, el tamaño actual sera menor al tamaño deseado. 
        tamanoActualButton.setText("Tamaño actual");
        tamanoActualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                do{
                    try {
                        // Se ha utilizado el valor de apuntador, ya que esta variable maneja la cantidad de elementos en la pila. 
                        AreaDeDespliegue.setText(String.valueOf(apuntador));
                       
                    }catch (NumberFormatException numberFormatException) {
                        JOptionPane.showMessageDialog(null,
                                "El valor ingresado no es válido");
                    }
                    x=2;
                }while(x!=2); 
            }
        });
        
        // Este boton informa al usuario el estado de la pila, las opciones son vacia o no vacia. 
        estadoVacioLlenoButton.setText("Estado");          
        estadoVacioLlenoButton.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               do{
                   try {
                       
                       if (elementosPila == null){
                            AreaDeDespliegue.setText("La pila esta vacia");
                       }else {
                             AreaDeDespliegue.setText("La pila no esta vacia");
                       }  
                   }catch (NumberFormatException numberFormatException) {
                       JOptionPane.showMessageDialog(null,
                               "El valor ingresado no es válido");
                   }
                   x=2;
               }while(x!=2); 
           }
       });       
        
     
        // Elementos relacionados con el vacío de la pila. Al dar clic en este boton, los elementos de la pila se convierten en null. 
        vaciarButton.setText("Vaciar");
        vaciarButton.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               do{
                   try {                       
                       // crea un objeto de la clase VaciadorPila que contiene los métodos para eliminar los datos. 
                       VaciadorPila vaciadorPila = new VaciadorPila();
                       elementosPila = (X[]) vaciadorPila.VaciarPila(elementosPila);
                       AreaDeDespliegue.setText(String.valueOf(elementosPila));
                       apuntador =0;
                       
                   }catch (NumberFormatException numberFormatException) {
                       JOptionPane.showMessageDialog(null,
                               "El valor ingresado no es válido");
                   }catch (NullPointerException nullPointerException) {
                       JOptionPane.showMessageDialog(null,
                               "El tamaño deseado es menor o mayor al numero de elementos ingresado");
                   }

                   x=2;
               }while(x!=2); 
           }
        });      
        
        
        // Elementos para mostrar los elementos que se encuentran actualmente en la pila.
        mostrarElementosButton.setText("Mostrar elementos");
        mostrarElementosButton.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               do{
                   try {
                       
                       MostradorElementosPila mostradorElementosPila = new MostradorElementosPila();
                       AreaDeDespliegue.setText(String.valueOf(mostradorElementosPila.mostrarElementos(elementosPila, apuntador))); 
                   }catch (NumberFormatException numberFormatException) {
                       JOptionPane.showMessageDialog(null,
                               "El valor ingresado no es válido");
                   }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                       JOptionPane.showMessageDialog(null,
                               "El valor apuntador no es correcto");
                   }
                   x=2;
               }while(x!=2); 
           }
        });
               
        
        // Elementos relacionado a la extraccion de un valor en una posicion dada. Al usar un arreglo, se espera que el usuario cuente con la posicion 0. 
        extraerValorLabel.setText("Ingrese una posicion para extraer su valor ('0' es la primera posicion)");       
        extraerValorButton.setText("Extraer valor");
        extraerValorButton.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               do{
                   try {                       
                       MostradorValorEnPosicion mostradorValorEnPosicion = new MostradorValorEnPosicion(); 
                       String texto = (String.valueOf(mostradorValorEnPosicion.MostrarValorEnPosicion(elementosPila, apuntador, Integer.parseInt(posicionTextField.getText()))));                       
                       AreaDeDespliegue.setText(texto);
     
                   }catch (NumberFormatException numberFormatException) {
                       JOptionPane.showMessageDialog(null,
                               "El valor ingresado no es válido");
                   }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                       JOptionPane.showMessageDialog(null,
                               "El valor apuntador no es correcto");
                   }

                   x=2;
               }while(x!=2); 
           }
        });
        
        //En el area de despliegue que van a mostra los resultado provenientes de dar clic en cada boton. 
        AreaDeDespliegue.setColumns(20);
        AreaDeDespliegue.setRows(5);
        AreaDeDespliegueScrollPane1.setViewportView(AreaDeDespliegue);   
        
        // Este atiqueta se ha creado para mostrar el nombre del programa
        tituloLabel.setText("Programa Funcionamiento de una Pila");

        
        // Se crea al panel 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        
        // Se agregan los elementos y se colocan en la posicion horizontal deseada. 
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mostrarElementosButton)
                                    .addComponent(vaciarButton)
                                    .addComponent(estadoVacioLlenoButton)
                                    .addComponent(tamanoActualButton))
                                .addGap(47, 47, 47)
                                .addComponent(AreaDeDespliegueScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(extraerValorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(posicionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(extraerValorButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numeroAAgregarLabel)
                                    .addComponent(tamanoDeseadoLabel))   
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(numeroAAgregarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(agregaNumeroButton)
                                        .addComponent(tamanoDeseadoButton))// linea agregada 
                                    .addComponent(tamanoDeseadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(tituloLabel)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        
        // Se colocan los elementos en la posicion vertical deseada. 
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(tituloLabel)  
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanoDeseadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamanoDeseadoButton)// linea agregada 
                    .addComponent(tamanoDeseadoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAAgregarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)                    
                    .addComponent(agregaNumeroButton)
                    .addComponent(numeroAAgregarLabel))  
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tamanoActualButton)
                        .addGap(18, 18, 18)
                        .addComponent(estadoVacioLlenoButton)
                        .addGap(19, 19, 19)
                        .addComponent(vaciarButton)
                        .addGap(18, 18, 18)
                        .addComponent(mostrarElementosButton))
                    .addComponent(AreaDeDespliegueScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extraerValorLabel)
                    .addComponent(posicionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extraerValorButton))
                .addGap(63, 63, 63))
        );
    }

    // Método principal para ejecutar el programa. 
    public static void main(String[] args) {    
        ProgramaPila inter = new ProgramaPila();
        inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inter.setSize(900, 500);
        inter.setVisible(true);   
    }    
}
    


