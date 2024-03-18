package bohol_rpg;

public class Paladin extends Swordsman {
   
   private boolean hasResurrected;
    
    public Paladin (){
        this.hasResurrected = false;
    }
    
    
    @Override       
public void receiveDamage(int damage){
  
   
   if (getHealth()>0){
    
    if (damage%2 == 0){
        
       
           damage/=2;
          damage-= getShield();
              int health = getHealth () - damage;
           setHealth(health);
    }
    
    else {
        resurrect();
        
    }
    
    
    
   

}
  

}

public void resurrect(){
        
          if (!hasResurrected){
              hasResurrected = true;
             setHealth(100); 
          }
          
          else {
              System.out.println("Paladin has died");
          }
}


}







        
   
    
    