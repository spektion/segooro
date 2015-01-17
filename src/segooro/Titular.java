/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segooro;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author a
 */
public class Titular  implements Serializable{  //Declaração de Class
   private static int ultimonum=1;  //Para atribiur ID;
   public String nome;  //Nome
   private String morada;  //Morada
   private Date datanascimento;  //Data de Nascimento
   public int clienteid;  //Cliente ID
   
   public Titular(String n,String m,Date d){  //Construtor
        this.nome=n;  //Atribui nome
        this.morada=m;  //Atribui morada 
        this.datanascimento = d;  //Atribui data de nascimento
        this.clienteid=ultimonum++;  //Atribui ID
    }
   
   public String toString()  //Metodo ToString
    {
        String exit="";  //Variavel de saida
        SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy"); //Formatação
        exit="Dados do Titular: CienteID:"+this.getClienteid()+" Nome:"+this.getNome()+" Morada:"+this.morada+" Data Nascimento:"+sdf1.format(this.datanascimento); //Agrega dados do utilizador       
        return exit;  //Devolve a string
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the clienteid
     */
    public int getClienteid() {
        return clienteid;
    }
}