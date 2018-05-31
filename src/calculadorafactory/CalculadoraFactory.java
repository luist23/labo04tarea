/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafactory;

import GUI.Ventana;
import GUI.VentanaPrincipal;
import fabricas_abstractas.FactoryAbstract;
import fabricas_concretas.FactoryProducer;
import fabricas_concretas.aritmeticaFactory;
import javax.swing.JFrame;
import productos_abstractos.Aritmetica;


/**
 *
 * @author LN710Q
 */
public class CalculadoraFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FactoryAbstract factory;
        aritmeticaFactory aritmetica = new aritmeticaFactory();
        Aritmetica operacion;
        operacion = aritmetica.getAritmetica("SUMA");
        System.out.println(operacion.operar(1, 3));
        
        factory=FactoryProducer.getFactory(1);
        operacion = factory.getAritmetica("SUMA");
        float resultado;
        resultado=operacion.operar(2, 3);
        System.out.println(resultado);
       
        //aritmetica.operar(1,2);
        JFrame ventana = new JFrame("Calculadora");
        ventana.setContentPane(new VentanaPrincipal());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
        
            
        }
        
    
    public void sumar(int a, int b){

    
}


}
