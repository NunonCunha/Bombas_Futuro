/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import GUI.LogIn_Cliente;

/**
 *
 * @author NCUNHA
 */
public class teste {
    
    
    public static void main (String[] args){
    
    Conn connection = new Conn();
    
    connection.connGetClientes("1705170005");
    connection.connGetData("plasma");
    
    System.out.println(connection.getValorUnitario());
    System.out.println(connection.getFatura());
    System.out.println(connection.getNome());
    System.out.println(connection.getApelido());
    System.out.println(connection.getNif());
                
        
    }
    
    
    
    
}
