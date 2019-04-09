package AplicacionPilaProyecto;


import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ProgramaPila<X> extends JFrame {

    private javax.swing.JButton tamanoDeseadoButton;
    private javax.swing.JButton agregaNumeroButton;
    private javax.swing.JButton estadoVacioLlenoButton;
    private javax.swing.JButton extraerValorButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    
    
    //variales para el do while del manejo de excepciones 
    int x=1;
    
    // variable apuntador para la posicion de la pila 
     private int apuntador = 0;
     
     
    private X[] elementosPila;
   
    

    public ProgramaPila() {
       
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
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaDeDespliegue = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        posicionTextField = new javax.swing.JTextField(10);
        extraerValorButton = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
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
                    }

                    x=2;
                }while(x!=2); 
            }
        });
     
        tamanoActualButton.setText("Tamaño actual");
        tamanoActualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                do{
                    try {
                        
                        AreaDeDespliegue.setText(String.valueOf(apuntador));
                       
                    }catch (NumberFormatException numberFormatException) {
                        JOptionPane.showMessageDialog(null,
                                "El valor ingresado no es válido");
                    }
                    x=2;
                }while(x!=2); 
            }
        });
        
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
        
     
        vaciarButton.setText("Vaciar");
        vaciarButton.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               do{
                   try {                       
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
               
        jLabel1.setText("Ingrese una posicion para extraer su valor");
        
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
        
        AreaDeDespliegue.setColumns(20);
        AreaDeDespliegue.setRows(5);
        jScrollPane1.setViewportView(AreaDeDespliegue);        
        tituloLabel.setText("Programa Funcionamiento de una Pila");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(posicionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(extraerValorButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numeroAAgregarLabel)
                                    .addComponent(tamanoDeseadoButton)  // linea agregada
                                    .addComponent(tamanoDeseadoLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(numeroAAgregarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        
                                        .addComponent(agregaNumeroButton))
                                    .addComponent(tamanoDeseadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(tituloLabel)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(tituloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanoDeseadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamanoDeseadoButton)  // linea agregada
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(posicionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extraerValorButton))
                .addGap(63, 63, 63))
        );

    }
 
    private void numeroAAgregarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }

     public static void main(String[] args) {    
        ProgramaPila inter = new ProgramaPila();
        inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inter.setSize(800, 580);
        inter.setVisible(true);   
    }
     
    public void setElementosPila( X[] elementosPila){
    this.elementosPila = elementosPila;  
    }
    public X[] getElementosPila(){
        return elementosPila;
    }
     
     
    
}
    


