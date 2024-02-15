
package bohol_act1.pkg2;

import java.util.Scanner;


public class Bohol_ACT12 {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the message: ");
        String sentence = scanner.nextLine();
        
         String result = extractAlphabets(sentence);
      

        if (result == null || sentence.trim().isEmpty()) {
             System.out.println("Invalid input. Please enter a sentence containing only alphabets.");
            
        } 
        
        else {
      
        String[] words = sentence.split("\\s+");
        
        int jejeCounter=0;
        
        for (String word : words) {
            if (isValidWord(word)) {
                
            }
            
            else {
                jejeCounter++;
            }
            
        }
         if(jejeCounter>0){
        
        System.out.println("JEJE!");
        }
        
        else{
              System.out.println("uWu");
            
        }

        scanner.close();
    }
    }
    
    private static boolean isValidWord(String word) {
        return word.matches("[A-Z][a-z]*") || word.matches("[a-z]+");
    }
    
     private static String extractAlphabets(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(c);
            } else if (!Character.isWhitespace(c)) {
                
                return null;
            }
        }
        return result.toString();
    }
}

    
        
        
       
        
        
        
        
    
