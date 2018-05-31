/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LuisT23
 */
public class VentanaPrincipal extends JPanel{
    public int WIDTH =500,widthTF=200,widthB=80;
    public int HEIGHT=300,heightTF=30,heightB=30;
    public JTextField textF1,textF2;
    public JButton button,button2;
    
    
    public VentanaPrincipal() {
        /*textF1 =new JTextField();
    textF1.setBounds(new Rectangle(100,40,widthTF,heightTF));
    
    textF2 = new JTextField();
    textF2.setBounds(new Rectangle(100,200,widthTF,heightTF));*/
    
    button = new JButton("convertir");
    button.setBounds(new Rectangle((WIDTH/2)-(widthTF/2),115,widthTF,heightTF));
    
    button2 = new JButton("operar");
    button2.setBounds(new Rectangle((WIDTH/2)-(widthTF/2),150,widthTF,heightTF));
    
    /*textF1.setEditable(true);
    textF2.setEditable(false);*/
    
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            JFrame ventana = new JFrame("ventana");
            ventana.setContentPane(new VentanaConvertir());
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setResizable(false);
            ventana.pack();
            ventana.setVisible(true);
        }
    });
    button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            JFrame ventana = new JFrame("ventana");
            ventana.setContentPane(new VentanaOperar());
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setResizable(false);
            ventana.pack();
            ventana.setVisible(true);
        }
    });
    
    //add(textF1);
    add(button);
    add(button2);
    //add(textF2);
    setLayout(null);
    setPreferredSize(new Dimension(WIDTH,HEIGHT));
        
    }
}
