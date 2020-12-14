
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
        String url = "jdbc:mysql://localhost:3306/president?zeroDateTimeBehavior=CONVERT_TO_NULL";
        
        //utilizador e password
        String username = "root";
        String password = "123456";
                
        //Atributos

        
    //Método Construtor
    public String conn (int valor){  
        
                 
        try{       
            
             // criação do objecto para a ligaçaõ a base de dados
            Connection connection = DriverManager.getConnection(url,username,password);
                       
            //Criação de objecto com base na biblioteca java.sql.Statement
            Statement stmt = connection.createStatement();  
                        
            //Criação de objecto pa execução de query's com base na biblioteca java.sql.ResultSet
            ResultSet rs = stmt.executeQuery("SELECT * from ");
                        
            //Percorre a base de dados a procura da informação e retorna a mesma
            while (rs.next()) {
                /*
                nome = rs.getString("presidentName");
                partido = rs.getString("politicalParty");
                iMandato = rs.getString("startDate");
                fMandato = rs.getString("endDate");
                bio = rs.getString("sNarrative");
                numero = rs.getString("presidentID");
                votos = rs.getString("lectoralCollegeVotes");
                imagem = rs.getString("url");
                */
            }      
            
            System.out.println("Ligado a Base de Dados"); 
        }
        
        //Caso exista algum erro, e lançada uma mensagem de excepção
        catch (SQLException e){
            
            System.out.println("Não foi possível ligar á Base de Dados");
            
            e.printStackTrace();
            
        }
        int i = 0;
            return ""+i;
        
    }        
        
}
