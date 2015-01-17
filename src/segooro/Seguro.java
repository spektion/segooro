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
public class Seguro implements Serializable{  //Declaração de class
    private double preco=0;  //Preço do seguro
    public tseguro tipo;  //Tipo do seguro
    public double a_devolver=0;  //Valor a devolver
    public boolean activo=false;  //Esta activo o seguro
    
    public Seguro(double p, tseguro s){ //Construtor
        this.preco=p;  //Assume o preço
        this.tipo=s;  //Assume o tipo
        this.activo=true; //Passa a activo  
    }
    
    public void despesa(double d){  //Metodo para ser overrited pela sub-class
    
    }
    
    public void casa(){ //Metodo para ser overrited pela sub-class
        
    }
    
    public String toString(){  //Metodo ToString
        
        String exit="";  //Variavel de saida
        exit="Dados do Seguro:\n"+"Preco:"+this.preco+"€ Tipo:"+this.getTipo()+" Activo:"+this.isActivo(); //Agrega os dados do seguro     
        return exit;  //Devolve a string de saida
    }
    
    public String cancelarseguro(){//a devolver 20%
    
        String exit="";  //Variavel de saida
        double a_devolver=this.preco*0.20;
        exit="Seguro cancelado, valor a devolver 20% de "+this.preco+"="+a_devolver;  //Agrega o valor a devolver do seguro
        this.setActivo(false);  //Passa a desactivado
        return exit;  //Devolve a string de saida
    }

    /**
     * @param a_devolver the a_devolver to set
     */
    public void setA_devolver(double a_devolver) {
        this.a_devolver = a_devolver;
    }

    /**
     * @return the a_devolver
     */
    public double getA_devolver() {
        return a_devolver;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * @return the tipo
     */
    public tseguro getTipo() {
        return tipo;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }
}
