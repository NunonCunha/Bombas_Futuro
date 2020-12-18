
package connections;

import GUI.Supervisor;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import javax.swing.JTextArea;

/**
 *
 * @author Grupo A
 */
public class Conn {
     
    //Objectos
    Random rand = new Random();
    
    //URL da base de dados
    private final String url = "jdbc:mysql://localhost:3306/energy_station?zeroDateTimeBehavior=CONVERT_TO_NULL"; 
    
    //utilizador e password da base de dados
    private final String username = "root";
    private final String password = "123456";
    
    //Atributos
    private String nome;
    private String apelido;
    private String nif;
    private String posto;
    private String idPosto;    
    private String tipoEnergia;
    private String valorUnitario;    
    private String quantidadeAbastecer;    
    private String valorTotalAbastecimento; 
    private String fatura;    
    private String faturaFinal;
    
    //Atributos para manipulação de variáveis
    private int auxFatura;
    private int auxquantidadeAbastecer;
    private int auxvalorTotalAbastecimento;
    private int auxvalorUnitario;
    private int randomPosto;
    private String bomba;  
    private String valorTotalBomba ;
    private String quantidadeTotalBomba ;
    private String totalValorPosto;
    private String totalQuantidadePosto;
   
    //Atributos para querys
    private String queryVendas;
    private String queryValorTotalBomba;
    private String queryQuantidadeTotalBomba; 
    private String queryValorTotalPosto;
    private String queryQuantidadeTotalPosto;
    private String energia;
    
    //atributos para supervisor
    private String userSupervisor;
    private String passSupervisor;
       
    /*
    //Criação de listas para retorno de diversos valores da BD
    List<String> list1 = new ArrayList();    
    String value1 ;
    */
 
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
    
    public void connGetDataSupervisor (){//Retorna informação relativa a ultima factura na tabela vendas, o valor unitário do combustivel selecionado,e o posto disponível
                 
        try{       
            
             // criação do objecto para a ligação a base de dados
            Connection connection = DriverManager.getConnection(this.url,this.username,this.password);            
           
            //Criação de objecto com base na biblioteca java.sql.Statement
            Statement stmt = connection.createStatement();  
                        
            //Criação de objecto pa execução de query's com base na biblioteca java.sql.ResultSet
            ResultSet totalBombaResult = stmt.executeQuery(this.queryValorTotalBomba);
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
             
            while (totalBombaResult.next()) {             
              this.valorTotalBomba = totalBombaResult.getString("SUM(total)");                
            }    
            
            ResultSet quantidadeBombaResult = stmt.executeQuery(this.queryQuantidadeTotalBomba);
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (quantidadeBombaResult.next()) {             
              this.quantidadeTotalBomba = quantidadeBombaResult.getString("SUM(quantidade)");                
            } 
            
            /*                
                //acesso as listas para guardar valores
                value1 = totalBombaResult.getString("tipo_energia");
                list1.add(value1);               
                value1 = totalBombaResult.getString("SUM(valor_unidade)");
                list1.add(value1);                
                value1 = totalBombaResult.getString("SUM(quantidade)");
                list1.add(value1);

            }

            int j = list1.size();
            for(int i = 0; i < j ; i++){

                    System.out.println("\nEnergia: "+list1.get(++i)+" \nValor: "+list1.get(++i)+" \nQuantidade: "+list1.get(++i));                
            
            }
            
            */   
                 
             connection.close();
        }
        
        //Caso exista algum erro, e lançada uma mensagem de excepção
        catch (SQLException e){
            
            System.out.println("Não foi possível retornar valores");
            
            e.printStackTrace();
            
        }
        
    }
    
        public void connGetTotalPosto (){//Retorna informação relativa a ultima factura na tabela vendas, o valor unitário do combustivel selecionado,e o posto disponível
                 
        try{       
            
             // criação do objecto para a ligação a base de dados
            Connection connection = DriverManager.getConnection(this.url,this.username,this.password);            
           
            //Criação de objecto com base na biblioteca java.sql.Statement
            Statement stmt = connection.createStatement();  
                        
            //Criação de objecto pa execução de query's com base na biblioteca java.sql.ResultSet
            ResultSet totalValorPostoResult = stmt.executeQuery(this.queryValorTotalPosto);
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (totalValorPostoResult.next()) {
             
              this.totalValorPosto = totalValorPostoResult.getString("SUM(total)");
              
            }
              ResultSet totalQuantidadePostoResult = stmt.executeQuery(this.queryQuantidadeTotalPosto);
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (totalQuantidadePostoResult.next()) {
            
              this.totalQuantidadePosto = totalQuantidadePostoResult.getString("SUM(quantidade)");
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
    
    public void valorTotalbomba(){
        //this.queryValorTotalBomba = "SELECT tipo_energia, SUM(valor_unidade), SUM(quantidade) FROM energy_station.vendas where posto_abs = "+this.bomba+" group by tipo_energia;";
        this.queryValorTotalBomba = "SELECT SUM(total) FROM energy_station.vendas WHERE posto_abs ="+this.bomba+"";
    }
    
    public void quantidadeTotalBomba(){
        this.queryQuantidadeTotalBomba = "SELECT SUM(quantidade) FROM energy_station.vendas WHERE posto_abs ="+this.bomba+"";
    }
    
    public void totalPosto(){
        this.queryValorTotalPosto = "SELECT SUM(total) FROM energy_station.vendas";
        this.queryQuantidadeTotalPosto = "SELECT SUM(quantidade) FROM energy_station.vendas";
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

    public void setBomba(String bomba) {
        this.bomba = bomba;
    }

    public String getValorTotalBomba() {
        return valorTotalBomba;
    }

    public String getQuantidadeTotalBomba() {
        return quantidadeTotalBomba;
    }

    public String getTotalValorPosto() {
        return totalValorPosto;
    }

    public String getTotalQuantidadePosto() {
        return totalQuantidadePosto;
    }
/*
    public String[] getList1() {
        
            
        return data[];
    }
*/
    
   
}
