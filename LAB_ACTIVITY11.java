
package userInput;

import java.util.Scanner;



public class LAB_ACTIVITY11 {
    static Scanner input = new Scanner(System.in);
    static Scanner input1 = new Scanner(System.in);

    public static void main(String[] args) {
        
            
        System.out.print("Enter name: ");
        String name = input.nextLine();
        
        System.out.println("Enter your age: ");
        int age = input1.nextInt();
        
        System.out.print("Enter your gender: ");
        String gender = input.nextLine();
        
        System.out.print("Enter your address: ");
        String address = input.nextLine();
        
        
        System.out.print("Enter your Civil Status: ");
        String civilstatus = input.nextLine();
        
        System.out.print("Enter your # of sisters/brothers: ");
        int sisbro = input1.nextInt();
            
        
          System.out.println("NAME: "+name);
       
           System.out.println("AGE: "+age);
          
           System.out.println("GENDER: "+gender);      
              
             System.out.println("ADDRESS: "+address);
             
              System.out.println("CIVIL STATUS: "+civilstatus);
              
               System.out.println("# SISTERS/BROTHERS: "+sisbro);
        
        
        
        
        
        
        
        
    }
}
