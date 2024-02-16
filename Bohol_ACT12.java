
package bohol_act1.pkg2;

import java.util.Scanner;


public class Bohol_ACT12 {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the message: ");
        String sentence = scanner.nextLine();
        
         String result = extractAlphabets(sentence); // passes the sentences entered to the function extractALphabets,which then returns a value. Result is equal to this value
      

        if (result == null || sentence.trim().isEmpty()) {  // if result is equal to null which means the user input includes symbol or not an alphabet, or if the user input are just all spaces then it prints invalid input
             System.out.println("Invalid input. Please enter a sentence containing only alphabets."); //Prints if the entered message is not an alphabet example are spaces and symbols
            
          
        } 
        
        else {            // if the user input sentence contains all alphabet
      
        String[] words = sentence.split("\\s+");    // splits each word from the input sentence after detecting a space
        
        int jejeCounter=0;  //initialized to determine if the capital word is placed incorrectly
        
        for (String word : words) {
            if (isValidWord(word)) { // checks if the word is valid Enlish written, ex. Jonna Bohol, etc.
                
            }
            
            else {               // checks if the word is invalid English written, ex. jOnna, JonNa, etc.
                jejeCounter++;       // if it is invalid English word then it increments jejecounter by 1.
            }
            
        }
         if(jejeCounter>0){
                                           // prints "JEJE!" if jejecounter is greater than one.
        System.out.println("JEJE!");    
        }
        
        else{
              System.out.println("uWu");     // prints uWu if jejecounter is not greater than 1
            
        }

        scanner.close();
    }
    }
    
    private static boolean isValidWord(String word) {
        return word.matches("[A-Z][a-z]*") || word.matches("[a-z]+");  // checks if the characters of all the  input are all alphabet
    }
    
    
    
     private static String extractAlphabets(String input) {  //the sentence or message  is passed here as input
        StringBuilder result = new StringBuilder();    // this is to modify the characters of the String message
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {           //  checks if each character is a letter or alphabet
                result.append(c);          // adds up each of the character checked
            } else if (!Character.isWhitespace(c)) {   // checks if character is a whitespace and if so, it returns the value as null
                
                return null;
            }
        }
        return result.toString();
    }
}

    
        
        
       
        
        
        
        
    
