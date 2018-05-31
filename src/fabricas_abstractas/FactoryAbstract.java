/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_abstractas;

import productos_abstractos.Aritmetica;
import productos_abstractos.Conversiones;

/**
 *
 * @author LN710Q
 */
public abstract class FactoryAbstract {
    public abstract Conversiones getConversion(String type);
    public abstract Aritmetica getAritmetica(String type);
}
