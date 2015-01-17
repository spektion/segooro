/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segooro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author a
 */
public class SegooroMain {  //Declaração de class
    
    //public static void main(String[] args) {  //Main
       /* 
        Date tdata=null;  //Variavel data
        BD bd = new BD();
        
        //Cliente cliente1=null; //Cliente
        
        try {
            FileInputStream fis = new FileInputStream("dados.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            BD tbd=(BD)ois.readObject(); 
            bd=tbd;
            ois.close();
            System.out.println("Ficheiro lido com sucesso");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        String data;  //Para formatação da data 
        data="23/11/1954"; //Para formatação da data 
        SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy"); //Para formatação da data 
        
        try{//Para formatação da data 
            tdata=sdf1.parse(data);//Para formatação da data 
        }//Para formatação da data 
        catch(ParseException e){//Para formatação da data 
            System.out.println("Erro no parse da Data!!!");//Para formatação da data 
        }
        
        
        Calendar dateOfBirth = new GregorianCalendar();//Para calculo da idade
        dateOfBirth.setTime(tdata);
        Calendar hoje = Calendar.getInstance();// Cria um objeto calendar com a data atual
        int idade = hoje.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);// Obtém a idade baseado no ano
        dateOfBirth.add(Calendar.YEAR, idade);  // Obter idade
        if (hoje.before(dateOfBirth)) {  //Se a data for anterior ao dia de hoje
            idade--;//se a data de hoje é antes da data de Nascimento, então diminui 1ano
        }
        /*
        bd.listatitulares.add(new Titular("Tony Ramos","Avenida do Uruguay n13, Buzios",tdata));
        bd.listaagentes.add(new Agente("Jose Alberto"));
        bd.listaclientes.add(new Cliente(bd.listatitulares.get(0),bd.listaagentes.get(0)));
        
        //cliente1= new Cliente(new Titular("Tony Ramos","Avenida do Uruguay n13, Buzios",tdata),new Agente("Jose Alberto"));  //Criamos um novo cliente
        
        bd.listaclientes.get(0).listaseguros.add(new Tsvida(200)); //Adicionamos um seguro de vida
        
        if (idade>80){ //Se tiver acima de 80 não pode fazer seguro
           System.out.print("A idade nao permite fazer nenhum seguro"); //Mensagem ao utilizador
        }
        else
           if (idade<17){  //Se tiver menos de 17 é junior
               bd.listaclientes.get(0).listaseguros.add(new Tssaude(100,2500)); //Criado seguro saude junior
           }
           else{
               if (idade>59)  //É senior?
                 bd.listaclientes.get(0).listaseguros.add(new Tssaude(150+idade,5000)); //Criado seguro saude senior
               else //Então é adulto
                 bd.listaclientes.get(0).listaseguros.add(new Tssaude(150+idade,0)); //Criado seguro saude adulto
           }
    
        bd.listaclientes.get(0).despesa_saude(100);  //Adiciona despesa de saude
        //cliente1.despesa_saude(100000);  //Para testar limite
        
        bd.listaclientes.get(0).listaseguros.add(new Tscasa(100)); //Adiciona seguro da casa
        System.out.print(bd.listaclientes.get(0).toString());  //  Lista tudo
    
        bd.listaclientes.get(0).activar_casa();  //Activado seguro da casa
        System.out.print(bd.listaclientes.get(0).toString());  //  Lista tudo
        
        tveiculo tempv=tveiculo.Carro; //Tipo de veiculo a segurar
        boolean acidentes=false;  //Tem acidentes?
                
        if (tempv==tveiculo.Carro){  // É carro?
            if (acidentes==false)  //Não teve acidentes?
                bd.listaclientes.get(0).listaseguros.add(new Tsveiculo(250*0.97,tveiculo.Carro,false)); //Desconto de 3%
            else  // É porque teve acidentes
                bd.listaclientes.get(0).listaseguros.add(new Tsveiculo(250*1.05,tveiculo.Carro,false)); //Penalização de 5%
        }
        else  //Então é mota
            if (acidentes==false) //Não teve acidentes?
                bd.listaclientes.get(0).listaseguros.add(new Tsveiculo(150*0.97,tveiculo.Moto,false)); //Desconto de 3%
            else  // É porque teve acidentes
                bd.listaclientes.get(0).listaseguros.add(new Tsveiculo(150*1.05,tveiculo.Moto,false)); //Penalização de 5%
        */ /*
        System.out.print(bd.listaclientes.get(0).toString()); //Lista tudo
         
        try {       
            FileOutputStream fout = new FileOutputStream("dados.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(bd);
            oos.close();
            //System.out.print("SUCESSO");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
     */
   // }
}