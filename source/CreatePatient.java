import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JOptionPane;

/**GUI que le permite al paciente crearse una cuenta en el sistema
 *
 * @author a-carrasquillo
 * @author a-rivera
 */
public class CreatePatient extends javax.swing.JFrame {
    // constantes relacionadas a la base de datos
    private final String YourPassWord = "YourPassWord";
    private final String DBUSER = "dbuser";

    /** Constructor por defecto
     * Crea un nuevo formulario CreatePacient
     */
    public CreatePatient() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        mailbox = new javax.swing.JTextField();
        town = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        road = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        name = new java.awt.TextField();
        id = new java.awt.TextField();
        get_id_paciente = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        ssn = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        zip_code = new javax.swing.JTextField();
        telefono = new javax.swing.JFormattedTextField();
        lastnames = new java.awt.TextField();
        age = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        masculino = new javax.swing.JRadioButton();
        femenino = new javax.swing.JRadioButton();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        planes = new javax.swing.JComboBox<>();
        pass_conf = new javax.swing.JPasswordField();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Pacientes");

        submit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        submit.setText("Registrarse");
        submit.setMaximumSize(new java.awt.Dimension(163, 31));
        submit.setMinimumSize(new java.awt.Dimension(163, 31));
        submit.setPreferredSize(new java.awt.Dimension(163, 31));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Nombre: ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Apellidos:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("ID Paciente:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Contraseña:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Seguro Social, últimos 4:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Teléfono:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Buzón/ Apartado:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Pueblo:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Estado:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Carretera/Calle:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Fecha de Nacimiento:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Edad:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Género:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Plan Médico:");

        mailbox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        town.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        state.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        road.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Confirmar Contraseña:");

        name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        get_id_paciente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        get_id_paciente.setText("Obtener ID");
        get_id_paciente.setMaximumSize(new java.awt.Dimension(163, 31));
        get_id_paciente.setMinimumSize(new java.awt.Dimension(163, 31));
        get_id_paciente.setPreferredSize(new java.awt.Dimension(163, 31));
        get_id_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                get_id_pacienteActionPerformed(evt);
            }
        });

        pass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        ssn.setColumns(4);
        ssn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Código Postal:");

        zip_code.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        telefono.setColumns(14);
        try {
            telefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefono.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lastnames.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        age.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("Años");

        masculino.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        masculino.setText("Masculino");
        masculino.setToolTipText("");
        masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masculinoActionPerformed(evt);
            }
        });

        femenino.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        femenino.setText("Femenino");
        femenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femeninoActionPerformed(evt);
            }
        });

        day.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        month.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        month.setMinimumSize(new java.awt.Dimension(90, 28));
        month.setPreferredSize(new java.awt.Dimension(90, 28));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        year.setMinimumSize(new java.awt.Dimension(90, 28));
        year.setPreferredSize(new java.awt.Dimension(90, 28));

        planes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        planes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plan ABC", "Plan XYZ" }));

        pass_conf.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        error.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(zip_code, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                            .addComponent(road)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lastnames, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass_conf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ssn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(planes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mailbox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(get_id_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(town, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(state, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(masculino)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(46, 46, 46)
                                .addComponent(femenino))
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lastnames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(get_id_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(pass_conf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(femenino)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(masculino)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mailbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(town, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zip_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(road, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masculinoActionPerformed
        // evita que se seleccionen ambos géneros al mismo tiempo
        if (femenino.isSelected())
        {
            femenino.setSelected(false);
        }

    }//GEN-LAST:event_masculinoActionPerformed

    private void femeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femeninoActionPerformed
        // evita que se seleccionen ambos géneros al mismo tiempo
        if(masculino.isSelected())
        {
            masculino.setSelected(false);
        }

    }//GEN-LAST:event_femeninoActionPerformed

    /**
     * Método que envia la información a la base de datos
     * 
     */
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // Elimina el mensaje de error previo
        error.setText(" ");
        // recolectando la información del GUI
        String nombre = name.getText();
        String apellidos = lastnames.getText();
        String pwd = String.valueOf(pass.getPassword());
        String conf_pwd = String.valueOf(pass_conf.getPassword());
        String id_num = id.getText();
        String ss = String.valueOf(ssn.getPassword());
        String tel = telefono.getText();
        int edad = (int)age.getValue();
        String dia = String.valueOf(day.getSelectedItem());
        String mes = String.valueOf(month.getSelectedItem());
        String year_cumple = String.valueOf(year.getSelectedItem());
        String plan = String.valueOf(planes.getSelectedItem());
        String buzon = mailbox.getText();
        String pueblo = town.getText();
        String estado = state.getText();
        String zip = zip_code.getText();
        String calle = road.getText();
        String cumple = year_cumple+"-"+mes+"-"+dia;
        char genero = ' ';
        // Determinar el género seleccionado
        if(masculino.isSelected())
            genero='M';
        else
            genero='F';
        
        if(!pwd.equals(conf_pwd))
        {
            error.setText("Error! Las contraseñas no son iguales.");
        }
        else
        {
         
            Connection coneccion = null;
            PreparedStatement p_statement = null;
            // verificar si no dejo nada en blanco
            if(tel.isEmpty()||ss.isEmpty()||estado.isEmpty()||apellidos.isEmpty()||buzon.isEmpty()||id_num.isEmpty()||pwd.isEmpty()||nombre.isEmpty()||calle.isEmpty()||zip.isEmpty()||pueblo.isEmpty()||plan.isEmpty()||genero == ' ')
            {
                error.setText("Favor de no dejar espacios en blanco!");
            }
            else
            {
                try
                {
                    coneccion = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedExpress?autoReconnect=true&useSSL=false",DBUSER,YourPassWord);
                    String query = "insert into pacientes values('"+id_num+"', '"+pwd+"', "+ ss+", '"+ tel + "', '" + buzon + "', '" + pueblo + "', '" + estado + "', '"+ zip + "', '" + calle + "', '" + nombre + "', '"+ apellidos+"', '"+cumple + "', " + edad + ", '" + genero + "', '" + plan + "')";    
                    p_statement = coneccion.prepareStatement(query);
                    // realizar el update
                    if(p_statement.executeUpdate()>=0)
                    {
                         JOptionPane.showMessageDialog(null, "Información Transferida Correctamente.");
                         JOptionPane.showMessageDialog(null, "Inicie sesión para tener acceso.");
                         dispose();
                         // ir al GUI de inicio de sesión
                         Login_Patient login= new  Login_Patient();
                         login.setVisible(true);
                     }
                    try{p_statement.close();}catch(SQLException e) {/*blank intentionally*/}

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
            }
        }
    }//GEN-LAST:event_submitActionPerformed

    private void get_id_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_get_id_pacienteActionPerformed
        // Primero definimos la variable entera para almacenar el número de identificación.
        int id_p;
        // Ahora podemos realizar el generador aleatorio
        id_p = (int)(Math.random()*((999-002)+1))+002;
        // Por último, pasaremos el valor del id generado al encasillado designado para ese propósito
        id.setText("P-"+String.valueOf(id_p));
         
    }//GEN-LAST:event_get_id_pacienteActionPerformed
        
    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // cuando cambia el mes, remover los días
        day.removeAllItems();
        // obtener el mes que ha sido seleccionado
        String m = String.valueOf(month.getSelectedItem());
        int days;
        // determinar el mes que ha sido seleccionado, para indicar cuantos días tiene dicho mes
        switch (m) 
        {
            case "1":
            case "3":
            case "5":
            case "7":
            case "8":
            case "10":
            case "12":
                days = 31;
                break;
            case "2":
                days = 28;
                break;
            default:
                days = 30;
                break;
        }
        // poblar el encasillado de día
         for(int i = 1; i<=days;i++)
                day.addItem(String.valueOf(i));
    }//GEN-LAST:event_monthActionPerformed

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
            java.util.logging.Logger.getLogger(CreatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatePatient().setVisible(true);
            }
            
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner age;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JLabel error;
    private javax.swing.JRadioButton femenino;
    private javax.swing.JButton get_id_paciente;
    private java.awt.TextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.TextField lastnames;
    private javax.swing.JTextField mailbox;
    private javax.swing.JRadioButton masculino;
    protected javax.swing.JComboBox<String> month;
    private java.awt.TextField name;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass_conf;
    protected javax.swing.JComboBox<String> planes;
    private javax.swing.JTextField road;
    private javax.swing.JPasswordField ssn;
    private javax.swing.JTextField state;
    private javax.swing.JButton submit;
    private javax.swing.JFormattedTextField telefono;
    private javax.swing.JTextField town;
    protected javax.swing.JComboBox<String> year;
    private javax.swing.JTextField zip_code;
    // End of variables declaration//GEN-END:variables
}
