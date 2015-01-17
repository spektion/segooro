/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segooro;

import java.io.Serializable;

/**
 *
 * @author a
 */
public class Tsveiculo extends Seguro implements Serializable{  //Declaração de class
    
    private boolean acidentes=false;  //Já teve acidentes?
    private tveiculo veiculo;  //Tipo de veiculo
    
    public Tsveiculo(double p,tveiculo v, boolean a){  //Construtor
        super(p,tseguro.Veiculo);  //Construtor da superclass
        this.veiculo=v; //Tipo de veiculo
        this.acidentes=a; //Já teve acidentes
    }
}