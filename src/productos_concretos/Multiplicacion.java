/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_concretos;

import productos_abstractos.Aritmetica;

/**
 *
 * @author LN710Q
 */
public class Multiplicacion implements Aritmetica{

    @Override
    public float operar(int dato1, int dato2) {
        return dato1*dato2;
    }

    
    
}