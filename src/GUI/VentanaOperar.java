/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import fabricas_abstractas.FactoryAbstract;
import fabricas_concretas.FactoryProducer;
import fabricas_concretas.aritmeticaFactory;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import productos_abstractos.Aritmetica;

/**
 *
 * @author LuisT23
 */
public class VentanaOperar extends JPanel{
    public int WIDTH =500,widthTF=200,widthB=80;
    public int HEIGHT=300,heightTF=30,heightB=30;
    public JTextField textF1,textF2,textF3,textF4;
    public JButton button,restar,multiplicar,dividir,salir;
    
    
    public VentanaOperar() {
        textF1 =new JTextField();
    textF1.setBounds(new Rectangle((WIDTH/2)-(widthTF/2),10,widthTF,heightTF));
    textF3 =new JTextField();
    textF3.setBounds(new Rectangle((WIDTH/2)-(widthTF/2),40,widthTF,heightTF));
    
    textF2 = new JTextField();
    textF2.setBounds(new Rectangle((WIDTH/2)-(widthTF/2),220,widthTF,heightTF));
    textF4 = new JTextField("                       RESULTADO");
    textF4.setBounds(new Rectangle((WIDTH/2)-(widthTF/2),190,widthTF,heightTF));

    
     salir = new JButton("REGRESAR");
    salir.setBounds(new Rectangle((WIDTH/2)-(widthTF/2),250,widthTF,heightTF));
    
    button = new JButton("SUMAR");
    button.setBounds(new Rectangle((WIDTH/2)-(widthTF/2),70,widthTF,heightTF));
    
    restar = new JButton("RESTAR");
    restar.setBounds(new Rectangle((WIDTH/2)-(widthTF/2),100,widthTF,heightTF));
    
     multiplicar = new JButton("MULTIPLICAR");
    multiplicar.setBounds(new Rectangle((WIDTH/2)-(widthTF/2),130,widthTF,heightTF));
    
     dividir = new JButton("DIVIDIR");
    dividir.setBounds(new Rectangle((WIDTH/2)-(widthTF/2),160,widthTF,heightTF));
    
    textF1.setEditable(true);
    textF3.setEditable(true);
    textF2.setEditable(false);
    textF4.setEditable(false);
    
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            try{
                FactoryAbstract factory;
                Aritmetica operacion;
                factory=FactoryProducer.getFactory(1);
                operacion = factory.getAritmetica("SUMA");
                String resultado=  ""+operacion.operar(Integer.parseInt(textF1.getText()), Integer.parseInt(textF3.getText()));

            textF2.setText(resultado);
            } catch (InputMismatchException e) {
                System.err.println("no ingreso un numero valido, vuelva a intentarlo");
                }
        }
    });
    
    restar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            try{
                FactoryAbstract factory;
                Aritmetica operacion;
                factory=FactoryProducer.getFactory(1);
                operacion = factory.getAritmetica("RESTA");
                String resultado=  ""+operacion.operar(Integer.parseInt(textF1.getText()), Integer.parseInt(textF3.getText()));

            textF2.setText(resultado);
            } catch (InputMismatchException e) {
                System.err.println("no ingreso un numero valido, vuelva a intentarlo");
                }
        }
    });
    multiplicar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            try{
                FactoryAbstract factory;
                Aritmetica operacion;
                factory=FactoryProducer.getFactory(1);
                operacion = factory.getAritmetica("MULTIPLICACION");
                String resultado=  ""+operacion.operar(Integer.parseInt(textF1.getText()), Integer.parseInt(textF3.getText()));

            textF2.setText(resultado);
            } catch (InputMismatchException e) {
                System.err.println("no ingreso un numero valido, vuelva a intentarlo");
                }
        }
    });
    dividir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            try{
                FactoryAbstract factory;
                Aritmetica operacion;
                factory=FactoryProducer.getFactory(1);
                operacion = factory.getAritmetica("DIVICION");
                String resultado=  ""+operacion.operar(Integer.parseInt(textF1.getText()), Integer.parseInt(textF3.getText()));

            textF2.setText(resultado);
            } catch (InputMismatchException e) {
                System.err.println("no ingreso un numero valido, vuelva a intentarlo");
                }
        }
    });
    salir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            JFrame ventana = new JFrame("Calculadora");
        ventana.setContentPane(new VentanaPrincipal());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
        }
    });
    add(textF1);
    add(textF3);
    add(button);
    add(restar);
    add(multiplicar);
    add(dividir);
    add(textF2);
    add(textF4);
        add(salir);
    setLayout(null);
    setPreferredSize(new Dimension(WIDTH,HEIGHT));
        
    }
}
