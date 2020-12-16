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
        
        String nif = "1071107001";
        String posto = "posto2";
        String energia = "Gasoleo";
        
        
        connection.connGetClientes(nif, posto, energia);
        
        System.out.println(connection.getNome());
        connection.getApelido();
        connection.getPosto();
        connection.getTipoEnergia();
        connection.getValorUnitario();
        connection.getFatura();
        
    }


    
}
