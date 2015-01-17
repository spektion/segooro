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
public class Tsvida extends Seguro implements Serializable{ //Declaração da class
    //String nome_ben;
            
    public Tsvida(float p){  //Construtor da class
        super(p,tseguro.Vida);  //Construtor da super
        double tdevolver=p*250;  //Assumimos 200€ ano, com uma cobertura de 50k€
        tdevolver=tdevolver*1.15;  //Maus os 15%
        this.setA_devolver(tdevolver);//Assumimos esta escala
    }
    
    public String toString(){  //Metodo ToString
        String exit=super.toString();  //String de saida
        exit=exit+" Valor a devolver em caso de activacao do seguro de vida:"+super.getA_devolver()+"€"; //Valor do seguro a devolver em caso de activação     
        return exit;  //Devolve a string
    }
}