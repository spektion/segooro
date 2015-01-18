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
public class Agente implements Serializable {  //Declaracao de class
   //private int ultimonum=1;  //Controla o ID dos Agentes
   public String nome; //Nome do agente
   public int agenteid;  //Id do agente
   
   public Agente(String n, int nagentes)  //Contrutor
    {
        this.nome=n;  //Atribui o nome
        this.agenteid=nagentes+1;  //Atribui o ID
    }
   
   public String toString() //To String
    {
        String exit="";  //Declaração de variavel de saida;
        exit="Dados do Agente: AgenteID:"+this.getAgenteid()+" Nome:"+this.getNome();  //Atribuição       
        return exit;  //Saida
    } 

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the agenteid
     */
    public int getAgenteid() {
        return agenteid;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param agenteid the agenteid to set
     */
    public void setAgenteid(int agenteid) {
        this.agenteid = agenteid;
    }
}
