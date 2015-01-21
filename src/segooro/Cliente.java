/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segooro;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author a
 */
public class Cliente implements Serializable{ //Declaração de class
    public Titular titular;  //  Titular do seguro
    public Agente agente;  //Vendedor do seguro
    public ArrayList<Seguro> listaseguros;  //lista de seguros deste cliente
    public boolean activo; 
    
    
    public Cliente(Titular t, Agente a){  //Construtor do cliente
        this.titular=t;  //Titular
        this.agente=a;  //Agente
        this.listaseguros= new ArrayList(); //lista de seguros
        this.activo=false;
    }
    
    public String toString(){  //To string
        String exit="";  //Variavel de saida
        
        exit=this.getTitular().toString()+"\n"+this.getAgente().toString();  //lista titular e agente
        for (int i=0;i<this.getListaseguros().size();i++)  //percorre a lista de seguros
            exit=exit+"\n"+this.getListaseguros().get(i).toString()+"\n";  //Agrega os varios seguros
        return exit;  // Envia a string com o total
    }
    
    public void despesa_saude(double d){  //Metodo para activar despesa de saude
        for (int i=0;i<this.getListaseguros().size();i++){  //percorre a lista de seguros
            if ((this.getListaseguros().get(i).getTipo()==tseguro.Saude)&&(this.getListaseguros().get(i).isActivo()==true)){ //Se houver algum seguro de saude e estiver activo
                this.getListaseguros().get(i).despesa(d); //Vai activar a despesa para ser reembolsado
            }
        }
    }
    public void activar_casa(){  //Metodo para activar seguro da casa
       for (int i=0;i<this.getListaseguros().size();i++){  //percorre a lista de seguros
            if ((this.getListaseguros().get(i).getTipo()==tseguro.Casa)&&(this.getListaseguros().get(i).isActivo()==true)){//Se houver algum seguro de casa e estiver activo
                this.getListaseguros().get(i).casa();  //Vai activar seguro da casa e ser reembolsado
            }
        }  
    }   

    /**
     * @return the titular
     */
    public Titular getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    /**
     * @return the agente
     */
    public Agente getAgente() {
        return agente;
    }

    /**
     * @param agente the agente to set
     */
    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    /**
     * @return the listaseguros
     */
    public ArrayList<Seguro> getListaseguros() {
        return listaseguros;
    }

    /**
     * @param listaseguros the listaseguros to set
     */
    public void setListaseguros(ArrayList<Seguro> listaseguros) {
        this.listaseguros = listaseguros;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
