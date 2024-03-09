/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vista;

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
        panel1 = new java.awt.Panel();
        jPanel1 = new javax.swing.JPanel();
        panel7 = new java.awt.Panel();
        Id_Medico = new java.awt.Label();
        textField1 = new java.awt.TextField();
        BoxMedico = new javax.swing.JTextField();
        panel11 = new java.awt.Panel();
        label7 = new java.awt.Label();
        BoxDia = new javax.swing.JTextField();
        panel4 = new java.awt.Panel();
        label3 = new java.awt.Label();
        BoxEspecialidad = new javax.swing.JComboBox<>();
        panel13 = new java.awt.Panel();
        label11 = new java.awt.Label();
        BoxMes = new javax.swing.JTextField();
        panel14 = new java.awt.Panel();
        label12 = new java.awt.Label();
        BoxAño = new javax.swing.JTextField();
        panel8 = new java.awt.Panel();
        nombre = new java.awt.TextField();
        label8 = new java.awt.Label();
        panel10 = new java.awt.Panel();
        apellido = new java.awt.TextField();
        label9 = new java.awt.Label();
        panel12 = new java.awt.Panel();
        cedula = new java.awt.TextField();
        label10 = new java.awt.Label();
        panel6 = new java.awt.Panel();
        telefono = new java.awt.TextField();
        label5 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        AsignarCita = new java.awt.Button();
        EliminarCita = new java.awt.Button();
        button3 = new java.awt.Button();
        panel9 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allPData12 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        JTable_MedicosDisponibles = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        BtnSalir = new java.awt.Button();
        button4 = new java.awt.Button();

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

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        Id_Medico.setName(""); // NOI18N
        Id_Medico.setText("Id_Medico");

        textField1.setText("textField1");

        BoxMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Id_Medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Id_Medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label7.setName(""); // NOI18N
        label7.setText("Día");

        BoxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel11Layout = new javax.swing.GroupLayout(panel11);
        panel11.setLayout(panel11Layout);
        panel11Layout.setHorizontalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        panel11Layout.setVerticalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel11Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        label3.setName(""); // NOI18N
        label3.setText("Especialidad");

        BoxEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BoxEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxEspecialidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label11.setName(""); // NOI18N
        label11.setText("Mes");

        BoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxMesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel13Layout = new javax.swing.GroupLayout(panel13);
        panel13.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel13Layout.setVerticalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel13Layout.createSequentialGroup()
                .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        label12.setName(""); // NOI18N
        label12.setText("Año");

        BoxAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxAñoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel14Layout = new javax.swing.GroupLayout(panel14);
        panel14.setLayout(panel14Layout);
        panel14Layout.setHorizontalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxAño, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        panel14Layout.setVerticalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel14Layout.createSequentialGroup()
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        label8.setName(""); // NOI18N
        label8.setText("Nombre");

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label9.setName(""); // NOI18N
        label9.setText("Apellidos");

        javax.swing.GroupLayout panel10Layout = new javax.swing.GroupLayout(panel10);
        panel10.setLayout(panel10Layout);
        panel10Layout.setHorizontalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel10Layout.setVerticalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label10.setName(""); // NOI18N
        label10.setText("Cedula");

        javax.swing.GroupLayout panel12Layout = new javax.swing.GroupLayout(panel12);
        panel12.setLayout(panel12Layout);
        panel12Layout.setHorizontalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        label5.setName(""); // NOI18N
        label5.setText("Telefono");

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))
                        .addComponent(panel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        AsignarCita.setLabel("Asignar Cita");
        AsignarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarCitaActionPerformed(evt);
            }
        });

        EliminarCita.setLabel("Eliminar Cita");
        EliminarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarCitaActionPerformed(evt);
            }
        });

        button3.setLabel("button3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EliminarCita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(AsignarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AsignarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(EliminarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AsignarCita.getAccessibleContext().setAccessibleName("Asignar CIta");

        jLabel1.setText("Citas Registradas");

        jLabel2.setText("MedicosDisponibles");

        allPData12.setBackground(new java.awt.Color(255, 255, 255));
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

        JTable_MedicosDisponibles.setBackground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        BtnSalir.setLabel("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        button4.setLabel("button3");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarCitaActionPerformed
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
    }//GEN-LAST:event_EliminarCitaActionPerformed

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
    private void AsignarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarCitaActionPerformed

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
    }//GEN-LAST:event_AsignarCitaActionPerformed
   
    
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


    private void BoxEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxEspecialidadActionPerformed

    private void BoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxMesActionPerformed

    private void BoxAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxAñoActionPerformed

    private void BoxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxDiaActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void BoxMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxMedicoActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed
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
    private java.awt.Button AsignarCita;
    private javax.swing.JTextField BoxAño;
    private javax.swing.JTextField BoxDia;
    private javax.swing.JComboBox<String> BoxEspecialidad;
    private javax.swing.JTextField BoxMedico;
    private javax.swing.JTextField BoxMes;
    private java.awt.Button BtnSalir;
    private java.awt.Button EliminarCita;
    private java.awt.Label Id_Medico;
    public javax.swing.JTable JTable_MedicosDisponibles;
    private javax.swing.JTable allPData12;
    private java.awt.TextField apellido;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.TextField cedula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label3;
    private java.awt.Label label5;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.TextField nombre;
    private java.awt.Panel panel1;
    private java.awt.Panel panel10;
    private java.awt.Panel panel11;
    private java.awt.Panel panel12;
    private java.awt.Panel panel13;
    private java.awt.Panel panel14;
    private java.awt.Panel panel4;
    private java.awt.Panel panel6;
    private java.awt.Panel panel7;
    private java.awt.Panel panel8;
    private java.awt.Panel panel9;
    private java.awt.TextField telefono;
    private java.awt.TextArea textArea1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
