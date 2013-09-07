/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author J-Tron
 */
public class GameWorld {
    private String mapArea;
    private String weather;
    private GameCharacter[] players;
    private GameCharacter[] enemies;
    
    public GameWorld(){
        
    }
//This constructor creates a particular map area 
    public GameWorld(String mapArea, String weather, GameCharacter[] players, GameCharacter[] enemies) {
        this.mapArea = mapArea;
        this.weather = weather;
        this.players = players;
        this.enemies = enemies;
    }
    
 //This method renders and displays the map area and surrounding enemies and treasures
    public void createGameWorld(String mapArea, String weather){
        renderMapArea(mapArea);
        displayWeather(weather);
        moveEnemies();
        spawnTreasure();
        
    }
    private void renderMapArea(String mapArea){
        //This will create and draw the current map area of the player
    }
    private void displayWeather(String weather){
        //This will display the current weather conditions in the game map
    }
    private void moveEnemies(){
        //This will move the enemeies within the visible rendered area around the player
    }
    private void spawnTreasure(){
        //This will make the treasure availale to the GameCharcter when he stumbles upon the area of treasure
    }
    
//Sets the map area in the game
    public void setMapArea(String mapArea) {
        this.mapArea = mapArea;
    }
//Sets the weather in the game
    public void setWeather(String weather) {
        this.weather = weather;
    }
//Sets enemies withing the game
    public void setEnemies(GameCharacter[] enemies) {
        this.enemies = enemies;
    }
//Sets players within the game
    public void setPlayers(GameCharacter[] players) {
        this.players = players;
    }
    
    
    
    
}
