import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**GUI que nos permite ver una lista de ingresos de pacientes
 *
 * @author a-carrasquillo
 * @author arivesan
 */
public class Ingresos extends javax.swing.JFrame {
    // data fields
    private DefaultTableModel model;
    private String id_Med;
    private List<String> id_ingreso;
    private String id = "";
    // constantes relacionadas a la base de datos
    private final String YOURPASSWORD = "YourPassWord";
    private final String DBUSER = "dbuser";
    
    /**Constructor por defecto
     * Crea un nuevo formulario Ingresos
     */
    public Ingresos() {
        initComponents();
        this.setLocationRelativeTo(null);
        // nos permite designar el tipo de modelo de la tabla
        model = new DefaultTableModel();
        // asigna el modelo a la lista de pacientes
        lista_paciente.setModel(model);
        // añade las columnas a la tabla
        model.addColumn("ID Paciente");
        model.addColumn("Nombre del Paciente");
        model.addColumn("Fecha de Entrada");
        model.addColumn("Hora de Entrada");
        model.addColumn("Prediagnóstico");
        // elimina el mensaje de error por defecto
        error.setText("");
    }
    
    /**Constructor especial
     * 
     * @param id_Med - número de identificación del médico
     */
    public Ingresos(String id_Med) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.id_Med = id_Med;
        // nos permite designar el tipo de modelo de la tabla
        model = new DefaultTableModel();
        // asigna el modelo a la lista de pacientes
        lista_paciente.setModel(model);
        // añade las columnas a la tabla
        model.addColumn("ID Paciente");
        model.addColumn("Nombre del Paciente");
        model.addColumn("Fecha de Entrada");
        model.addColumn("Hora de Entrada");
        model.addColumn("Prediagnóstico");
        // elimina el mensaje de error por defecto
        error.setText("");
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
        lista_paciente = new javax.swing.JTable();
        atender = new javax.swing.JButton();
        update = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Ingresos");

        lista_paciente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lista_paciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Paciente", "Nombre del Paciente", "Fecha de Entrada", "Hora de Entrada", "Prediagnóstico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(lista_paciente);

        atender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        atender.setText("Atender Paciente");
        atender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atenderActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        update.setText("Actualizar");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        error.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error.setText("Mensaje de Error");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138)
                                .addComponent(atender))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atender)
                    .addComponent(update)
                    .addComponent(back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // borrar el mensaje de error
        error.setText(" ");
        // variable para almacenar el número de identificación de la facilidad
        String id_F = "";
        
        Connection coneccion = null;
        Connection c2 = null;
        
        // evitar repetir una entrada borrando la tabla actual
        for (int i = 0; i<model.getRowCount();i++)
            model.removeRow(i);
        
        try
        {
            coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedExpress?autoReconnect=true&useSSL=false",DBUSER,YOURPASSWORD);
            c2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedExpress?autoReconnect=true&useSSL=false",DBUSER,YOURPASSWORD);
           
           try
           {
               // query para determinar el ID de la facilidad en la que el médico está actualmente trabajando
               String q = "Select ID_Facilidad from MedExpress.medicos, MedExpress.trabaja where ID_Medico=ID_Empleado and ID_Medico=  '" + id_Med+"' and curtime() between Hora_Entrada and Hora_Salida";
               Statement st = c2.createStatement();
               ResultSet r = st.executeQuery(q);
               // determinar si hay resultados
               while(r.next())
               {
                   // extraer el resultado
                   id_F = r.getString("ID_Facilidad");
               }
               try{r.close();} catch(SQLException e) {/*blank intentionally*/}
               try{st.close();} catch(SQLException e){/*blank intentionally*/}
           }
           catch(SQLException e)
           {
               /*blank intentionally*/
           }
           finally
           {
               try{c2.close();} catch(SQLException e){/*blank intentionally*/}
           }
           // query para obtener la información de los pacientes que esperan a ser atendidos basados en el id de la facilidad
           String query = "select ID_Paciente, Nombre, Apellidos, Fec_Ingreso, Hora_Ingreso, Prediagnostico, ID_Ingresos from MedExpress.Ingresos natural join MedExpress.Pacientes where Atendido =0 and ID_Facilidad='" +id_F+"' ";
           Statement statement = coneccion.createStatement();
           ResultSet result = statement.executeQuery(query);
           // evita que se pueda cambiar la información de la tabla
           lista_paciente.enableInputMethods(false);
           // crea nueva instancia de un ArrayList para almacenar los números de identificación de los ingresos
           id_ingreso = new ArrayList<>();
           // verificar si hubieron resultados
           while(result.next())
           {
               // extraer la información
               String idPaciente = result.getString("ID_Paciente");
               String nombre = result.getString("Nombre");
               String apellidos = result.getString("Apellidos");
               String f_ingreso = result.getString("Fec_Ingreso");
               String h_ingreso = result.getString("Hora_Ingreso");
               String prediag = result.getString("Prediagnostico");
               id_ingreso.add(result.getString("ID_Ingresos"));
               // añadir la información a la tabla
               model.addRow(new Object[]{idPaciente, nombre + " " + apellidos, f_ingreso, h_ingreso, prediag});
           }   
           try{result.close();}catch(SQLException e){ /*blank intentionally*/}
           try{statement.close();}catch(SQLException e) {/*blank intentionally*/}
        }catch(SQLException e)
        {
            /*blank intentionally*/
         }
        finally
        {
            try{
                if(coneccion != null)
                    coneccion.close();
            } catch(SQLException e)
            {
                /*blank intentionally*/
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void atenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atenderActionPerformed
        // extraer el índice de la fila seleccionada de la tabla
        int fila = lista_paciente.getSelectedRow();
         // verificar si se escogió una fila
        if (fila<0)
        {
            error.setText("Por favor escoger un paciente.");
        }
        else
        {
            // determinar el id del paciente
            id = String.valueOf(lista_paciente.getValueAt(fila, 0));
            
            Connection coneccion = null;
            PreparedStatement p_statement = null;
            try
            {
                coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedExpress?autoReconnect=true&useSSL=false",DBUSER,YOURPASSWORD);
                // query para indicar que el paciente ya no está en espera
                String query = "update MedExpress.ingresos set Atendido=1 where ID_Ingresos= '"+id_ingreso.get(fila)+"' ";
                p_statement = coneccion.prepareStatement(query);
                
                // realizar la actualización
                if((p_statement.executeUpdate()>=0) )
                {
                    JOptionPane.showMessageDialog(null, "Información Actualizada Correctamente.");
                    // cerrar el GUI actual
                    this.dispose();
                    // crear instancia del menú principal de los médicos
                    DoctorUserForm doctor = new DoctorUserForm(id_Med,id);
                    // hacer visible el GUI nuevo
                    doctor.setVisible(true);
                }  
            }catch(SQLException e)
            {
                /*blank intentionally*/
            }
            finally
            {
                try
                {
                    if(p_statement != null)
                        p_statement.close();
                    if(coneccion != null)
                        coneccion.close();
                } catch(SQLException e)
                {
                    /*blank intentionally*/
                }    
            }
        }
    }//GEN-LAST:event_atenderActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // cerrar el GUI actual
        this.dispose();
        // crear una instancia del menú principal de los médicos
        DoctorUserForm doctor = new DoctorUserForm(id_Med,id);
        // hacer visible el nuevo GUI
        doctor.setVisible(true);
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
            java.util.logging.Logger.getLogger(Ingresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atender;
    private javax.swing.JButton back;
    private javax.swing.JLabel error;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTable lista_paciente;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
