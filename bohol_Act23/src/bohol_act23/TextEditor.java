
package bohol_act23;



public class TextEditor {
       String text;
    
     public TextEditor (String initialText){
         this.text = initialText;
         
         
     }
     
     public String getText (){
        
        
         return text;
     }
     
     public void  setText(String newText){
         this.text = newText;
           
        
       
     }
    
     public void append (String newText){
          text += newText;
         
           
         
     }
     
     public String  delete(int n){
         if (n <= text.length()) {
                text = text.substring(0, text.length() - n);
              
        } 
           return null;
         
        
     }
    
    
    
}
