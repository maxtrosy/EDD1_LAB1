/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vista.Frames;

import com.mycompany.vista.Pacientes;
import java.time.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maxtr
 */
public class RegistrarPacientesFrame extends javax.swing.JFrame {

    private DefaultTableModel modeloTabla;
    ArrayList<Pacientes> todosPacientes = new ArrayList<>();
    ArrayList<Integer> idMedicosDisponibles = new ArrayList<Integer>();

    /**
     * Creates new form RegistrarPaciente
     */
    public RegistrarPacientesFrame() {
        initComponents();
        cargarDatosEnTabla(allPData12);
        cargarEspecialidades(JTable_MedicosDisponibles);
        BoxEspecialidad.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BoxDia = new javax.swing.JTextField();
        BoxAño = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        allPData12 = new javax.swing.JTable();
        cedula = new java.awt.TextField();
        BoxMes = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        JTable_MedicosDisponibles = new javax.swing.JTable();
        telefono = new java.awt.TextField();
        BoxMedico = new javax.swing.JTextField();
        apellido = new java.awt.TextField();
        nombre = new java.awt.TextField();
        BoxEspecialidad = new javax.swing.JComboBox<>();
        BOTONASIGNARCITA = new javax.swing.JButton();
        BOTONSALIR = new javax.swing.JButton();
        BOTONELIMINARCITA1 = new javax.swing.JButton();
        FONDOREGISTRARCITA = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 800));
        setPreferredSize(new java.awt.Dimension(1280, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BoxDia.setBorder(null);
        BoxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxDiaActionPerformed(evt);
            }
        });
        getContentPane().add(BoxDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 140, 30));

        BoxAño.setBorder(null);
        BoxAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxAñoActionPerformed(evt);
            }
        });
        getContentPane().add(BoxAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 540, 130, 30));

        allPData12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "Especialidad", "Medico", "Cedula", "Telefono", "Fecha"
            }

        ));
        allPData12.setEnabled(false);
        jScrollPane1.setViewportView(allPData12);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 940, 130));

        cedula.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 250, 50));

        BoxMes.setBorder(null);
        BoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxMesActionPerformed(evt);
            }
        });
        getContentPane().add(BoxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 130, 30));

        JTable_MedicosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID","Nombre","Apellido","Especialidad","Citas Registradas"
                + ""
            }
        ));
        jScrollPane4.setViewportView(JTable_MedicosDisponibles);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 670, 180));

        telefono.setBackground(new java.awt.Color(255, 255, 255));
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 250, 40));

        BoxMedico.setBorder(null);
        BoxMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(BoxMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 250, 40));

        apellido.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 240, 40));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 240, 50));

        BoxEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BoxEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxEspecialidadActionPerformed(evt);
            }
        });
        getContentPane().add(BoxEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 380, 60));

        BOTONASIGNARCITA.setFont(new java.awt.Font("Mukta Mahee", 1, 40)); // NOI18N
        BOTONASIGNARCITA.setForeground(new java.awt.Color(255, 255, 255));
        BOTONASIGNARCITA.setText("Asignar Cita");
        BOTONASIGNARCITA.setBorder(null);
        BOTONASIGNARCITA.setBorderPainted(false);
        BOTONASIGNARCITA.setContentAreaFilled(false);
        BOTONASIGNARCITA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONASIGNARCITAActionPerformed(evt);
            }
        });
        getContentPane().add(BOTONASIGNARCITA, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 370, 260, 50));

        BOTONSALIR.setFont(new java.awt.Font("Mukta Mahee", 1, 40)); // NOI18N
        BOTONSALIR.setForeground(new java.awt.Color(255, 255, 255));
        BOTONSALIR.setText("Salir");
        BOTONSALIR.setBorder(null);
        BOTONSALIR.setBorderPainted(false);
        BOTONSALIR.setContentAreaFilled(false);
        BOTONSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONSALIRActionPerformed(evt);
            }
        });
        getContentPane().add(BOTONSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 720, 130, 50));

        BOTONELIMINARCITA1.setFont(new java.awt.Font("Mukta Mahee", 1, 40)); // NOI18N
        BOTONELIMINARCITA1.setForeground(new java.awt.Color(255, 255, 255));
        BOTONELIMINARCITA1.setText("Eliminar Cita");
        BOTONELIMINARCITA1.setBorder(null);
        BOTONELIMINARCITA1.setBorderPainted(false);
        BOTONELIMINARCITA1.setContentAreaFilled(false);
        BOTONELIMINARCITA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONELIMINARCITA1ActionPerformed(evt);
            }
        });
        getContentPane().add(BOTONELIMINARCITA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 490, 260, 50));

        FONDOREGISTRARCITA.setIcon(new javax.swing.ImageIcon("/Users/mariagutierrezgonzalez/Documents/GitHub/EDD1_LAB1/src/main/java/com/mycompany/vista/imagenes/REGISTROCITASAJUSTADOpng.png")); // NOI18N
        getContentPane().add(FONDOREGISTRARCITA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxDiaActionPerformed

    private void BoxAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxAñoActionPerformed

    private void BoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxMesActionPerformed

    private void BoxEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxEspecialidadActionPerformed

    private void BoxMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxMedicoActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void BOTONSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONSALIRActionPerformed
        dispose();
    }//GEN-LAST:event_BOTONSALIRActionPerformed

    private void BOTONASIGNARCITAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONASIGNARCITAActionPerformed

        Boolean idVerified = false;

        for (int i : idMedicosDisponibles) {
            if (Integer.valueOf(BoxMedico.getText()) == i) {
                idVerified = true;
            }
        }

        if (nombre.getText().isEmpty()
            || apellido.getText().isEmpty()
            || BoxEspecialidad.getSelectedItem() == null // Verificar si no se ha seleccionado una especialidad
            || BoxMedico.getText().isEmpty()
            || cedula.getText().isEmpty()
            || telefono.getText().isEmpty()
            || BoxDia.getText().isEmpty()
            || BoxMes.getText().isEmpty()
            || BoxAño.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Complete todos los campos.");
        } else {
            int dia = Integer.parseInt(BoxDia.getText());
            int mes = Integer.parseInt(BoxMes.getText());
            int año = Integer.parseInt(BoxAño.getText());
            String fechaCita = BoxDia.getText() + BoxMes.getText() + BoxAño.getText();
            LocalDate fechaActual = LocalDate.now();
            LocalDate fechaSeleccionada = LocalDate.of(año, mes, dia);
            // Validar dia, mes y año
            if (dia < 0 || dia > 31 || mes < 0 || mes > 12 || año != 2024) {
                JOptionPane.showMessageDialog(null, "Fecha Invalida. Ingrese una válida.");
            } else if (fechaSeleccionada.isBefore(fechaActual)) {
                JOptionPane.showMessageDialog(null, "La fecha seleccionada es anterior a la fecha actual.");
            } else if (!validarCantidadCitas(Integer.parseInt(BoxMedico.getText()))) {
                JOptionPane.showMessageDialog(null, "El médico ya tiene el máximo de citas permitidas.");
            } else if (idVerified == false) {
                JOptionPane.showMessageDialog(null, "ID inválido. Ingrese uno válido.");
            } else if (validarCitaMedicaExistente(Integer.parseInt(BoxMedico.getText()), fechaCita)) {
                JOptionPane.showMessageDialog(null, "Ya existe una cita médica para este médico en esta fecha.");
            } else if (validarCitaPacienteExistenteEnMes(Long.parseLong(cedula.getText()), BoxEspecialidad.getSelectedItem().toString(), mes, año)) {
                JOptionPane.showMessageDialog(null, "El paciente ya tiene una cita médica de la misma especialidad en este mes.");
            } else {
                try {

                    // Crear un nuevo objeto Paciente
                    Pacientes paciente = new Pacientes();

                    // Configurar los atributos del paciente con los valores de los campos
                    paciente.setNombre(nombre.getText());
                    paciente.setApellido(apellido.getText());
                    paciente.setEspecialidad(BoxEspecialidad.getSelectedItem().toString()); // Obtener la especialidad seleccionada del JComboBox
                    paciente.setDoctor(BoxMedico.getText());
                    paciente.setCedula(Long.parseLong(cedula.getText()));
                    paciente.setTelefono(Long.parseLong(telefono.getText()));
                    paciente.setFecha(Long.parseLong(BoxDia.getText() + BoxMes.getText() + BoxAño.getText()));

                    // Guardar la información del paciente en el archivo PacienteRecords.txt
                    guardarPacienteEnArchivo(paciente);

                    guardarCitaMedico(Integer.parseInt(BoxMedico.getText()));
                    // Limpia los campos después de crear el paciente (opcional)
                    limpiarCampos();

                    JOptionPane.showMessageDialog(null, "Paciente registrado correctamente.");
                } catch (NumberFormatException e) {
                    // Manejar el caso en que no se pueda convertir algún campo de texto a número
                    JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos válidos en los campos de cédula, teléfono y fecha.");
                }

                cargarDatosEnTabla(allPData12);
            }

        }
    }//GEN-LAST:event_BOTONASIGNARCITAActionPerformed

    private void BOTONELIMINARCITA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONELIMINARCITA1ActionPerformed
                // Obtener la cédula y la fecha del paciente
        String cedulaPacienteString = cedula.getText();
        String fechaCita = BoxDia.getText() + BoxMes.getText() + BoxAño.getText();

        // Verificar si los campos están vacíos
        if (cedulaPacienteString.isEmpty() || fechaCita.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese la cédula y la fecha del paciente para eliminar la cita.");
            return;
        }

        try {
            int cedulaPaciente = Integer.parseInt(cedulaPacienteString);

            // Buscar la cita correspondiente en los datos almacenados
            boolean citaEncontrada = false;
            try (BufferedReader lector = new BufferedReader(new FileReader("PacienteRecords.txt"))) {
                StringBuilder newData = new StringBuilder();
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String[] campos = linea.split(";");
                    // Verificar si los datos de esta línea coinciden con la cita a eliminar
                    if (campos.length >= 7 && Integer.parseInt(campos[4]) == cedulaPaciente && campos[6].equals(fechaCita)) {
                        // Si coincide, no agregamos esta línea al nuevo contenido
                        citaEncontrada = true;
                    } else {
                        // Si no coincide, agregamos esta línea al nuevo contenido
                        newData.append(linea).append("\n");
                    }
                }

                // Escribir el nuevo contenido al archivo
                try (BufferedWriter escritor = new BufferedWriter(new FileWriter("PacienteRecords.txt"))) {
                    escritor.write(newData.toString());
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al leer o escribir en el archivo PacienteRecords.txt");
                e.printStackTrace();
            }

            if (citaEncontrada) {
                JOptionPane.showMessageDialog(null, "La cita ha sido eliminada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna cita con la cédula y fecha proporcionadas.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: La cédula debe ser un número entero.");
        }
        cargarDatosEnTabla(allPData12);
        limpiarCampos();
    }//GEN-LAST:event_BOTONELIMINARCITA1ActionPerformed

    private void cargarDatosEnTabla(JTable tabla) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        // Limpiar la tabla antes de cargar nuevos datos
        modeloTabla.setRowCount(0);

        // Leer datos desde el archivo
        File archivoPacientes = new File("PacienteRecords.txt");
        if (!archivoPacientes.exists()) {
            JOptionPane.showMessageDialog(null, "El archivo PacienteRecords.txt no existe");
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
            JOptionPane.showMessageDialog(null, "Error al leer el archivo PacienteRecords.txt");
            e.printStackTrace();
        }
    }

    private void guardarPacienteEnArchivo(Pacientes paciente) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("PacienteRecords.txt", true))) {
            // Escribir la información básica del paciente en el archivo
            escritor.write(paciente.getNombre() + ";"
                    + paciente.getApellido() + ";"
                    + paciente.getEspecialidad() + ";"
                    + paciente.getDoctor() + ";"
                    + paciente.getCedula() + ";"
                    + paciente.getTelefono() + ";"
                    + paciente.getFecha());
            escritor.newLine(); // Agregar una nueva línea para separar las citas

            // Escribir las citas asignadas del paciente
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la información del paciente en el archivo.");
        }
        cargarDatosEnTabla(allPData12);
    }

    private boolean verificarCitaExistente(int cedulaPaciente, int mes, int año) {
        try (BufferedReader lector = new BufferedReader(new FileReader("PacienteRecords.txt"))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] campos = linea.split(";");
                if (campos.length >= 7 && Integer.parseInt(campos[4]) == cedulaPaciente
                        && Integer.parseInt(campos[6].substring(2, 4)) == mes
                        && Integer.parseInt(campos[6].substring(4)) == año) {
                    return true;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo PacienteRecords.txt");
            e.printStackTrace();
        }
        return false;
    }   
    
    private boolean validarCitaPacienteExistenteEnMes(long cedulaPaciente, String especialidad, int mes, int año) {
        try (BufferedReader lector = new BufferedReader(new FileReader("PacienteRecords.txt"))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] campos = linea.split(";");
                if (campos.length >= 7 && Long.parseLong(campos[4]) == cedulaPaciente
                        && campos[2].equals(especialidad)
                        && Integer.parseInt(campos[6].substring(2, 4)) == mes
                        && Integer.parseInt(campos[6].substring(4)) == año) {
                    return true;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo PacienteRecords.txt");
            e.printStackTrace();
        }
        return false;
    }


    private boolean validarCitaMedicaExistente(int idMedico, String fecha) {
        try (BufferedReader lector = new BufferedReader(new FileReader("PacienteRecords.txt"))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] campos = linea.split(";");
                if (Integer.parseInt(campos[3]) == idMedico && campos[6].equals(fecha)) {
                    return true; // Existe una cita médica para este médico en la fecha proporcionada
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo PacienteRecords.txt");
            e.printStackTrace();
        }
        return false; // No se encontró una cita médica para este médico en la fecha proporcionada
    }
    

    private boolean validarCantidadCitas(int idMedico) {
        int limiteCitas = 10; // Supongamos que el límite de citas es 10

        try (BufferedReader lector = new BufferedReader(new FileReader("MedicosRecords.txt"))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] campos = linea.split(";");
                if (Integer.parseInt(campos[0]) == idMedico) {
                    int citasAtendidas = Integer.parseInt(campos[6]); // Se asume que el número de citas está en el índice 6
                    return citasAtendidas < limiteCitas; // El médico puede aceptar más citas si aún no ha alcanzado el límite
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de médicos.");
            e.printStackTrace();
        }

        return false; // El médico ha alcanzado el límite de citas
    }

    private void cargarEspecialidades(JTable tabla) {

        String[] especialidades = {"Cardiología", "Dermatología", "Endocrinología", "Gastroenterología", "Neurología", "Oncología", "Pediatría", "Psiquiatría", "Traumatología", "Urología"};

        BoxEspecialidad.setModel(new DefaultComboBoxModel<>(especialidades));

        // Agregar ActionListener al JComboBox
        BoxEspecialidad.addActionListener(e -> {
            // Obtener la especialidad seleccionada
            String especialidadSeleccionada = (String) BoxEspecialidad.getSelectedItem();

            cargarMedicosDisponibles(especialidadSeleccionada);
        });

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
    }

    private void cargarMedicosDisponibles(String especialidad) {

        DefaultTableModel modeloTabla = (DefaultTableModel) this.JTable_MedicosDisponibles.getModel();
        modeloTabla.setRowCount(0);

        try (BufferedReader lector = new BufferedReader(new FileReader("MedicosRecords.txt"))) {
            String linea;
            int i = 0;
            while ((linea = lector.readLine()) != null) {
                String[] campos = linea.split(";");
                // Verificar si la especialidad del médico coincide con la especialidad seleccionada
                if (campos.length >= 3 && campos[3].equals(especialidad)) {
                    // Si coincide, agregar los datos del médico a la tabla  

                    // Se agregan las IDs de medicos disponibles
                    idMedicosDisponibles.add(i, Integer.valueOf(campos[0]));
                    i++;

                    System.out.println(linea);
                    modeloTabla.addRow(new Object[]{campos[0], campos[1], campos[2], campos[3], campos[6]});
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de médicos.");
            ex.printStackTrace();
        }
    }

    private void limpiarCampos() {
        nombre.setText("");
        apellido.setText("");
        BoxEspecialidad.setSelectedIndex(-1);
        cedula.setText("");
        telefono.setText("");
        BoxDia.setText("");
        BoxMes.setText("");
        BoxAño.setText("");
        BoxMedico.setText("");
    }

    private void guardarCitaMedico(int id) {
        // Acceder a archivo medicos
        File archivoMedicos = new File("MedicosRecords.txt");
        if (!archivoMedicos.exists()) {
            JOptionPane.showMessageDialog(null, "El archivo MedicosRecords.txt no existe");
            return;
        }

        try (BufferedReader lector = new BufferedReader(new FileReader(archivoMedicos))) {
            StringBuilder newData = new StringBuilder();
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] campos = linea.split(";");
                if (Integer.parseInt(campos[0]) == id) {
                    int citasAtendidas = Integer.parseInt(campos[6]) + 1;
                    campos[6] = String.valueOf(citasAtendidas);
                }
                // Reconstruir la línea con el campo actualizado
                newData.append(String.join(";", campos)).append("\n");
            }

            // Escribir el nuevo contenido al archivo
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter("MedicosRecords.txt"))) {
                escritor.write(newData.toString());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer o escribir en el archivo MedicosRecords.txt");
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(RegistrarPacientesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPacientesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPacientesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPacientesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RegistrarPacientesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTONASIGNARCITA;
    private javax.swing.JButton BOTONELIMINARCITA1;
    private javax.swing.JButton BOTONSALIR;
    private javax.swing.JTextField BoxAño;
    private javax.swing.JTextField BoxDia;
    private javax.swing.JComboBox<String> BoxEspecialidad;
    private javax.swing.JTextField BoxMedico;
    private javax.swing.JTextField BoxMes;
    private javax.swing.JLabel FONDOREGISTRARCITA;
    private javax.swing.JTable JTable_MedicosDisponibles;
    private javax.swing.JTable allPData12;
    private java.awt.TextField apellido;
    private java.awt.TextField cedula;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private java.awt.TextField nombre;
    private java.awt.TextField telefono;
    // End of variables declaration//GEN-END:variables
}
