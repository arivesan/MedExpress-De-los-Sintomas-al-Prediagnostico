import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**GUI que nos permite ver una lista  de los pacientes que se encuentran en admisión
 *
 * @author a-carrasquillo
 */
public class List_Admission_Patient extends javax.swing.JFrame {
    // data fields
    protected DefaultTableModel model;
    private String id_adm;
    private List<String> id_pacientes;
    // constantes relacionadas a la base de datos
    private final String YOURPASSWORD = "YourPassWord";
    private final String DBUSER = "dbuser";
    
    /**Constructor por defecto
     * Crea un nuevo formulario List_Admission_Patient
     */
    public List_Admission_Patient() {
        initComponents();
        this.setLocationRelativeTo(null);
        // nos permite designar el tipo de modelo de la tabla
        model = new DefaultTableModel();
        // asigna el modelo a la lista de pacientes
        lista_admision.setModel(model);
        // añade las columnas a la tabla
        model.addColumn("Nombre del Paciente");
        model.addColumn("Fecha de Entrada");
        model.addColumn("Hora de Entrada");
        // elimina el mensaje de error por defecto
        error.setText("");
    }
    
    /**Constructor especial
     * 
     * @param id_adm - número de identificación del administrador
     */
    public List_Admission_Patient(String id_adm) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.id_adm = id_adm;
        // nos permite designar el tipo de modelo de la tabla
        model = new DefaultTableModel();
        // asigna el modelo a la lista de pacientes
        lista_admision.setModel(model);
        // añade las columnas a la tabla
        model.addColumn("Nombre del Paciente");
        model.addColumn("Fecha de Entrada");
        model.addColumn("Hora de Entrada");
        // elimina el mensaje de error por defecto
        error.setText("");
    }
    
    /**Método que nos permite modificar la lista de ids de los pacientes
     * 
     * @param id_pacientes - lista de números de identificación de pacientes
     */
    public void setId_Pacientes(List<String> id_pacientes) {
        this.id_pacientes = id_pacientes;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista_admision = new javax.swing.JTable();
        back = new javax.swing.JButton();
        see_info = new javax.swing.JButton();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Admisión");

        lista_admision.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre del Paciente", "Fecha de Entrada", "Hora de Entrada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(lista_admision);

        back.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        back.setText("Volver Atrás");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        see_info.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        see_info.setText("Ver más Información");
        see_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                see_infoActionPerformed(evt);
            }
        });

        error.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error.setText("Mensaje de Error");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(see_info))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                    .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(see_info))
                .addGap(6, 6, 6)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void see_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_see_infoActionPerformed
        // extraer el índice de la fila seleccionada de la tabla
        int fila = lista_admision.getSelectedRow();
        // elimina el mensaje de error por defecto
        error.setText("");
        // verificar si se escogió una fila
        if (fila<0)
        {
            error.setText("Por favor escoger un paciente para ver la información.");
        }
        else
        {
            Connection coneccion = null;
            // crear instancia del GUI que nos permite ver la información del paciente
            Admission_Patient admision = new Admission_Patient();
            try
            {
                coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedExpress?autoReconnect=true&useSSL=false",DBUSER,YOURPASSWORD);
                // query que nos permite obtener la información del paciente
                String query = "select nombre, apellidos, ss, num_tel, buzon_apartado, pueblo, estado, zip_code, carretera_calle, fec_nac, edad, genero, plan from pacientes where id_paciente='"+id_pacientes.get(fila)+"'";
                Statement statement = coneccion.createStatement();
                ResultSet result = statement.executeQuery(query);
                // verificar si hubo un resultado
                while(result.next())
                {
                    // extraer la información del resultado
                    String nombre = result.getString("nombre");
                    String apellidos = result.getString("apellidos");
                    String ss = result.getString("ss");
                    String telefono = result.getString("num_tel");
                    String buzon = result.getString("buzon_apartado");
                    String pueblo = result.getString("pueblo");
                    String estado = result.getString("estado");
                    String zip_code = result.getString("zip_code");
                    String carretera = result.getString("carretera_calle");
                    String nacimiento = result.getString("fec_nac");
                    String edad = result.getString("edad");
                    String genero = result.getString("genero");
                    String plan = result.getString("plan");
                            
                    // enviar la información al otro GUI
                    admision.nombre.setText(nombre);
                    admision.apellidos.setText(apellidos);
                    admision.ss.setText(ss);
                    admision.telefono.setText(telefono);
                    admision.correo_postal.setText(buzon + " " + pueblo + "\n" + estado + " " + zip_code);
                    admision.direccion_fisica.setText(carretera+ " " + pueblo + "\n" + estado + " " + zip_code);
                    admision.birthday.setText(nacimiento);
                    admision.edad.setText(edad);
                    admision.genero.setText(genero);
                    admision.plan_medico.setText(plan);
                }
                // hacer visible el otro GUI
                admision.setVisible(true);
                try{result.close();}catch(SQLException e){ /*blank intentionally*/}
                try{statement.close();}catch(SQLException e) {/*blank intentionally*/}
            }catch(SQLException e)
            {
                /*blank intentionally*/
            }
            finally
            {
                try
                {
                    if(coneccion != null)
                        coneccion.close();
                } catch(SQLException e)
                {
                    /*blank intentionally*/
                }
            }
        }
    }//GEN-LAST:event_see_infoActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // crear una instancia del menú principal de los administradores
        AdminUserForm adm = new AdminUserForm(id_adm);
        // cerrar el GUI actual
        this.dispose();
        // hacer visible el nuevo GUI
        adm.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(List_Admission_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List_Admission_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List_Admission_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List_Admission_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new List_Admission_Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel error;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lista_admision;
    private javax.swing.JButton see_info;
    // End of variables declaration//GEN-END:variables
}
