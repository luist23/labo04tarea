/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import fabricas_abstractas.FactoryAbstract;

/**
 *
 * @author LuisT23
 */
public class FactoryProducer {
    public static FactoryAbstract getFactory(int opcion){
    switch (opcion){
        case 1:
            return new aritmeticaFactory();
        case 2:
            return  new conversionFactory();
    }
    
    return null;
    
    }
    
}
