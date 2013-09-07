/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author J-Tron
 */
public class Game {
    private int characterLevel;
    private String characterTask;
    private boolean battle;
    private String[] objectives;
    private String[] battleOutcome;
    private String[] treasures;
    private String[] weapons;

    public Game(int characterLevel, String characterTask, String[] objectives, String[] battleOutcome, String[] treasures, String[] weapons) {
        this.characterLevel = characterLevel;
        this.characterTask = characterTask;
        this.objectives = objectives;
        this.battleOutcome = battleOutcome;
        this.treasures = treasures;
        this.weapons = weapons;
    }
    
    public Game(){
        
    }
    public void playGame(){
        loadTasks();
        loadObjectives();     
    }
    public void searchForTreasure(){
        findTreasure();
        storeTreasure();
    }
    public void engageInBattle(boolean battle){
        battle = true;
        fight(battle);
        displayBattleOutcome();
        
    }
    
    private void loadTasks(){
        //This will give the GameCharacter a number of tasks that may be performed
        System.out.println("Discover new areas");
    }

    private void loadObjectives(){
        //This will give the GameCharcter a number of objectives to complete
        System.out.println("Gather 10 pieces of gold");
    }
    private void fight(boolean battle){
        //This will ask the GameCharacter if they would like to pursue a fight
        if(battle = true){
            System.out.println("Let's fight to the death");
        }
        else if (battle = false){
            System.out.println("You ran away in fear");
            
        }
      }
    
    private void displayBattleOutcome(){
        //This will display the outcome of a battle based upon certain criteria like GameCharatcer HP and Mana
        //and the enemies HP and Mana etc.
    }
    private void findTreasure(){
        //This will allow the GameCharcter to find treasure in the mapArea
    }
    private void storeTreasure(){
        //This will allow the GameCharacter to store the found treasure in their gear array
    }
    public String[] getBattleOutcome() {
        return battleOutcome;
    }

    public int getCharacterLevel() {
        return characterLevel;
    }

    public String getCharacterTask() {
        return characterTask;
    }

    public String[] getObjectives() {
        return objectives;
    }

    public String[] getTreasures() {
        return treasures;
    }

    public String[] getWeapons() {
        return weapons;
    }

    public void setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
    }

    public void setBattleOutcome(String[] battleOutcome) {
        this.battleOutcome = battleOutcome;
    }

    public void setCharacterTask(String characterTask) {
        this.characterTask = characterTask;
    }

    public void setObjectives(String[] objectives) {
        this.objectives = objectives;
    }

    public void setTreasures(String[] treasures) {
        this.treasures = treasures;
    }

    public void setWeapons(String[] weapons) {
        this.weapons = weapons;
    }
    
}


