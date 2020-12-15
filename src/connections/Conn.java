
package connections;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author NCUNHA
 */
public class Conn {
    
    //Criação do objecto          
    
    //URL da base de dados
    private String url = "jdbc:mysql://localhost:3306/energy_station?zeroDateTimeBehavior=CONVERT_TO_NULL";
        
    //utilizador e password
    private String username = "root";
    private String password = "123456";
                
    //Atributos
        
    private String nome;
    private String nif;

    
        
    //Métodos
    
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------
        
    public void connGetClientes (String nif){        
                 
        try{       
            
             // criação do objecto para a ligaçaõ a base de dados
            Connection connection = DriverManager.getConnection(this.url,this.username,this.password);            
           
            //Criação de objecto com base na biblioteca java.sql.Statement
            Statement stmt = connection.createStatement();  
                        
            //Criação de objecto pa execução de query's com base na biblioteca java.sql.ResultSet
            ResultSet rs = stmt.executeQuery("SELECT nome,nif from clientes where nif ="+nif+"");
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (rs.next()) {
             
              this.nome = rs.getString("nome");
              this.nif = rs.getString("nif");
                
            }

            System.out.println("Ligado a Base de Dados");
            System.out.println(this.nome);
            System.out.println(this.nif);
        }
        
        //Caso exista algum erro, e lançada uma mensagem de excepção
        catch (SQLException e){
            
            System.out.println("Não foi retornar valores");
            
            e.printStackTrace();
            
        }
        
    }   
    
    //------------------Inserir informação---------------------------------------------------------------------------------------------------------------------------------------------
    
    public void connInsertClientes (){        
                 
        try{       
            
             // criação do objecto para a ligaçaõ a base de dados
            Connection connection = DriverManager.getConnection(this.url,this.username,this.password);            
           
            //Criação de objecto com base na biblioteca java.sql.Statement
            Statement stmt = connection.createStatement();  
                        
            //Criação de objecto para execução de query's com base na biblioteca java.sql.ResultSet
            stmt.executeUpdate("Insert into vendas(fatura_nr, nif_cliente, nome_cliente, apelido_cliente, posto_abs, tipo_energia, valor_unidade, quantidade, total)\n" +
                                "values ('AA0020', 2057205007, 'Ronald', 'Lee', 3, 'Eletricidade', 2, 30, 200)");

        }
        
        //Caso exista algum erro, e lançada uma mensagem de excepção
        catch (SQLException e){
            
            System.out.println("Não foi possivel gravar valores");
            
            e.printStackTrace();
            
        }
        
    }  

   //---------------------------------------------------------------------------------------------------------------------------------------------------------------

    public void conngetSupervisor (){        
                 
        try{       
            
             // criação do objecto para a ligaçaõ a base de dados
            Connection connection = DriverManager.getConnection(url,username,password);            
           
            //Criação de objecto com base na biblioteca java.sql.Statement
            Statement stmt = connection.createStatement();  
                        
            //Criação de objecto pa execução de query's com base na biblioteca java.sql.ResultSet
            ResultSet rs = stmt.executeQuery("SELECT * from ");
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (rs.next()) {
                             
            }
                /*
                nome = rs.getString("presidentName");
                partido = rs.getString("politicalParty");            
            }      
           */
            System.out.println("Ligado a Base de Dados");
            //System.out.println();
            //System.out.println();
        }
        
        //Caso exista algum erro, e lançada uma mensagem de excepção
        catch (SQLException e){
            
            System.out.println("Não foi possível ligar á Base de Dados");
            
            e.printStackTrace();
            
        }
        
    } 
    
    
    //--------------------Ligação para o Log in-------------------------------------------------------------------------------------------------------------------------------------------
    
    
    public void connGetLogin (String user){        
                 
        try{       
            
             // criação do objecto para a ligaçaõ a base de dados
            Connection connection = DriverManager.getConnection(this.url,this.username,this.password);            
           
            //Criação de objecto com base na biblioteca java.sql.Statement
            Statement stmt = connection.createStatement();  
                        
            //Criação de objecto pa execução de query's com base na biblioteca java.sql.ResultSet
            ResultSet rs = stmt.executeQuery("SELECT nome,nif from clientes where nif ="+nif+"");
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (rs.next()) {
             
              this.nome = rs.getString("nome");
              this.nif = rs.getString("nif");
                
            }

            System.out.println("Ligado a Base de Dados");
            System.out.println(this.nome);
            System.out.println(this.nif);
        }
        
        //Caso exista algum erro, e lançada uma mensagem de excepção
        catch (SQLException e){
            
            System.out.println("Não foi retornar valores");
            
            e.printStackTrace();
            
        }
        
    } 
      
    
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    
    
    
    
    
       

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }


    
        
}
