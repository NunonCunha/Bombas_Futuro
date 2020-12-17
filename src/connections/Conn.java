
package connections;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

/**
 *
 * @author Grupo A
 */
public class Conn {
     
    //Objectos
    Random rand = new Random();
    
    
    //Atributos
    
    //URL da base de dados
    private final String url = "jdbc:mysql://localhost:3306/energy_station?zeroDateTimeBehavior=CONVERT_TO_NULL"; 
    
    //utilizador e password da base de dados
    private final String username = "root";
    private final String password = "123456";
    
    
    private String nome;
    private String apelido;
    private String nif;
    private String posto;
    private String idPosto;
    private int randomPosto;
    private String tipoEnergia;
    private String valorUnitario;
    private int auxvalorUnitario;
    private String quantidadeAbastecer;
    private int auxquantidadeAbastecer;
    private int auxvalorTotalAbastecimento;
    private String valorTotalAbastecimento; 
    private String fatura;
    private int auxFatura;
    private String faturaFinal;
   
    private String queryVendas;
    
    private String userSupervisor;
    private String passSupervisor;
       
    
    //-----------------------------------------------------------Connections----------------------------------------------------------------------------------------------------
        
    public void connGetClientes (String nif){//retorna os atributos do Cliente     
                 
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
             connection.close();
        }
        
        //Caso exista algum erro, e lançada uma mensagem de excepção
        catch (SQLException e){
            
            System.out.println("Não foi possível retornar valores");
            
            e.printStackTrace();
            
        }
        
    }   
    
        public void connGetSupervisor (String user,String password){//retorna os atributos do Cliente     
                 
        try{       
            
             // criação do objecto para a ligação a base de dados
            Connection connection = DriverManager.getConnection(this.url,this.username,this.password);            
           
            //Criação de objecto com base na biblioteca java.sql.Statement
            Statement stmt = connection.createStatement();  
                        
            //Criação de objecto pa execução de query's com base na biblioteca java.sql.ResultSet
            ResultSet supervisorResult = stmt.executeQuery("SELECT username,password from energy_station.controlo_acessos where username ='"+user+"' and password = '"+password+"'");
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (supervisorResult.next()) {
             
              this.userSupervisor = supervisorResult.getString("username");
              this.passSupervisor = supervisorResult.getString("password");
                
            }
             connection.close();
        }
        
        //Caso exista algum erro, e lançada uma mensagem de excepção
        catch (SQLException e){
            
            System.out.println("Não foi possível retornar valores");
            
            e.printStackTrace();
            
        }
        
    }
    
    public void connGetData (String energia){//Retorna informação relativa a ultima factura na tabela vendas, o valor unitário do combustivel selecionado,e o posto disponível
                 
        try{       
            
             // criação do objecto para a ligação a base de dados
            Connection connection = DriverManager.getConnection(this.url,this.username,this.password);            
           
            //Criação de objecto com base na biblioteca java.sql.Statement
            Statement stmt = connection.createStatement();  
                        
            //Criação de objecto pa execução de query's com base na biblioteca java.sql.ResultSet
            ResultSet energiaResult = stmt.executeQuery("SELECT valor_unidade from energy_station.energia where tipo_energia ='"+energia+"'");
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (energiaResult.next()) {
             
              this.valorUnitario = energiaResult.getString("valor_unidade");
                
            }    
            
            ResultSet faturaResult = stmt.executeQuery("SELECT fatura_nr FROM energy_station.vendas ORDER BY fatura_nr DESC LIMIT 1");
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (faturaResult.next()) {
             
              this.fatura = faturaResult.getString("fatura_nr");
                
            }
            
            ResultSet postoResult = stmt.executeQuery("SELECT posto,idPosto FROM energy_station.postos where idPosto = '"+this.randomPosto+"'");
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (postoResult.next()) {
             
              this.posto = postoResult.getString("posto");
              this.idPosto = postoResult.getString("idPosto");
                
            }          
             connection.close();
        }
        
        //Caso exista algum erro, e lançada uma mensagem de excepção
        catch (SQLException e){
            
            System.out.println("Não foi possível retornar valores");
            
            e.printStackTrace();
            
        }
        
    }
    
    public void connInsertClientes (){        
                 
        try{       
            
             // criação do objecto para a ligaçaõ a base de dados
            Connection connection = DriverManager.getConnection(this.url,this.username,this.password);            
           
            //Criação de objecto com base na biblioteca java.sql.Statement
            Statement stmt = connection.createStatement();  
                        
            //Criação de objecto para execução de query's com base na biblioteca java.sql.ResultSet
            stmt.executeUpdate(this.queryVendas);
            
        }
        
        //Caso exista algum erro, e lançada uma mensagem de excepção
        catch (SQLException e){
            
            System.out.println("Não foi possivel gravar valores");
            
            e.printStackTrace();
            
        }
        
    } 
    
    //---------------------------------------------------------------Métodos para manipulação---------------------------------------------------------------------------------------------------------------
       
    public void insertVendas (){    
        
        incrementaFatura();
        valorTotalAbastecimento();
        randomPosto();
        
        this.queryVendas = "insert into vendas values(now(),"+this.faturaFinal+" , "+this.nif+", '"+this.nome+"', '"+this.apelido+"', "+this.randomPosto+", '"+this.tipoEnergia+"', "+this.valorUnitario+", "+this.quantidadeAbastecer+", "+this.valorTotalAbastecimento+")";
          
    }
    
    
    public void randomPosto(){
        randomPosto = rand.nextInt(10)+1;        
    }
    
    public void incrementaFatura(){
        this.auxFatura = Integer.parseInt(this.fatura);
        this.auxFatura++;       
        this.faturaFinal = Integer.toString(this.auxFatura);        
    }

    public void valorTotalAbastecimento(){
        
        this.auxvalorUnitario = Integer.parseInt(this.valorUnitario);
        this.auxquantidadeAbastecer = Integer.parseInt(this.quantidadeAbastecer);
        this.auxvalorTotalAbastecimento = this.auxquantidadeAbastecer*this.auxvalorUnitario;
        this.valorTotalAbastecimento = Integer.toString(this.auxvalorTotalAbastecimento);
        
    }
        
    //---------------------------------------------------------------Getters and Setters---------------------------------------------------------------------------------------------------------------
           
    public String getQuantidadeAbastecer() {
        return quantidadeAbastecer;
    }

    public void setQuantidadeAbastecer(String quantidadeAbastecer) {
        this.quantidadeAbastecer = quantidadeAbastecer;
    } 

    public String getValorUnitario() {
        return valorUnitario;
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

    public String getPosto() {
        return posto;
    }  

    public String getIdPosto() {
        return idPosto;
    }
    
    public void setTipoEnergia(String energia) {
        this.tipoEnergia = energia;
    }    
    
    public String getTipoEnergia() {
        return this.tipoEnergia;
    } 

    public String getFatura() {
        return fatura;
    }

    public int getAuxFatura() {
        return auxFatura;
    }

    public String getFaturaFinal() {
        return faturaFinal;
    }

    public String getUserSupervisor() {
        return userSupervisor;
    }

    public String getPassSupervisor() {
        return passSupervisor;
    }
    
   
}
