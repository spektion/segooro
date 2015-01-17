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
public class Tscasa extends Seguro implements Serializable{  //Declaração da class
   
    public Tscasa(float p){  //Construtor
        super(p,tseguro.Casa);  //Contrutor da superclass
        double tdevolver=p*50; //Assumimos por exemplo 100€anuais para 10k€ *50 pq é devolvido 50% apenas
        if (tdevolver > 10000)  //Atingiu o maximo ?
           tdevolver=10000;//É o maximo         
        this.setA_devolver(tdevolver);//Assumimos esta escala
    }
    
    public void casa(){  //Activou o seguro da casa
       this.setActivo(false);  //Desactivado
       System.out.println("\n\n\n\n\nO cliente activou o seguro vai receber "+this.getA_devolver()+"€ Deseja criar um novo seguro?\n\n\n");  //Devolve o valor a receber e pergunta se quer criar novo   
    }
    
    public String toString(){  //Metodo ToSTring
        String exit=super.toString(); //  Variavel de saida
        exit=exit+" Valor a devolver em caso de activacao do seguro de Casa:"+super.getA_devolver()+"€";  //Agrega o valor a devolver caso seja activado o seguro      
        return exit;  //Devolve a string com os dados
    } 
}