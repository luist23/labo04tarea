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
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LuisT23
 */
public class Ventana extends JPanel{
    public int WIDTH =500,widthTF=200,widthB=80;
    public int HEIGHT=300,heightTF=30,heightB=30;
    public JTextField textF1,textF2;
    public JButton button;
    
    
    public Ventana() {
        textF1 =new JTextField();
    textF1.setBounds(new Rectangle(100,40,widthTF,heightTF));
    
    textF2 = new JTextField();
    textF2.setBounds(new Rectangle(100,200,widthTF,heightTF));
    
    button = new JButton("copiar");
    button.setBounds(new Rectangle(120,115,widthTF,heightTF));
    
    textF1.setEditable(true);
    textF2.setEditable(false);
    
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            System.out.println(":v");
            textF2.setText(textF1.getText());
        }
    });
    
    add(textF1);
    add(button);
    add(textF2);
    setLayout(null);
    setPreferredSize(new Dimension(WIDTH,HEIGHT));
        
    }
    
    
}
