
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
                  
    //Atributos
    
    //URL da base de dados
    private final String url = "jdbc:mysql://localhost:3306/energy_station?zeroDateTimeBehavior=CONVERT_TO_NULL"; 
    
    //utilizador e password da base de dados
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
    private String supervisorRole = "";
    private String clienteRole = "";
    
    
    
    
        
    //Métodos
    
    //------------------Ligação para retorno de informação para clientes---------------------------------------------------------------------------------------------------------------------------------------------
        
    public void connGetClientes (String nif){        
                 
        try{       
            
             // criação do objecto para a ligação a base de dados
            Connection connection = DriverManager.getConnection(this.url,this.username,this.password);            
           
            //Criação de objecto com base na biblioteca java.sql.Statement
            Statement stmt = connection.createStatement();  
                        
            //Criação de objecto pa execução de query's com base na biblioteca java.sql.ResultSet
            ResultSet clienteResult = stmt.executeQuery("SELECT nome,apelido,nif from energy_station.clientes where nif ="+nif+"");
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (clienteResult.next()) {
             
              this.nome = clienteResult.getString("nome");
              this.apelido = clienteResult.getString("apelido");
              this.nif = clienteResult.getString("nif");
                
            }
            
            /*
            ResultSet postoResult = stmt.executeQuery("SELECT posto from energy_station.postos where posto ='"+posto+"'");
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (postoResult.next()) {
             
              this.posto = postoResult.getString("posto");
                            
            }
            
            
            ResultSet energiaResult = stmt.executeQuery("SELECT tipo_energia,valor_unidade from energy_station.energia where tipo_energia ='"+energia+"'");
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (energiaResult.next()) {
             
              this.tipoEnergia = energiaResult.getString("tipo_energia");
              this.valorUnitario = energiaResult.getString("valor_unidade");
                
            }
            */
            ResultSet vendaResult = stmt.executeQuery("SELECT fatura_nr FROM energy_station.vendas ORDER BY fatura_nr DESC LIMIT 1");
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (vendaResult.next()) {
             
              this.fatura = vendaResult.getString("fatura_nr");
              
                
            }
            
            /*
            System.out.println("Ligado a Base de Dados");
            System.out.println(this.nome);
            System.out.println(this.apelido);
            System.out.println(this.nif);
            System.out.println(this.posto);
            System.out.println(this.tipoEnergia);
            System.out.println(this.valorUnitario);
            System.out.println(this.fatura);
            */
        }
        
        //Caso exista algum erro, e lançada uma mensagem de excepção
        catch (SQLException e){
            
            System.out.println("Não foi possível retornar valores");
            
            e.printStackTrace();
            
        }
        
    }   

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }   

    public String getNif() {
        return nif;
    }  
/*
    public String getPosto() {
        return posto;
    }   
*/
    public String getTipoEnergia() {
        return tipoEnergia;
    }    

    public String getValorUnitario() {
        return valorUnitario;
    }    

    public String getFatura() {
        return fatura;
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
    
    
    public String connGetLoginSupervisor (String password, String nif){        
                 
        try{       
            
             // criação do objecto para a ligaçaõ a base de dados
            Connection connection = DriverManager.getConnection(this.url,this.username,this.password);            
           
            //Criação de objecto com base na biblioteca java.sql.Statement
            Statement stmt = connection.createStatement();  
                        
            //Criação de objecto pa execução de query's com base na biblioteca java.sql.ResultSet
            ResultSet supervisorPass = stmt.executeQuery("SELECT roles FROM energy_station.controlo_acessos Where password = '"+password+"'");
                                    
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (supervisorPass.next()) {
             
              this.supervisorRole = supervisorPass.getString("roles");
                
            }            
            
            ResultSet clienteCod = stmt.executeQuery("SELECT role FROM energy_station.clientes Where nif = '"+nif+"'");
            while (clienteCod.next()) {
             
                this.clienteRole = clienteCod.getString("role");
                
            }

            System.out.println("Ligado a Base de Dados");
            System.out.println(this.supervisorRole+" "+this.clienteRole);
            

        }
        
        //Caso exista algum erro, e lançada uma mensagem de excepção
        catch (SQLException e){
            
            System.out.println("Não foi retornar valores");
            
            e.printStackTrace();
            
        }
        
        if (this.supervisorRole != null || this.clienteRole != null ){            
            return "utilizador não encontrado";            
        }
        else{        
            return this.supervisorRole+" "+ this.clienteRole;            
        }
        
    } 
      
    
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------
        
       
        public String connGetLoginCliente (String password, String nif){        
                 
        try{       
            
             // criação do objecto para a ligaçaõ a base de dados
            Connection connection = DriverManager.getConnection(this.url,this.username,this.password);            
           
            //Criação de objecto com base na biblioteca java.sql.Statement
            Statement stmt = connection.createStatement();  
                        
            //Criação de objecto pa execução de query's com base na biblioteca java.sql.ResultSet
            ResultSet supervisorPass = stmt.executeQuery("SELECT roles FROM energy_station.controlo_acessos Where password = '"+password+"'");
                                    
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (supervisorPass.next()) {
             
              this.supervisorRole = supervisorPass.getString("roles");
                
            }            
            
            ResultSet clienteCod = stmt.executeQuery("SELECT role FROM energy_station.clientes Where nif = '"+nif+"'");
            while (clienteCod.next()) {
             
                this.clienteRole = clienteCod.getString("role");
                
            }

            System.out.println("Ligado a Base de Dados");
            System.out.println(this.supervisorRole+" "+this.clienteRole);
            

        }
        
        //Caso exista algum erro, e lançada uma mensagem de excepção
        catch (SQLException e){
            
            System.out.println("Não foi retornar valores");
            
            e.printStackTrace();
            
        }
        
        if (this.supervisorRole != null || this.clienteRole != null ){            
            return "utilizador não encontrado";            
        }
        else{        
            return this.supervisorRole+" "+ this.clienteRole;            
        }
        
    } 
        
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------    
   
        
}
