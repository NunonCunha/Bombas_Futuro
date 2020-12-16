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
    
        motor test = new motor();        
        
        test.connGetClientes(test.getCode());
        System.out.println(test.getCode());
                
        
    }
    
    
    
    
}
