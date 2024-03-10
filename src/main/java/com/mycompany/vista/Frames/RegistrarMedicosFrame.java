/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vista.Frames;

import com.mycompany.vista.Medicos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maxtr
 */
public class RegistrarMedicosFrame extends javax.swing.JFrame {

    public int tamaño = 0;
    public int id;

    /**
     * Creates new form RegistrarPaciente
     */
    public RegistrarMedicosFrame() {
        initComponents();
        cargarEspecialidades(jtable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        idF = new java.awt.TextField();
        nombre = new java.awt.TextField();
        apellido = new java.awt.TextField();
        cedula = new java.awt.TextField();
        telefono = new java.awt.TextField();
        especialidad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        BOTONSALIR = new javax.swing.JButton();
        BOTONELIMINAR = new javax.swing.JButton();
        BOTONREINICIAR = new javax.swing.JButton();
        BOTONBUSCAR = new javax.swing.JButton();
        BOTONAGREGARMEDICOS = new javax.swing.JButton();
        LETRASREGISTROMEDICO = new javax.swing.JLabel();
        FONDOREGISTROMEDICOS = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 800));
        setMinimumSize(new java.awt.Dimension(1280, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idF.setBackground(new java.awt.Color(255, 255, 255));
        idF.setFont(new java.awt.Font("Mukta Mahee", 1, 13)); // NOI18N
        idF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFActionPerformed(evt);
            }
        });
        getContentPane().add(idF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 700, 250, 70));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombre.setFont(new java.awt.Font("Mukta Mahee", 1, 13)); // NOI18N
        nombre.setForeground(new java.awt.Color(21, 41, 103));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 270, 60));

        apellido.setBackground(new java.awt.Color(255, 255, 255));
        apellido.setFont(new java.awt.Font("Mukta Mahee", 1, 13)); // NOI18N
        apellido.setForeground(new java.awt.Color(21, 41, 103));
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 140, 270, 60));

        cedula.setBackground(new java.awt.Color(255, 255, 255));
        cedula.setFont(new java.awt.Font("Mukta Mahee", 1, 13)); // NOI18N
        cedula.setForeground(new java.awt.Color(21, 41, 103));
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, 270, 60));

        telefono.setBackground(new java.awt.Color(255, 255, 255));
        telefono.setFont(new java.awt.Font("Mukta Mahee", 1, 13)); // NOI18N
        telefono.setForeground(new java.awt.Color(21, 41, 103));
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 270, 60));

        especialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadActionPerformed(evt);
            }
        });
        getContentPane().add(especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 270, 60));

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id","Nombre", "Apellido", "Especialidad", "Cédula", "Teléfono", "Citas"
            }
        ));
        jScrollPane1.setViewportView(jtable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 1220, 240));

        BOTONSALIR.setText("Salir");
        BOTONSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONSALIRActionPerformed(evt);
            }
        });
        getContentPane().add(BOTONSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 506, 100, 40));

        BOTONELIMINAR.setFont(new java.awt.Font("Mukta Mahee", 1, 40)); // NOI18N
        BOTONELIMINAR.setForeground(new java.awt.Color(255, 255, 255));
        BOTONELIMINAR.setText("Eliminar");
        BOTONELIMINAR.setToolTipText("");
        BOTONELIMINAR.setBorderPainted(false);
        BOTONELIMINAR.setContentAreaFilled(false);
        BOTONELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONELIMINARActionPerformed(evt);
            }
        });
        getContentPane().add(BOTONELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 700, 200, 70));

        BOTONREINICIAR.setFont(new java.awt.Font("Mukta Mahee", 1, 25)); // NOI18N
        BOTONREINICIAR.setForeground(new java.awt.Color(255, 255, 255));
        BOTONREINICIAR.setText("Reiniciar");
        BOTONREINICIAR.setToolTipText("");
        BOTONREINICIAR.setBorderPainted(false);
        BOTONREINICIAR.setContentAreaFilled(false);
        BOTONREINICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONREINICIARActionPerformed(evt);
            }
        });
        getContentPane().add(BOTONREINICIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 310, 250, 80));

        BOTONBUSCAR.setFont(new java.awt.Font("Mukta Mahee", 1, 25)); // NOI18N
        BOTONBUSCAR.setForeground(new java.awt.Color(255, 255, 255));
        BOTONBUSCAR.setText("Buscar");
        BOTONBUSCAR.setToolTipText("");
        BOTONBUSCAR.setBorderPainted(false);
        BOTONBUSCAR.setContentAreaFilled(false);
        BOTONBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONBUSCARActionPerformed(evt);
            }
        });
        getContentPane().add(BOTONBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 220, 90));

        BOTONAGREGARMEDICOS.setFont(new java.awt.Font("Mukta Mahee", 1, 25)); // NOI18N
        BOTONAGREGARMEDICOS.setForeground(new java.awt.Color(255, 255, 255));
        BOTONAGREGARMEDICOS.setToolTipText("");
        BOTONAGREGARMEDICOS.setBorderPainted(false);
        BOTONAGREGARMEDICOS.setContentAreaFilled(false);
        BOTONAGREGARMEDICOS.setLabel("Agregar médico");
        BOTONAGREGARMEDICOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONAGREGARMEDICOSActionPerformed(evt);
            }
        });
        getContentPane().add(BOTONAGREGARMEDICOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 220, 90));

        LETRASREGISTROMEDICO.setIcon(new javax.swing.ImageIcon("/Users/mariagutierrezgonzalez/Documents/GitHub/EDD1_LAB1/src/main/java/com/mycompany/vista/imagenes/LETRASREGISTROMEDICOS.png")); // NOI18N
        getContentPane().add(LETRASREGISTROMEDICO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        FONDOREGISTROMEDICOS.setIcon(new javax.swing.ImageIcon("/Users/mariagutierrezgonzalez/Documents/GitHub/EDD1_LAB1/src/main/java/com/mycompany/vista/imagenes/FONDOREGISTROMEDICO-2.png")); // NOI18N
        getContentPane().add(FONDOREGISTROMEDICOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarIDs() {
        try (BufferedReader lector = new BufferedReader(new FileReader("MedicosRecords.txt"))) {
            String linea = lector.readLine();
            String linea2 = lector.readLine();
            int i = 0;
            while (linea != null) {
                i++;
            }
            tamaño = i;
            System.out.println("i= " + i + " tamaño= " + tamaño);
            i = 0;
            while (linea2 != null) {
                System.out.println("i= " + i + " tamaño= " + tamaño);
                i++;
                if (i == tamaño) {
                    String[] campos = linea2.split(";");
                    id = Integer.parseInt(campos[0]);
                }

            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de médicos.");
            ex.printStackTrace();
        }

    }

    private void cargarEspecialidades(JTable tabla) {

        String[] especialidades = {"Cardiología", "Dermatología", "Endocrinología", "Gastroenterología", "Neurología", "Oncología", "Pediatría", "Psiquiatría", "Traumatología", "Urología"};
        especialidad.setModel(new DefaultComboBoxModel<>(especialidades));

        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        modeloTabla.setRowCount(0);

        // Leer datos desde el archivo
        File archivoMedicos = new File("MedicosRecords.txt");
        if (!archivoMedicos.exists()) {
            JOptionPane.showMessageDialog(null, "El archivo MedicosRecords.txt no existe");
            return;
        }

        try (BufferedReader lector = new BufferedReader(new FileReader(archivoMedicos))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                // Dividir la línea en campos separados por ;
                String[] campos = linea.split(";");
                // Agregar los campos a la tabla
                modeloTabla.addRow(campos);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo PacienteRecords.txt");
            e.printStackTrace();
        }

        limpiarCampos();
    }

    private void BOTONSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONSALIRActionPerformed
        dispose();
    }//GEN-LAST:event_BOTONSALIRActionPerformed

    private void especialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadActionPerformed

    private void idFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void BOTONAGREGARMEDICOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONAGREGARMEDICOSActionPerformed
                                          
    }//GEN-LAST:event_BOTONAGREGARMEDICOSActionPerformed

    private void BOTONBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONBUSCARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOTONBUSCARActionPerformed

    private void BOTONREINICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONREINICIARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOTONREINICIARActionPerformed

    private void BOTONELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONELIMINARActionPerformed
        // TODO add your handling code here:

        // Obtener la ID del medico
        // Verificar si los campos están vacíos
        if (idF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese la ID para eliminar al medico");
            return;
        }

        try {
            int Id = Integer.parseInt(idF.getText());

            // Buscar la id correspondiente en los datos almacenados
            boolean idEncontrada = false;
            try (BufferedReader lector = new BufferedReader(new FileReader("MedicosRecords.txt"))) {
                StringBuilder newData = new StringBuilder();
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String[] campos = linea.split(";");
                    // Verificar si los datos de esta línea coinciden con la cita a eliminar
                    if (Integer.parseInt(campos[0]) == Id) {
                        // Si coincide, no agregamos esta línea al nuevo contenido
                        idEncontrada = true;
                    } else {
                        // Si no coincide, agregamos esta línea al nuevo contenido
                        newData.append(linea).append("\n");
                    }
                }

                // Escribir el nuevo contenido al archivo
                try (BufferedWriter escritor = new BufferedWriter(new FileWriter("MedicosRecords.txt"))) {
                    escritor.write(newData.toString());
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al leer o escribir en el archivo PacienteRecords.txt");
                e.printStackTrace();
            }

            if (idEncontrada) {
                JOptionPane.showMessageDialog(null, "La cita ha sido eliminada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna ID correspondiente.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: La cédula debe ser un número entero.");
        }
        cargarEspecialidades(jtable);
    }//GEN-LAST:event_BOTONELIMINARActionPerformed
    private boolean verificar(String cedula, String telefono) {
        try (BufferedReader lector = new BufferedReader(new FileReader("MedicosRecords.txt"))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] campos = linea.split(";");
                if (campos[4] == cedula || campos[5] == telefono) {
                    return true;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo MedicosRecords.txt");
            e.printStackTrace();
        }
        return false;
    }
    private void guardarMedicoEnArchivo(Medicos medico) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("MedicosRecords.txt", true))) {
            // Escribir la información básica del paciente en el archivo
            escritor.newLine(); // Agregar una nueva línea para separar las citas
            escritor.write(medico.getId() + ";"
                    + medico.getNombre() + ";"
                    + medico.getApellido() + ";"
                    + medico.getEspecialidad() + ";"
                    + medico.getCedula() + ";"
                    + medico.getTelefono() + ";"
                    + 0); // Citas a 0

            // Escribir las citas asignadas del paciente
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la información del medico en el archivo.");
        }
        cargarDatosEnTabla(jtable);
    }

    private void cargarDatosEnTabla(JTable tabla) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        // Limpiar la tabla antes de cargar nuevos datos
        modeloTabla.setRowCount(0);

        // Leer datos desde el archivo
        File archivoPacientes = new File("MedicosRecords.txt");
        if (!archivoPacientes.exists()) {
            JOptionPane.showMessageDialog(null, "El archivo MedicosRecords.txt no existe");
            return;
        }

        try (BufferedReader lector = new BufferedReader(new FileReader(archivoPacientes))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                // Dividir la línea en campos separados por ;
                String[] campos = linea.split(";");
                // Agregar los campos a la tabla
                modeloTabla.addRow(campos);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo Medicos&Records.txt");
            e.printStackTrace();
        }
    }

    private void limpiarCampos() {
        idF.setText("");
        nombre.setText("");
        apellido.setText("");
        especialidad.setSelectedIndex(-1);
        cedula.setText("");
        telefono.setText("");
    }

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
            java.util.logging.Logger.getLogger(RegistrarMedicosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarMedicosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarMedicosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarMedicosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarMedicosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTONAGREGARMEDICOS;
    private javax.swing.JButton BOTONBUSCAR;
    private javax.swing.JButton BOTONELIMINAR;
    private javax.swing.JButton BOTONREINICIAR;
    private javax.swing.JButton BOTONSALIR;
    private javax.swing.JLabel FONDOREGISTROMEDICOS;
    private javax.swing.JLabel LETRASREGISTROMEDICO;
    private java.awt.TextField apellido;
    private java.awt.TextField cedula;
    private javax.swing.JComboBox<String> especialidad;
    private java.awt.TextField idF;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable;
    private java.awt.TextField nombre;
    private java.awt.TextField telefono;
    // End of variables declaration//GEN-END:variables
}
