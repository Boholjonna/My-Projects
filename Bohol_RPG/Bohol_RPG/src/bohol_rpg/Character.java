
package bohol_rpg;


public class Character {
   private int health;
    private int damage;
   private int shield; 
    
    public Character (int health, int damage, int shield){
        this.health= health;
        this.damage = damage;
        this.shield = shield;
    }
    
    public int getHealth (){
        return health;
    }
    


public int getDamage (){
        return damage;
    }
    



public int getShield (){
        return shield;
    }



public int  setHealth (int health){
      return health;
}
    
public void receiveDamage(int damage){
    if (health>0){
        damage-=shield;
        health-=damage;
        
    }
    
    else {
        System.out.println("Character has died.");
    }
    
    
   

}

}



    
    
    


