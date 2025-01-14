import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/** GUI utilizado para mostrar las opciones que tiene un paciente
 * 
 *@author a-carrasquillo
 * @author arivesan
 */
public class PatientUserForm extends javax.swing.JFrame {
    //data fields
    private String id_paciente;
    private String full_name;
    private Patient_Info info;
    // constantes relacionadas a la base de datos
    private final String YOURPASSWORD = "YourPassWord";
    private final String DBUSER = "dbuser";
    
    /** Constructor por defecto
     * Crea un nuevo formulario PacientUserForm
     */
    public PatientUserForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**Constructor especial 
     * 
     * @param id_paciente - número de identificación del paciente
     */
    public PatientUserForm(String id_paciente) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.id_paciente = id_paciente;
    }
    
    //getters
    /**Método que nos permite recuperar el id del paciente
     * 
     * @return cadena de caracteres que representa el id del paciente
     */
    public String getIdPaciente() {
        return id_paciente;
    }
    
    /**Método que nos permite recuperar el nombre completo del paciente
     * 
     * @return cadena de caracteres que representa el nombre completo del paciente
     */
    public String getFullName() {
        return full_name;
    }
    
    //setters
    /**Método que nos permite modificar el id del paciente
     * 
     * @param id_paciente - número de identificación del paciente
     */
    public void setIdPaciente(String id_paciente) {
        this.id_paciente = id_paciente;
    }
    
    /**Método que nos permite modificar el nombre completo del paciente
     * 
     * @param full_name - nombre completo del paciente
     */
    public void setFullName(String full_name) {
        this.full_name = full_name;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profile = new javax.swing.JButton();
        rate = new javax.swing.JButton();
        sign_out = new javax.swing.JButton();
        search_fac = new javax.swing.JButton();
        make_prediagnosis = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        medical_hist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Página Principal");

        profile.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        profile.setText("Editar Perfil");
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });

        rate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rate.setText("Califica tu Última Visita");
        rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateActionPerformed(evt);
            }
        });

        sign_out.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sign_out.setText("Cerrar Sesión");
        sign_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_outActionPerformed(evt);
            }
        });

        search_fac.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        search_fac.setText("Buscar una Facilidad Médica");
        search_fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_facActionPerformed(evt);
            }
        });

        make_prediagnosis.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        make_prediagnosis.setText("Realizar Prediagnóstico");
        make_prediagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                make_prediagnosisActionPerformed(evt);
            }
        });

        welcome.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        welcome.setText("¿Qué desea hacer 'Nombre Paciente'?");

        medical_hist.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        medical_hist.setText("Ver Historial Médico");
        medical_hist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medical_histActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sign_out))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(search_fac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(make_prediagnosis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(medical_hist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(welcome)
                .addGap(35, 35, 35)
                .addComponent(profile)
                .addGap(18, 18, 18)
                .addComponent(medical_hist)
                .addGap(18, 18, 18)
                .addComponent(search_fac)
                .addGap(18, 18, 18)
                .addComponent(make_prediagnosis)
                .addGap(18, 18, 18)
                .addComponent(rate)
                .addGap(18, 18, 18)
                .addComponent(sign_out)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        // cerrar el GUI actual
        dispose();
        // crea una instancia del GUI que nos permite editar el perfil del paciente
        Edit_Profile_Patient edit_pro = new Edit_Profile_Patient(id_paciente);
        // instanciar la clase que nos permite almacenar información del paciente
        info = new Patient_Info();
         
        Connection coneccion = null;
        PreparedStatement p_statement = null;
        try
        {
            coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedExpress?autoReconnect=true&useSSL=false",DBUSER,YOURPASSWORD);
            // query para obtener la información de un paciente
            String query = "select Nombre, Apellidos, Num_Tel, Genero, Plan, Buzon_Apartado, Pueblo, Estado, Zip_Code, Carretera_Calle, Edad from MedExpress.Pacientes where ID_Paciente ='" + id_paciente +"'";
            Statement statement = coneccion.createStatement();
            ResultSet result = statement.executeQuery(query);

            // verificar si hubo un resultado
            while(result.next())
            {
                // extraer la información del resultado
                String nombre = result.getString("Nombre");
                String apellidos = result.getString("Apellidos");
                String telefono = result.getString("Num_Tel");
                String genero = result.getString("Genero");
                String plan = result.getString("Plan");
                String apartado = result.getString("Buzon_Apartado");
                String pueblo = result.getString("Pueblo");
                String estado = result.getString("Estado");
                String zip = result.getString("Zip_Code");
                String carretera = result.getString("Carretera_Calle");
                int edad = Integer.valueOf(result.getString("Edad"));
                
                // establecer información en la siguiente GUI
                edit_pro.name.setText(nombre);
                edit_pro.apellidos.setText(apellidos);
                edit_pro.telefono.setText(telefono);
                // establecer el nombre y la edad en la instancia que nos permite almacenar la información del paciente
                info.setNombre(nombre+" "+apellidos);
                info.setEdad(edad);
                // determinar el género del paciente   
                if(genero.toUpperCase().equals("M"))
                {// masculino
                    // establecer el género en la siguiente GUI
                    edit_pro.masculino.setSelected(true);
                    // establecer el género en la instancia que nos permite almacenar la información del paciente
                    info.setGenero("M");
                }
                else
                {// femenino
                    // establecer el género en la siguiente GUI
                    edit_pro.femenino.setSelected(true);
                    // establecer el género en la instancia que nos permite almacenar la información del paciente
                    info.setGenero("F");
                }  
                // establecer el plan que posee el paciente como el seleccionado en el encasillado
                edit_pro.planes.setSelectedItem(plan);
                // indicar el buzón del paciente
                edit_pro.buzon.setText(apartado);
                // indicar el pueblo del paciente
                edit_pro.pueblo.setText(pueblo);
                // indicar el estado de residencia del paciente
                edit_pro.estado.setText(estado);
                // indicar el código postal del paciente
                edit_pro.zip_code.setText(zip);
                // indicar la carretera del paciente
                edit_pro.carretera.setText(carretera);
                // hacer visible el GUI nuevo
                edit_pro.setVisible(true);

            }
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
                if(p_statement != null)
                    p_statement.close();
                if(coneccion != null)
                    coneccion.close();
            } 
            catch(SQLException e) 
            {
                /*blank intentionally*/
            }
        }
    }//GEN-LAST:event_profileActionPerformed

    private void search_facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_facActionPerformed
        // crea una instancia del GUI que nos permite buscar facilidades médicas
        Search_Medical_Facility busqueda = new Search_Medical_Facility(id_paciente);
        // ocultar el botón que envía la información a la facilidad
        busqueda.sendInfo.setVisible(false);
        // hacer visible el GUI nuevo
        busqueda.setVisible(true);
    }//GEN-LAST:event_search_facActionPerformed

    private void make_prediagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_make_prediagnosisActionPerformed
        // cerrar el GUI actual
        dispose();
        // instanciar la clase que nos permite almacenar información del paciente 
        info = new Patient_Info();
        
        Connection coneccion = null;
        try
        {
            coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedExpress?autoReconnect=true&useSSL=false",DBUSER,YOURPASSWORD);
            // query para obtener la información básica del paciente
            String query = "select Nombre, Apellidos, Genero, Edad from MedExpress.Pacientes where ID_Paciente ='" + id_paciente +"' ";
            Statement statement = coneccion.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            // verificar si hubo resultado
            while(result.next())
            {
                // extraer la información del resultado
                String nombre = result.getString("Nombre");
                String apellidos = result.getString("Apellidos");        
                String genero = result.getString("Genero");
                int edad = Integer.valueOf(result.getString("Edad"));
                // establecer el nombre y la edad en la instancia que nos permite almacenar la información del paciente
                info.setNombre(nombre+" "+apellidos);
                info.setEdad(edad);
                // evaluar el género del paciente para enviar los datos a la instancia que almacena la información del paciente
                if(genero.toUpperCase().equals("M"))
                    info.setGenero("M");
                else
                    info.setGenero("F");
            }
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
        // instanciar el GUI que nos permite realizar el prediagnóstico
        MedExpress pre = new MedExpress(info, id_paciente);
        // establecer el nombre y la edad en el GUI nuevo
        pre.name.setText(info.getNombre());
        pre.age.setValue(info.getEdad());
        // evaluar el género del paciente para establece dicho dato en el nuevo GUI
        if(info.getGenero().equals("M"))
            pre.masculino.setSelected(true);
        else
            pre.femenino.setSelected(true);
        // hacer visible el nuevo GUI
        pre.setVisible(true);
    }//GEN-LAST:event_make_prediagnosisActionPerformed

    private void rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateActionPerformed
        Connection coneccion = null;
        // variable para almacenar el número de identificación de la facilidad médica
        String id_facilidad = "";
        try
        {
            coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedExpress?autoReconnect=true&useSSL=false",DBUSER,YOURPASSWORD);
            // query que busca el id de la facilidad más reciente visitada por el paciente
            String query = "select id_facilidad from ingresos where ID_Paciente='"+id_paciente+"' and fec_ingreso=(select distinct max(fec_ingreso) from ingresos) order by hora_ingreso desc limit 1";
            Statement statement = coneccion.createStatement();
            ResultSet result = statement.executeQuery(query);
            // evaluar si hubo un resultado
            while(result.next())       
                // extraer la información del resultado
                id_facilidad = result.getString("id_facilidad");

            try{result.close();}catch(SQLException e){ /*blank intentionally*/}
            try{statement.close();}catch(SQLException e) {/*blank intentionally*/}
        } catch(SQLException e)
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
        // evaluar si el número de identificación de la facilidad no está vacío
        if(!id_facilidad.isEmpty())
        {//encontró un ID
            // variable para almacenar el tipo de facilidad que visito el paciente
            String facilidad = "";
            // verificar si es sala de emergencia u oficina médica
            switch (id_facilidad.charAt(0)) {
                case 'E':
                    // sala de emergencia, buscar en tabla de hospitales
                    facilidad="hospitales";
                    break;
                case 'O':
                    //oficina médica, buscar en la tabla de oficinas_medicas
                    facilidad = "oficinas_medicas";
                    break;
                default:
                    // error
                    JOptionPane.showMessageDialog(null, "Error. El ID de facilidad encontrado no corresponde a ninguno de los que debe.\nFavor de contactar al manejador de la BD");
                    break;
            }
            // variable para almacenar el nombre de la facilidad
            String nombre_facilidad="";
             try
            {
                coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedExpress?autoReconnect=true&useSSL=false",DBUSER,YOURPASSWORD);
                // query para buscar el nombre de la facilidad basados en su id
                String query = "select nombre from "+ facilidad + " where id_facilidad = '"+id_facilidad+"'";
                Statement statement = coneccion.createStatement();
                ResultSet result = statement.executeQuery(query);
                // verificar si hubo resultado
                while(result.next())
                    // extraer la información del resultado
                    nombre_facilidad = result.getString("nombre"); 
                
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

            // variables para almacenar la información básica del médico
            String id_medico="", nombre_medico="", apellidos="", nombre_completo="";
            try
            {
                coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedExpress?autoReconnect=true&useSSL=false",DBUSER,YOURPASSWORD);
                // query para obtener el id, el nombre y los apellidos del médico que atendió al paciente
                String query = "select historial_medico.id_medico ID, nombre, apellidos from historial_medico, medicos where id_paciente = '"+id_paciente+"' and fec_consulta=(select max(fec_consulta) from historial_medico) and medicos.id_medico in (select historial_medico.id_medico from historial_medico, medicos where id_paciente = '"+id_paciente+"' and fec_consulta=(select max(fec_consulta) from historial_medico)) limit 1";
                Statement statement = coneccion.createStatement();
                ResultSet result = statement.executeQuery(query);
                // evaluar si hubo resultado
                while(result.next())
                {
                    // extraer la información del resultado
                    id_medico = result.getString("ID");
                    nombre_medico = result.getString("nombre");
                    apellidos = result.getString("apellidos");
                    nombre_completo = nombre_medico + " " + apellidos;
                }
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
            // evaluar si el id médico no se encuentra vacío
            if(!id_medico.isEmpty())
            {
                // crear una instancia del GUI que nos permite dejar una reseña del médico y facilidad médica
                Rating rating = new Rating(id_paciente, id_facilidad, id_medico);
                // establecer el nombre del médico y la facilidad médica
                rating.nombre_medico.setText(nombre_completo);
                rating.nombre_facilidad.setText(nombre_facilidad);
                // cerrar el GUI actual
                this.dispose();
                // hacer visible el nuevo GUI
                rating.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error. La identificación del médico está vacía, por lo tanto, no encontró información.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se encontró ningún lugar al que haya ido.");
        }
    }//GEN-LAST:event_rateActionPerformed

    private void sign_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_outActionPerformed
        // cerrar el GUI actual
        this.dispose();
        // crea una instancia del GUI que nos permite ver los distintos tipos de inicio de sesión
        Login_As log = new Login_As();
        // hacer visible el nuevo GUI
        log.setVisible(true);
    }//GEN-LAST:event_sign_outActionPerformed

    private void medical_histActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medical_histActionPerformed
        // Mostrar mensaje para indicar que la opción está en desarrollo
        JOptionPane.showMessageDialog(null, "Opción no disponible por el momento");
    }//GEN-LAST:event_medical_histActionPerformed

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
            java.util.logging.Logger.getLogger(PatientUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton make_prediagnosis;
    private javax.swing.JButton medical_hist;
    private javax.swing.JButton profile;
    private javax.swing.JButton rate;
    private javax.swing.JButton search_fac;
    private javax.swing.JButton sign_out;
    protected javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
