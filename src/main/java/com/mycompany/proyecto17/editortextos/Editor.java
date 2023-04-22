/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto17.editortextos;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;

/**
 *
 * @author javie
 */
public class Editor extends javax.swing.JFrame {
    
    private HelpBroker hb;

    /**
     * Creates new form Editor
     */
    boolean cargado=false;
    File archivoAbierto;
    JFileChooser filechooser= new JFileChooser();
    String texto="";
    Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
    
    
    public Editor() {
        initComponents();
        String ruta = "file:C:/Users/javie/OneDrive/Documentos/NetBeansProjects/Proyecto17-EditorTextos/classes/com/ies/torredelrey/editorhelp/javahelp/ayuda.hs";
              
        try {
           
            HelpSet hs = new HelpSet(null, new URL(ruta));
            hb = hs.createHelpBroker();
            hb.enableHelpOnButton(mniAyuda, "ayuda", hs);
            // Ayuda al pulsar F1 sobre la ventana principal
            hb.enableHelpKey(mniAyuda.getParent(), "ayuda", hs);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HelpSetException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        edtCuadroTexto = new javax.swing.JEditorPane();
        mnbBarraMenu = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mniNuevo = new javax.swing.JMenuItem();
        mniAbrir = new javax.swing.JMenuItem();
        mniGuardar = new javax.swing.JMenuItem();
        mniGuardarComo = new javax.swing.JMenuItem();
        mniSalir = new javax.swing.JMenuItem();
        mnuEditar = new javax.swing.JMenu();
        mniCortar = new javax.swing.JMenuItem();
        mniCopiar = new javax.swing.JMenuItem();
        mniPegar = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mniAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bloc de notas");

        jScrollPane1.setViewportView(edtCuadroTexto);

        mnuArchivo.setText("Archivo");

        mniNuevo.setText("Nuevo");
        mniNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNuevoActionPerformed(evt);
            }
        });
        mnuArchivo.add(mniNuevo);

        mniAbrir.setText("Abrir");
        mniAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAbrirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mniAbrir);

        mniGuardar.setText("Guardar");
        mniGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGuardarActionPerformed(evt);
            }
        });
        mnuArchivo.add(mniGuardar);

        mniGuardarComo.setText("Guardar como");
        mniGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGuardarComoActionPerformed(evt);
            }
        });
        mnuArchivo.add(mniGuardarComo);

        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mniSalir);

        mnbBarraMenu.add(mnuArchivo);

        mnuEditar.setText("Editar");

        mniCortar.setText("Cortar");
        mniCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCortarActionPerformed(evt);
            }
        });
        mnuEditar.add(mniCortar);

        mniCopiar.setText("Copiar");
        mniCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCopiarActionPerformed(evt);
            }
        });
        mnuEditar.add(mniCopiar);

        mniPegar.setText("Pegar");
        mniPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPegarActionPerformed(evt);
            }
        });
        mnuEditar.add(mniPegar);

        mnbBarraMenu.add(mnuEditar);

        mnuAyuda.setText("Ayuda");

        mniAyuda.setText("Ayuda");
        mniAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAyudaActionPerformed(evt);
            }
        });
        mnuAyuda.add(mniAyuda);

        mnbBarraMenu.add(mnuAyuda);

        setJMenuBar(mnbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNuevoActionPerformed
        // TODO add your handling code here:
        edtCuadroTexto.setText("");
        setTitle("Bloc de notas");
        if (cargado==true) cargado=false;
        texto="";
        archivoAbierto=null;
    }//GEN-LAST:event_mniNuevoActionPerformed

    private void mniAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAbrirActionPerformed
        // TODO add your handling code here:
        filechooser.showOpenDialog(this);
        archivoAbierto=filechooser.getSelectedFile();
        try {
            BufferedReader br=new BufferedReader(new FileReader(archivoAbierto));
            String linea;
            texto="";
            while ((linea = br.readLine()) != null){
                texto+=linea+"\n";
            }
            edtCuadroTexto.setText(texto);
            cargado=true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        }
        setTitle("Bloc de notas "+archivoAbierto.getName());
        
    }//GEN-LAST:event_mniAbrirActionPerformed

    private void mniGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGuardarComoActionPerformed
        // TODO add your handling code here:
        filechooser.showSaveDialog(this);
        archivoAbierto=filechooser.getSelectedFile();
        texto=edtCuadroTexto.getText();
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter(archivoAbierto));
            bw.write(texto);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mniGuardarComoActionPerformed

    private void mniGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGuardarActionPerformed
        // TODO add your handling code here:
        if(cargado){
            texto=edtCuadroTexto.getText();
            try {
                BufferedWriter bw=new BufferedWriter(new FileWriter(archivoAbierto));
                bw.write(texto);
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            mniGuardarComoActionPerformed(evt);
        }
    }//GEN-LAST:event_mniGuardarActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_mniSalirActionPerformed

    private void mniCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCortarActionPerformed
        // TODO add your handling code here:
        texto=edtCuadroTexto.getSelectedText();
        StringSelection stringSelection = new StringSelection(texto);
        clipboard.setContents(stringSelection, null);
        edtCuadroTexto.replaceSelection("");
    }//GEN-LAST:event_mniCortarActionPerformed

    private void mniCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCopiarActionPerformed
        // TODO add your handling code here:
        texto=edtCuadroTexto.getSelectedText();
        StringSelection stringSelection = new StringSelection(texto);
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_mniCopiarActionPerformed

    private void mniPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPegarActionPerformed
    if(clipboard.getContents(clipboard)!=null)
        try {
            // TODO add your handling code here:
            edtCuadroTexto.setText(edtCuadroTexto.getText()+" "+(String)(clipboard.getContents(clipboard).getTransferData(DataFlavor.stringFlavor)));
        } catch (UnsupportedFlavorException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mniPegarActionPerformed

    private void mniAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAyudaActionPerformed
        // TODO add your handling code here:
        hb.initPresentation();
        hb.setDisplayed(true);
        
    }//GEN-LAST:event_mniAyudaActionPerformed

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
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane edtCuadroTexto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar mnbBarraMenu;
    private javax.swing.JMenuItem mniAbrir;
    private javax.swing.JMenuItem mniAyuda;
    private javax.swing.JMenuItem mniCopiar;
    private javax.swing.JMenuItem mniCortar;
    private javax.swing.JMenuItem mniGuardar;
    private javax.swing.JMenuItem mniGuardarComo;
    private javax.swing.JMenuItem mniNuevo;
    private javax.swing.JMenuItem mniPegar;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuEditar;
    // End of variables declaration//GEN-END:variables
}