/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import GUI.Client;
import connections.Conn;
import javax.swing.JOptionPane;



/**
 *
 * @author NCUNHA
 */
public class client {
    
    //Construtor
    Conn data = new Conn();
    
    //Atributos
    
    //logInCliente
    private String validation;
    boolean result;
    
    //getGuiClientes
    private int totalAbastecer;
    private String energia;
    
    //DadosVendas
    private String nome = data.getNome();
    private String apelido = data.getApelido();
    private String nif = data.getNif();
    private String posto;
    private String tipoEnergia ;
    private String valorUnitario = data.getValorUnitario();
    private String fatura = data.getFatura();
    private int auxFatura = 0;
    private String queryStringVendas;
    
    
    //Métodos
    
    public void logInCliente(String val){
        
        data.connGetClientes(val);
        
        this.validation = val;       
        
        if (data.getNif().equals(this.validation)){
            
            this.result = true;           
        }
        else{
            this.result = false;
        }
        
    }

    public boolean isResult() {
        return result;
    }   
    
    public void getGuiCliente(int totalAbastecer,String energia){
        
        this.totalAbastecer = totalAbastecer;
        this.energia = energia;
        
        System.out.println(this.totalAbastecer+" "+this.energia);
        
    }
    
    public void incrementoFatura(){
        
        //this.auxFatura = Integer.valueOf(this.fatura);
        System.out.println(data.getFatura());
        //this.auxFatura++;
        //this.fatura = Integer.toString(this.auxFatura);
        
        System.out.println(this.auxFatura);
        
    }
    
    
    public void dadosVendas(){            
        
        this.queryStringVendas = "insert into vendas values(now(), 18, 9894989004, 'Agard', 'Young', 4, 'Eletricidade', 2, 100, 200)";
    }
    
}
