import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/** GUI que nos permite modificar el perfil de una facilidad
 * @author a-carrasquillo
 * @author a-rivera
 */
public class Change_Profile_Workplace extends javax.swing.JFrame {

    // data fields
    private String id_admin,id_facilidad, tipo_facilidad;
    // constantes relacionadas a la base de datos
    private final String YourPassWord = "YourPassWord";
    private final String DBUSER = "dbuser";
    
     /**
     * Creates new form change_profile_workplace
     */
    public Change_Profile_Workplace() {
        initComponents();
        this.setLocationRelativeTo(null);
        SpinnerNumberModel spinnButton = new SpinnerNumberModel();
        SpinnerNumberModel spinnButton2 = new SpinnerNumberModel();
        // establece máximos y mínimos para los botones
        spinnButton.setMaximum(200);
        spinnButton.setMinimum(0);
        spinnButton2.setMaximum(200);
        spinnButton2.setMinimum(0);
        cant_doctores.setModel(spinnButton);
        cap_est.setModel(spinnButton2);
    }
    
    /**Constructor especial que nos permite recibir la información
     * requerida para realizar el cambio del perfil 
     * 
     * @param id_admin - id del administrador para no perder su respectiva información
     * @param id_facilidad - id de la facilidad para poder actualizar la información de forma adecuada
     * @param tipo_facilidad - tipo de facilidad médica para saber que tabla actualizar
     */
    public Change_Profile_Workplace(String id_admin, String id_facilidad, String tipo_facilidad) {
        initComponents();
        this.setLocationRelativeTo(null);
        SpinnerNumberModel spinnButton = new SpinnerNumberModel();
        SpinnerNumberModel spinnButton2 = new SpinnerNumberModel();
        // establecer máximos y mínimos a los botones
        spinnButton.setMaximum(200);
        spinnButton.setMinimum(0);
        spinnButton2.setMaximum(200);
        spinnButton2.setMinimum(0);
        // colocar la información en el GUI
        cant_doctores.setModel(spinnButton);
        cap_est.setModel(spinnButton2);
        this.id_admin = id_admin;
        this.id_facilidad = id_facilidad;
        this.tipo_facilidad= tipo_facilidad;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cap_est = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        hora_abre = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        hora_cierra = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        telefono = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        cant_doctores = new javax.swing.JSpinner();
        submit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        planes = new javax.swing.JTextArea();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfil del Lugar de Trabajo");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Capacidad Estacionamiento:");

        cap_est.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Horario de Apertura:");

        hora_abre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        hora_abre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        hora_abre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hora_abreMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Horario de Cierre:");

        hora_cierra.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        hora_cierra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        hora_cierra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hora_cierraMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Planes Aceptados:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Num. Teléfono:");

        telefono.setText("(###)-###-####");
        telefono.setToolTipText("");
        telefono.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Capacidad Doctor:");

        cant_doctores.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        submit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        submit.setText("Aplicar Cambios");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        planes.setColumns(20);
        planes.setRows(5);
        jScrollPane2.setViewportView(planes);

        back.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        back.setText("Volver Atrás");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(hora_cierra, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hora_abre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cant_doctores, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cap_est, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hora_abre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hora_cierra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cap_est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cant_doctores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(back))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // extraer la información del GUI
        String horario_apertura = hora_abre.getSelectedItem().toString();
        String horario_cierre = hora_cierra.getSelectedItem().toString();
        String plan = planes.getText();
        String num_tel = telefono.getText();
        String cap_estacionamiento = cap_est.getValue().toString();
        String cant_doc = cant_doctores.getValue().toString();
        
         Connection coneccion = null;
         PreparedStatement p_statement = null;
         
         try
         {
                   coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedExpress?autoReconnect=true&useSSL=false",DBUSER,YourPassWord);
                   // query para actualizar la información
                   String query = "update " + tipo_facilidad + " set horario_apertura = '"+horario_apertura+"', horario_cierre = '"+ horario_cierre +"', plan = '"+plan+ "', num_tel = '"
                           +num_tel +"', cap_est = "+cap_estacionamiento+", cant_doc = "+cant_doc+" where ID_Facilidad= '"+id_facilidad+"' ";

                   p_statement = coneccion.prepareStatement(query);
                   // actualizar información
                   if((p_statement.executeUpdate()>=0) )
                    {
                        JOptionPane.showMessageDialog(null, "Información Actualizada Correctamente.");
                        this.dispose();
                        // instanciar el GUI del menú principal del administrador
                        AdminUserForm adm = new AdminUserForm(id_admin);
                        adm.setVisible(true);
                    }  
                }catch(SQLException e)
                {
                    /*blank intentionally*/
                 }
                finally
                {
                    try{
                        if(p_statement != null)
                            p_statement.close();
                    } catch(SQLException e) 
                    {
                        /*blank intentionally*/
                    }
                    try{
                        if(coneccion != null)
                            coneccion.close();
                    } catch(SQLException e)
                    {
                        /*blank intentionally*/
                    }
                }
        
    }//GEN-LAST:event_submitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // abrir la página principal del administrador
        AdminUserForm adm = new AdminUserForm(id_admin);
        this.dispose();
        adm.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void hora_abreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hora_abreMouseClicked
        // crear lista de horas
        String time;
        switch (id_facilidad.charAt(0)) {
                case 'E':
                    // sala de emergencia
                    hora_abre.removeAllItems();
                    hora_cierra.removeAllItems();
                    for (int i = 1; i<=24;i++)
                    {
                        time = i + ":00:00";
                        hora_abre.addItem(time);
                        hora_cierra.addItem(time);
                    }
                    break;
                default:
                    //oficina médica
                    hora_abre.removeAllItems();
                    hora_cierra.removeAllItems();
                    for (int i = 8; i<=17;i++)
                    {
                        time = i + ":00:00";
                        hora_abre.addItem(time);
                        hora_cierra.addItem(time);
                    }
                    break;
            }
    }//GEN-LAST:event_hora_abreMouseClicked

    private void hora_cierraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hora_cierraMouseClicked
        // crear lista de horas
        String time;
        switch (id_facilidad.charAt(0)) {
                case 'E':
                    //sala de emergencia
                    hora_abre.removeAllItems();
                    hora_cierra.removeAllItems();
                    for (int i = 1; i<=24;i++)
                    {
                        time = i + ":00:00";
                        hora_abre.addItem(time);
                        hora_cierra.addItem(time);
                    }
                    break;
                default:
                    //oficina médica
                    hora_abre.removeAllItems();
                    hora_cierra.removeAllItems();
                    for (int i = 8; i<=17;i++)
                    {
                        time = i + ":00:00";
                        hora_abre.addItem(time);
                        hora_cierra.addItem(time);
                    }
                    break;
            }
    }//GEN-LAST:event_hora_cierraMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Change_Profile_Workplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change_Profile_Workplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change_Profile_Workplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_Profile_Workplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Change_Profile_Workplace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    protected javax.swing.JSpinner cant_doctores;
    protected javax.swing.JSpinner cap_est;
    protected javax.swing.JComboBox<String> hora_abre;
    protected javax.swing.JComboBox<String> hora_cierra;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTextArea planes;
    private javax.swing.JButton submit;
    protected javax.swing.JFormattedTextField telefono;
    // End of variables declaration//GEN-END:variables
}
