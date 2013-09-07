/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author J-Tron
 */
public class Startup{
    public static void main(String[] args){
    
        GameCharacter player1 = new GameCharacter();
        player1.setName("Felix");
        player1.setRace("Dwarf");
        player1.setHealthPoints(75);
        player1.setManaPoints(50);
       
        
        String direction;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which direction would you like to head? North, South, East, or West.");
        direction = keyboard.nextLine();
        
        player1.goOnAnAdventure(direction);
    }
    
   
}
