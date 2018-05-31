/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_concretos;

import productos_abstractos.Conversiones;

/**
 *
 * @author LN710Q
 */
public class Decimal implements Conversiones{

    @Override
    public String convertir(int dato) {
        float datoConv = dato;
        return ""+datoConv;
    }

   
    
}
