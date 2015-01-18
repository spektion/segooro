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
   public ArrayList<Agente> listaagentes;
   public ArrayList<Titular> listatitulares;
   public ArrayList<Cliente> listaclientes;
   
   public BD(){
       this.listaagentes=new ArrayList();
       this.listaclientes=new ArrayList();
       this.listatitulares=new ArrayList();;
       
   }
   
   public String toString() //To String
    {
        String exit="";  //Declaração de variavel de saida;
        for (int i=0;i<this.getListaagentes().size();i++)
          exit=exit+"Dados do Agente: AgenteID:"+this.getListaagentes().get(i).getAgenteid()+" Nome:"+this.getListaagentes().get(i).getNome()+"/n";  //Atribuição       
        for (int i=0;i<this.getListatitulares().size();i++)
          exit=exit+"Dados do Titular: CienteID:"+this.getListatitulares().get(i).clienteid+" Nome:"+this.getListatitulares().get(i).nome+"/n";  //Atribuição       
        return exit;  //Saida
    } 

    /**
     * @return the listaagentes
     */
    public ArrayList<Agente> getListaagentes() {
        return listaagentes;
    }

    /**
     * @param listaagentes the listaagentes to set
     */
    public void setListaagentes(ArrayList<Agente> listaagentes) {
        this.listaagentes = listaagentes;
    }

    /**
     * @return the listatitulares
     */
    public ArrayList<Titular> getListatitulares() {
        return listatitulares;
    }

    /**
     * @param listatitulares the listatitulares to set
     */
    public void setListatitulares(ArrayList<Titular> listatitulares) {
        this.listatitulares = listatitulares;
    }

    /**
     * @return the listaclientes
     */
    public ArrayList<Cliente> getListaclientes() {
        return listaclientes;
    }

    /**
     * @param listaclientes the listaclientes to set
     */
    public void setListaclientes(ArrayList<Cliente> listaclientes) {
        this.listaclientes = listaclientes;
    }
   
}
