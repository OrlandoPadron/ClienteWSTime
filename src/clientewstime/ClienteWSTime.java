/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientewstime;

/**
 *
 * @author OrlandoPadrón
 */
public class ClienteWSTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instanciamos NewJerseyClient.
        NewJerseyClient cliente = new NewJerseyClient(); 
        
        //Salida 
        System.out.println(cliente.getJson()); 

        
    }
    
}
