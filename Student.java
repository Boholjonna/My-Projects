
import java.util.Scanner;


public class Student {
    
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMinor;
    
            
            public Student (String firstName, String lastName, int age ){
                
               
              
                 
                this.firstName = firstName;
                this.lastName = lastName;
                this.age = age ;
                
                this.isMinor = age<18;
                            
}

                                            
            
    public String getName() {

return firstName + ", " +lastName ;


}

    
    public void increaseAge() {

        age++;
        }
       
           

    public String toString(){
        
       if (isMinor){
        
        return lastName +", " + firstName + " - " +age + " - " + "minor"  ;
    }
       
       else {
           return lastName +", " + firstName + " - " +age + " - " + "adult"  ;
       }
    }
   
    
    public static void main(String[] args) {
        
        Scanner input =  new Scanner (System.in);
        
        System.out.print("Enter test case number: ");
        int testNumber = input.nextInt();
        
            
        
        switch (testNumber){
            case 1 -> {
                System.out.println("Test Case 1: Student under 18");
                Student student = new Student ("Jemar Jude ", "Maranga", 17);
                String student1 = student.toString();
                System.out.println(student1);
            }
                
                
                
            case 2 ->
                  { System.out.println("Test Case 2: Increase age of student1");
                      Student student = new Student ("Jemar Jude ", "Maranga", 18);
                    String student1 = student.toString();
                         System.out.println(student1);
        
                    }     
                
                
            case 3 -> 
            { System.out.println("Test Case 3: Student over 18");
            
                      Student student = new Student ("Jose ", "Cruz", 19);
                    String student2 = student.toString();
                         System.out.println(student2);
        
                    }     
                              
            
        }
             
      
    }
    
    }
    

