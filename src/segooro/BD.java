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
public class BD implements Serializable{
   ArrayList<Agente> listaagentes;
   ArrayList<Titular> listatitulares;
   ArrayList<Cliente> listaclientes;
   
   public BD(){
       this.listaagentes=new ArrayList();
       this.listaclientes=new ArrayList();
       this.listatitulares=new ArrayList();;
       
   }
   
   public String toString() //To String
    {
        String exit="";  //Declaração de variavel de saida;
        for (int i=0;i<this.listaagentes.size();i++)
          exit=exit+"Dados do Agente: AgenteID:"+this.listaagentes.get(i).agenteid+" Nome:"+this.listaagentes.get(i).nome+"/n";  //Atribuição       
        for (int i=0;i<this.listatitulares.size();i++)
          exit=exit+"Dados do Titular: CienteID:"+this.listatitulares.get(i).clienteid+" Nome:"+this.listatitulares.get(i).nome+"/n";  //Atribuição       
        return exit;  //Saida
    } 
   
}
