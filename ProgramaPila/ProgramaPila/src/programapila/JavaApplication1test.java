/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapila;

import javax.swing.JFrame;


public class ProgramaPila extends JFrame {

    private javax.swing.JButton agregaNumeroButton;
    private javax.swing.JButton estadoVacioLlenoButton;
    private javax.swing.JButton extraerValorButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton mostrarElementosButton;
    private javax.swing.JLabel numeroAAgregarLabel;
    private javax.swing.JTextField numeroAAgregarTextField;
    private javax.swing.JTextField posicionTextField;
    private javax.swing.JButton tamanoActualButton;
    private javax.swing.JLabel tamanoDeseadoLabel;
    private javax.swing.JTextField tamanoDeseadoTextField;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JButton vaciarButton;
    
    
    public ProgramaPila() {
       
        tamanoDeseadoLabel = new javax.swing.JLabel();
        numeroAAgregarLabel = new javax.swing.JLabel();
        agregaNumeroButton = new javax.swing.JButton();
        numeroAAgregarTextField = new javax.swing.JTextField();
        tamanoDeseadoTextField = new javax.swing.JTextField();
        tamanoActualButton = new javax.swing.JButton();
        estadoVacioLlenoButton = new javax.swing.JButton();
        vaciarButton = new javax.swing.JButton();
        mostrarElementosButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        posicionTextField = new javax.swing.JTextField();
        extraerValorButton = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        tamanoDeseadoLabel.setText("Ingrese el tamaño deseado: ");
        numeroAAgregarLabel.setText("Ingrese un numero para agreagar a la pila:");
        agregaNumeroButton.setText("Agreagar");
        numeroAAgregarTextField.setText("numero");
        
        numeroAAgregarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroAAgregarTextFieldActionPerformed(evt);
            }
        });

        tamanoDeseadoTextField.setText("tamaño");
        tamanoActualButton.setText("Tamaño actual");
        estadoVacioLlenoButton.setText("Estado");
        vaciarButton.setText("Vaciar");
        mostrarElementosButton.setText("Mostrar elementos");
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        jLabel1.setText("Ingrese una posicion para extraer su valor");
        posicionTextField.setText("posicion");
        extraerValorButton.setText("Extraer valor");
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

      //  pack();
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
}
    


