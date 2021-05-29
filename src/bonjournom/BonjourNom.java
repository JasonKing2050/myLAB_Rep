/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonjournom;
import aleatoire.*;
/**
 *
 * @author oeild
 */
public class BonjourNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person john = new Person("john", "Doe", 35);
        Person JF = new Person("JF", "Leb", 56);
        Person deux = new Person(args[0],args[1], 45);
        System.out.println("Prénom : "+ john.getFirstName()+ "\nNom : " + john.getLastName() + "\nAge :  " + john.getAge());
         System.out.println("Prénom : "+ JF.getFirstName()+ "\nNom : " +JF.getLastName() + "\nAge :  " + JF.getAge());
         System.out.println("Prénom : "+ deux.getFirstName()+ "\nNom : " +deux.getLastName() + "\nAge :  " + deux.getAge());

        
        System.out.println("Bonjour John Doe");
        // TODO code application logic here
    }
    
}
