/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author J-Tron
 */
public class Gui {
    private String weapon;
    private String shield;
    private String direction;
    private boolean attack;
    private boolean defend;
    private int damageDealt;
    private int damageTaken;
    
    public void attackEnemy(GameCharacter[] enemy, int damageDealt){
        moveGameCharacter();
        drawWeapon();
        attack = true;
        attack();
        getDamageDealt(damageDealt);
        
    }
    public void defendGameCharacter(GameCharacter[] player, int damageTaken){
        useShield();
        defend = true;
        defend();
        getDamageTaken(damageTaken);
    }
    
    
    
    private void drawWeapon(){
        //Player choses weapon to draw from gear for fight
    }
    private void useShield(){
        //Player uses shield as defense
    }
    private void moveGameCharacter(){
        //Player navigates GameCharacter to appropriate areas of the Game map
    }
    private void attack(){
        if (attack){
            System.out.println("You are attacking your target");
                    System.out.println("Damage Dealt" + damageDealt + "DamageTaken" + damageTaken);
        }
    }
    private void defend(){
        if(defend){
            System.out.println("You blocked that attack");
        }
        else{
            System.out.println("You have taken damage");
        }
    }

    public int getDamageDealt(int damageDealt) {
        return damageDealt;
    }

    public int getDamageTaken(int damageTaken) {
        return damageTaken;
    }

    public String getDirection() {
        return direction;
    }

    public String getShield() {
        return shield;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setDamageDealt(int damageDealt) {
        this.damageDealt = damageDealt;
    }

    public void setAttack(boolean attack) {
        this.attack = attack;
    }

    public void setDamageTaken(int damageTaken) {
        this.damageTaken = damageTaken;
    }

    public void setDefend(boolean defend) {
        this.defend = defend;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    
}
            

