/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assistant;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;

/**
 *
 * @author Programming-learning
 */
public class GUIExample extends javax.swing.JFrame {
    ButtonGroup gender=new ButtonGroup();
    public GUIExample() {
        initComponents();
        gender.add(david);
        gender.add(zira);
        zira.doClick();
    }

    VoiceSpeaker.VoiceGender getGender() {
        if (david.isSelected()) {
            return VoiceSpeaker.VoiceGender.MALE;
        }
        return VoiceSpeaker.VoiceGender.FEMALE;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        answer = new javax.swing.JTextArea();
        reset = new javax.swing.JButton();
        name = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        time1 = new javax.swing.JButton();
        date = new javax.swing.JButton();
        whoru = new javax.swing.JButton();
        namaste = new javax.swing.JButton();
        time = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ask = new javax.swing.JButton();
        quest = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        zira = new javax.swing.JRadioButton();
        david = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Assistant");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImages(null);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setAutoscrolls(true);

        answer.setEditable(false);
        answer.setBackground(new java.awt.Color(204, 204, 255));
        answer.setColumns(20);
        answer.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        answer.setForeground(new java.awt.Color(0, 51, 255));
        answer.setRows(5);
        answer.setAutoscrolls(false);
        answer.setFocusable(false);
        jScrollPane1.setViewportView(answer);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, 330, 150));

        reset.setForeground(new java.awt.Color(0, 51, 255));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

        name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 51, 255));
        name.setText("By Sijan Bhandari");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Actions");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        time1.setBackground(new java.awt.Color(204, 255, 204));
        time1.setForeground(new java.awt.Color(0, 51, 255));
        time1.setText("Speak Nepali");
        time1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time1ActionPerformed(evt);
            }
        });
        jPanel1.add(time1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        date.setBackground(new java.awt.Color(204, 255, 204));
        date.setForeground(new java.awt.Color(0, 51, 255));
        date.setText("Date");
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 80, -1));

        whoru.setBackground(new java.awt.Color(204, 255, 204));
        whoru.setForeground(new java.awt.Color(0, 51, 255));
        whoru.setText("Who are you");
        whoru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whoruActionPerformed(evt);
            }
        });
        jPanel1.add(whoru, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        namaste.setBackground(new java.awt.Color(204, 255, 204));
        namaste.setForeground(new java.awt.Color(0, 51, 255));
        namaste.setText("Say Namaste");
        namaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namasteActionPerformed(evt);
            }
        });
        jPanel1.add(namaste, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 105, -1));

        time.setBackground(new java.awt.Color(204, 255, 204));
        time.setForeground(new java.awt.Color(0, 51, 255));
        time.setText("Time");
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Quick Start");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 94, -1));

        ask.setBackground(new java.awt.Color(102, 255, 153));
        ask.setForeground(new java.awt.Color(0, 51, 255));
        ask.setText("Speak");
        ask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                askActionPerformed(evt);
            }
        });
        jPanel1.add(ask, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        quest.setBackground(new java.awt.Color(153, 255, 204));
        quest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quest.setForeground(new java.awt.Color(0, 51, 255));
        quest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questActionPerformed(evt);
            }
        });
        jPanel1.add(quest, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 310, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Voice Data");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 94, -1));

        zira.setForeground(new java.awt.Color(0, 51, 255));
        zira.setText("Female");
        zira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ziraActionPerformed(evt);
            }
        });
        jPanel1.add(zira, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        david.setForeground(new java.awt.Color(0, 51, 255));
        david.setText("Male");
        david.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                davidActionPerformed(evt);
            }
        });
        jPanel1.add(david, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Text To Voice");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void questActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questActionPerformed
        ask.doClick();

    }//GEN-LAST:event_questActionPerformed

    private void askActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_askActionPerformed
        try {
            switch (quest.getText()) {
                case "" -> {
                    String toSpeak = "enter data and press ok.";
                    answer.setText(toSpeak);
                    VoiceSpeaker.speak(toSpeak, getGender());
                }
                case "hi" -> {
                    String toSpeak = "hello nice to meet you, you said hi.";
                    VoiceSpeaker.speak(toSpeak, getGender());
                }
                case "hello" -> {
                    String toSpeak = "hi nice to meet you, you said hello.";
                    VoiceSpeaker.speak(toSpeak, getGender());
                }
                default -> {
                    VoiceSpeaker.speak(quest.getText(), getGender());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(GUIExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_askActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        answer.setText("");

    }//GEN-LAST:event_resetActionPerformed

    private void whoruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whoruActionPerformed
        try {
            String toSpeak = "I am automated text to voice converter with little automation, created by season vaandaari";
            VoiceSpeaker.speak(toSpeak, getGender());
        } catch (IOException ex) {
            Logger.getLogger(GUIExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_whoruActionPerformed

    private void namasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namasteActionPerformed
        String toSpeak = "namaste. stay safe";
        try {
            VoiceSpeaker.speak(toSpeak, getGender());
        } catch (IOException ex) {
            Logger.getLogger(GUIExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_namasteActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        String toSpeak = "today is " + DateTimeFormatter.ofPattern("yyyy/MM/dd").format(LocalDateTime.now());
        try {
            VoiceSpeaker.speak(toSpeak, getGender());
        } catch (IOException ex) {
            Logger.getLogger(GUIExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dateActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        try {
            String toSpeak = "time is " + DateTimeFormatter.ofPattern("HH:mm").format(LocalDateTime.now());
            VoiceSpeaker.speak(toSpeak, getGender());
        } catch (IOException ex) {
            Logger.getLogger(GUIExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_timeActionPerformed

    private void time1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time1ActionPerformed
        try {
            String toSpeak = "naamaastee nepal tapaae aahhilee sundae hununchha nepali bhasa dhhanyebaad.";
            VoiceSpeaker.speak(toSpeak, getGender());
        } catch (IOException ex) {
            Logger.getLogger(GUIExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_time1ActionPerformed

    private void davidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_davidActionPerformed

    }//GEN-LAST:event_davidActionPerformed

    private void ziraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ziraActionPerformed

    }//GEN-LAST:event_ziraActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUIExample().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea answer;
    private javax.swing.JButton ask;
    private javax.swing.JButton date;
    private javax.swing.JRadioButton david;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton namaste;
    private java.awt.Label name;
    private javax.swing.JTextField quest;
    private javax.swing.JButton reset;
    private javax.swing.JButton time;
    private javax.swing.JButton time1;
    private javax.swing.JButton whoru;
    public javax.swing.JRadioButton zira;
    // End of variables declaration//GEN-END:variables

//old code: Not recomended to use
//Check Voicespeaker Class for updated code
//class OldClass {
//
//        String gender = "0";
//        int reset = 0;
//
//        Voicespeaker(String vv) {
//            if (zira.isSelected()) {
//                gender = "1";
//            }
//
//            if (vv.equals("what is computer")) {
//                vv = "it's me, haha joking. computer is a electronic device which processes given input and gives you final output.";
//
//            }
//            if (vv.equals("reset -ttv")) {
//                reset = 1;
//                vv = "reset action completed.";
//            }
//            FileWriter f8;
//            try {
//                File toDeleteText = new File("voice.txt");
//                File toDeleteVbs = new File("voice.vbs");
//                toDeleteText.delete();
//                toDeleteVbs.delete();
//                answer.append("opened file\n");
//                f8 = new FileWriter("voice.txt");
//                f8.flush();
//
//                answer.append("cleaned previous data\n");
//                f8.append("Set Sapi = Wscript.CreateObject(\"SAPI.SpVoice\")\nSet sapi.Voice = sapi.GetVoices.Item(" + gender + ")\nSapi.speak \"" + vv + "\"");
//                f8.close();
//
//                File f = new File("voice.txt");
//                File fg = new File("voice.vbs");
//                f.renameTo(fg);
//                answer.append("Playing voice\n");
//                Runtime.getRuntime().exec("wscript D:\\voice.vbs");
//                answer.append("exiting action\n***\n");
//                if (reset == 1) {
//                    quest.setText("");
//                    answer.setText("reset completed successfully :)");
//                }
//
//            } catch (Exception e) {
//                answer.setText("error accured");
//            }
//        }
//    }
}
