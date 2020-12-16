/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import GUI.LogIn_Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author NCUNHA
 */
public class motor {
    
    //objectos
    LogIn_Cliente codigo = new LogIn_Cliente();   
    
    //Atributos
    
    //URL da base de dados
    private final String url = "jdbc:mysql://localhost:3306/energy_station?zeroDateTimeBehavior=CONVERT_TO_NULL"; 
    
    //utilizador e password
    private final String username = "root";
    private final String password = "123456";
    
    //Atributos Clientes        
    private String nome;
    private String apelido;
    private String nif;
    //private String posto;
    private String tipoEnergia;
    private String valorUnitario;
    private String fatura;
    
    
    //Atributos Supervisor
    
    //Atributos Log in
    private String code;
    private boolean result;
    
    
    
    
        
    //Métodos
    
    //------------------Ligação para retorno de informação para clientes---------------------------------------------------------------------------------------------------------------------------------------------
        
    public void connGetClientes (String code){        
                 
        try{       
            
             // criação do objecto para a ligação a base de dados
            Connection connection = DriverManager.getConnection(this.url,this.username,this.password);            
           
            //Criação de objecto com base na biblioteca java.sql.Statement
            Statement stmt = connection.createStatement();  
                        
            //Criação de objecto pa execução de query's com base na biblioteca java.sql.ResultSet
            ResultSet clienteResult = stmt.executeQuery("SELECT nome,apelido,nif from energy_station.clientes where nif ="+code+"");
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (clienteResult.next()) {
             
              this.nome = clienteResult.getString("nome");
              this.apelido = clienteResult.getString("apelido");
              this.nif = clienteResult.getString("nif");
                
            }
            
            System.out.println(this.nome);
            System.out.println(this.apelido);
            System.out.println(this.nif);
          
        }
        
        //Caso exista algum erro, e lançada uma mensagem de excepção
        catch (SQLException e){
            
            System.out.println("Não foi possível retornar valores");
            
            e.printStackTrace();
            
        }        
    } 
    
    public void logInCliente(){        
               
        connGetClientes(code);
        
        if (this.nif == code){
            this.result = true;           
        }
        else{
            this.result = false;
        }

        
    }
    
    public boolean isResult(){
        return this.result;
    }
    
    public void setCode(String code){
        this.code = code;        
    }
    public String getCode(){
        return code;
    }
    
    
    
}
