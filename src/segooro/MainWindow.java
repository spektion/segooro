/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segooro;

import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.*;
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
public class MainWindow extends javax.swing.JFrame {
    BD bd = new BD();
    /**
     * Creates new form NewJFrame
     */
    public MainWindow() {
        initComponents();
        initApp();
        ImageIcon image = new ImageIcon("logo_quadrado.jpg");
                JLabel label = new JLabel("", image, JLabel.CENTER);
                JPanel panel = new JPanel(new BorderLayout());
                
                panel.add( label, BorderLayout.CENTER );
                JPanel panellistaragentes = new JPanel(new BorderLayout());
                
    }
    
    private void initApp(){
        Date tdata=null;  //Variavel data
        
        
        try {
            FileInputStream fis = new FileInputStream("dados.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            BD tbd=(BD)ois.readObject(); 
            bd=tbd;
            ois.close();
           // System.out.println("Ficheiro lido com sucesso");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        /* Criacao Manual de titular/agente/seguros
        bd.listatitulares.add(new Titular("Tony Ramos","Avenida do Uruguay n13, Buzios",64));
        bd.listaagentes.add(new Agente("Jose Alberto"));
        bd.listaclientes.add(new Cliente(bd.listatitulares.get(0),bd.listaagentes.get(0)));
        
        //cliente1= new Cliente(new Titular("Tony Ramos","Avenida do Uruguay n13, Buzios",tdata),new Agente("Jose Alberto"));  //Criamos um novo cliente
        int idade=64;
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
        
        System.out.print(bd.listaclientes.get(0).toString()); //Lista tudo
        
        System.out.println(bd.listaagentes.get(0).nome); */
        
        /*
        try {       
            FileOutputStream fout = new FileOutputStream("dados.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(bd);
            oos.close();
            //System.out.print("SUCESSO");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }*/
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Benvindo ao Segooro v1.0"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(447, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jMenu1.setText("Ficheiro BD");

        jMenuItem2.setText("Abrir BD");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Gravar BD");
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem4.setText("Sair");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Agente");

        jMenuItem1.setText("Listar Agentes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Titulares");

        jMenuItem5.setText("Listar Titulares");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1142, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(647, 647, 647)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(647, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1167, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(632, 632, 632)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(632, Short.MAX_VALUE)))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>                        

    private void formComponentResized(java.awt.event.ComponentEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
       // jTextField1.setVisible(true);
       // jTextField1.setText("teste");
        //jTextField1.setText(Integer.toString(bd.listaagentes.size()));
       
        //jTextField1.setText(bd.listaagentes.get(0).getNome());
        //jPanel2.jComboBox1.addItem(bd.listaagentes.get(0).toString());
       //jPanel2.
    }                                          

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        try {       
            FileOutputStream fout = new FileOutputStream("dados.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(bd);
            oos.close();
            System.out.println("SUCESSO");
            JOptionPane.showMessageDialog(null, "Ficheiro de dados gravado com sucesso");
            System.out.println(bd.listaclientes.get(0).toString()); //Para teste
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.exit(0);
    }                                          

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
       
        //Date tdata=null;  //Variavel data
        //BD bd = new BD();
        
        //Cliente cliente1=null; //Cliente
        /*
        try {
            FileInputStream fis = new FileInputStream("dados.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            BD tbd=(BD)ois.readObject(); 
            bd=tbd;
            ois.close();
           // System.out.println("Ficheiro lido com sucesso");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }*/
        
        /*
        String data;  //Para formatação da data 
        data="23/11/1954"; //Para formatação da data 
        SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy"); //Para formatação da data 
        
        try{//Para formatação da data 
            tdata=sdf1.parse(data);//Para formatação da data 
        }//Para formatação da data 
        catch(ParseException e){//Para formatação da data 
            System.out.println("Erro no parse da Data!!!");//Para formatação da data 
        }*/
        
        
        Calendar dateOfBirth = new GregorianCalendar();//Para calculo da idade
        //dateOfBirth.setTime(tdata);
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
        */
//        System.out.print(bd.listaclientes.get(0).toString()); //Lista tudo
        
//        System.out.println(bd.listaagentes.get(0).nome);
/*        try {       
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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration                   
}
