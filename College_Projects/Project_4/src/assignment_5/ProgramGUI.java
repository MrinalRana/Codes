/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_5;
import java.awt.Color;
import java.awt.Font;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
/**
 *
 * @author Mrinal
 */
public class ProgramGUI extends javax.swing.JFrame{
    Socket server = null;
    ObjectOutputStream dOut;
    ObjectInputStream dIN;
    
    public ProgramGUI() throws IOException {
        initComponents();
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProgram = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSem = new javax.swing.JLabel();
        lblSeat = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        spinSem = new javax.swing.JSpinner();
        spinSeat = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        btnDisplay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Assignment_5");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblProgram.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProgram.setText("Program Management");
        lblProgram.setToolTipText("");

        lblID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblID.setText("ID");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblName.setText("Name");

        lblSem.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblSem.setText("Semester");

        lblSeat.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblSeat.setText("Seats");

        spinSem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spinSem.setModel(new javax.swing.SpinnerNumberModel(2, 2, 8, 1));

        spinSeat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spinSeat.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        spinSeat.setMinimumSize(new java.awt.Dimension(34, 22));
        spinSeat.setPreferredSize(new java.awt.Dimension(34, 22));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnAdd.setText("Add Program");
        btnAdd.setPreferredSize(new java.awt.Dimension(157, 27));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tblDisplay.setBackground(new java.awt.Color(255, 255, 204));
        tblDisplay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblDisplay.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDisplay.setName(""); // NOI18N
        jScrollPane1.setViewportView(tblDisplay);

        btnDisplay.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnDisplay.setText("Display Program");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID)
                            .addComponent(lblName))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textName, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                .addComponent(textID)))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSem)
                                    .addComponent(lblSeat))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spinSem, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(spinSeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnDisplay)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(lblProgram)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblProgram)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(lblSem)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinSem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSeat)
                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spinSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        try {
            server = new Socket("localhost",8000);
            dOut = new ObjectOutputStream(server.getOutputStream());
            dIN = new ObjectInputStream(server.getInputStream());
            Program p = new  Program();
            p.setBtn(0);
            p.setId(textID.getText());
            p.setName(textName.getText());
            p.setSem((int) spinSem.getValue());
            p.setSeat((int) spinSeat.getValue());
            dOut.writeObject(p);
            JOptionPane.showMessageDialog(null, dIN.readObject());
            textID.setText("");
            textName.setText("");
            spinSem.setValue(2);
            spinSeat.setValue(1);
            btnDisplayActionPerformed(evt);
        } catch (IOException ex) {
            Logger.getLogger(ProgramGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProgramGUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnAddActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            dIN.close();
            dOut.close();
            server.close();
    } catch (IOException ex) {
        Logger.getLogger(ProgramGUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_formWindowClosed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        try {
            server = new Socket("localhost",8000);
            dOut = new ObjectOutputStream(server.getOutputStream());
            dIN = new ObjectInputStream(server.getInputStream());
            Program p = new Program();
            p.setBtn(1);
            p.setId(textID.getText());
            p.setName(textName.getText());
            p.setSem((int) spinSem.getValue());
            p.setSeat((int) spinSeat.getValue());
            dOut.writeObject(p);
            DefaultTableModel dTM = new DefaultTableModel();
            dTM=new DefaultTableModel();
            JTableHeader th = tblDisplay.getTableHeader();
            th.setBackground(new Color(204,204,255));
            th.setFont(new Font("Tahoma", Font.BOLD, 14));
            ArrayList<Program> pro = new ArrayList<Program>();
            pro = (ArrayList<Program>)dIN.readObject();
            Object[] column = new Object[5];
            column[1] = "ID";
            column[2] = "Name";
            column[3] = "Semesters";
            column[4] = "Max_Seats";
            column[0] = "S.No.";
            dTM.setColumnIdentifiers(column);
            Object[] row = new Object[5];
            for(int i = 0; i <pro.size(); i++){
                row[1] = pro.get(i).getId();
                row[2] = pro.get(i).getName();
                row[3] = pro.get(i).getSem();
                row[4] = pro.get(i).getSeat();
                row[0] = i+1;
                dTM.addRow(row);
            }  
            tblDisplay.setModel(dTM);
        } catch (IOException ex) {
            Logger.getLogger(ProgramGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProgramGUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnDisplayActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProgram;
    private javax.swing.JLabel lblSeat;
    private javax.swing.JLabel lblSem;
    private javax.swing.JSpinner spinSeat;
    private javax.swing.JSpinner spinSem;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables

}
