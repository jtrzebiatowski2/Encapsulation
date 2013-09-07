/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author J-Tron
 */
public class GameCharacter {
    private String name;
    private String race;
    private int healthPoints;
    private int manaPoints;
    private String [] gear;
    
//Default Constructor
   public GameCharacter(){
       
   }
//Game Character Constructor
    public GameCharacter(String name, String race, int healthPoints, int manaPoints, String[] gear) {
        this.name = name;
        this.race = race;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
        this.gear = gear;
    }
//variable to hold the direction the GameCharcter should head
    private String direction;
    
//This method encapsulates 3 different methods for the GameCharacter to perform a task
    public void goOnAnAdventure(String direction){
        walk(direction);
        findTreasure();
        encounterEnemy();
        
    }
 //Walk method that determines which direction the GameCharacter should travel
    private void walk(String direction){
        System.out.println("You are heading " + direction);
        if("North".equals(direction)){
            System.out.println("To the North we go");
            if("South".equals(direction)){
                System.out.println("To the South we go");
                if("East".equals(direction)){
                    System.out.println("To the East we go");
                    if("West".equals(direction)){
                        System.out.println("To the West we go");
                    }
                }
            }
        }
    }
//Method indicating the GameCharcter has found some gold
    private void findTreasure(){
        System.out.println("You have found some gold");
    }
//Method showing the GameCharacter has encountered an enemy
    private void encounterEnemy(){
        System.out.println("There is an enemy nearby. Prepare for battle.");
    }
    
    public String[] getGear() {
        return gear;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public void setGear(String[] gear) {
        this.gear = gear;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

   
    
}
