/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonjournom;
import aleatoire.*;


/**
 *
 * @author JF
 */
public class BonjourNom {

    /**
     * @param args the command line arguments
     * psvm-tab
     */
    public static void main(String[] args) {
        
        Person john = new Person(args[0], args[1], 45);
        
        System.out.println("Bonjour "+ john.getFirstName()+" "+
                john.getLastName()+" "+ john.getAge());
    }
    
}
