/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NCUNHA
 */
public class test_connections {
    

    
    public static void main (String[] args){
        
        Conn connection = new Conn();
        
        String nif = "1477147007";
        
        connection.connGetClientes(nif);
        connection.connInsertClientes();
       
             
        Date date = new Date();
        
        SimpleDateFormat format = new SimpleDateFormat();
        System.out.println(format.format(date));
        
        
    }


    
}
