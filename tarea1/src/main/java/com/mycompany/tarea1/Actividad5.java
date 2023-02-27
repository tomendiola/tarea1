/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author tomen
 */
public class Actividad5 extends JFrame {

    private final JTextArea textArea1;
    private final JTextArea textArea2;
    private final JButton boton1;
    private final JButton boton2;

    private class Operacion implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String cadena;
            cadena =  textArea1.getText();
            Topicos objTopico =new Topicos();
            textArea2.setText(objTopico.cifrar(cadena));
//          es lo mismo   
//          cadena= "texto"+ textfiled.getText();
            //          JOptionPane.showMessageDialog(null, cadena);
        }
    }
    private class Operacion2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String cadena;
            cadena =  textArea1.getText();
            Topicos objTopico =new Topicos();
            textArea2.setText(objTopico.noCifrar(cadena));
//          es lo mismo   
//          cadena= "texto"+ textfiled.getText();
            //          JOptionPane.showMessageDialog(null, cadena);
        }
    }

    
    public Actividad5() {
        super("Prueba Actividad 1 ");
        setLayout(new FlowLayout());
        textArea1 = new JTextArea(5, 25);
        textArea2 = new JTextArea(5, 25);
        add(textArea1);

        boton1 = new JButton("Encripta");
        boton2 = new JButton("Decifra");
        add(boton1);
        add(boton2);
        add(textArea2);
        Operacion objOperacion =new Operacion();
        boton1.addActionListener(objOperacion);
        Operacion2 objOperacion2 =new Operacion2();
        boton2.addActionListener(objOperacion2);
    }

    public static void main(String[] args) {
        Actividad5 ObjAct1 = new Actividad5();
        ObjAct1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ObjAct1.setSize(300, 300);
        ObjAct1.setVisible(true);

    }
}
