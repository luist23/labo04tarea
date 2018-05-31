/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;


import fabricas_abstractas.FactoryAbstract;
import productos_abstractos.Aritmetica;
import productos_concretos.Binario;
import productos_concretos.Decimal;
import productos_concretos.Hexadecimal;
import productos_concretos.Octal;
import productos_abstractos.Conversiones;

/**
 *
 * @author LN710Q
 */
public class conversionFactory extends FactoryAbstract{
    

    @Override
    public Conversiones getConversion(String type) {
        switch(type){
            case "BINARIO":
                return new Binario();
            case "DECIMAL":
                return new Decimal();
            case "HEXADECIMAL": 
                return new Hexadecimal();
            case "OCTAL":
                return new Octal();
        }return null;
    }

    @Override
    public Aritmetica getAritmetica(String type) {
        return null;
    }

    
}
