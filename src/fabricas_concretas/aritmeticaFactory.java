/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import fabricas_abstractas.FactoryAbstract;
import productos_concretos.Suma;
import productos_concretos.Resta;
import productos_concretos.Multiplicacion;
import productos_concretos.Divicion;
import productos_abstractos.Aritmetica;
import productos_abstractos.Conversiones;

/**
 *
 * @author LN710Q
 */
public class aritmeticaFactory extends FactoryAbstract{
    
    @Override
    public Aritmetica getAritmetica(String type) {
        switch(type){
            case "SUMA":
                return new Suma();
            case "RESTA":
                return new Resta();
            case "MULTIPLICACION": 
                return new Multiplicacion();
            case "DIVICION":
               return new Divicion();
        } return null;
    }

    @Override
    public Conversiones getConversion(String type) {
        return null;
    }

    

    
    
    
}
