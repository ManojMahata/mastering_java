// pass fail system 
/*To make this system we need user input or their marks and based on their marks system will tell them they have passed or not 

if marks are more the 24 then user passed the exam.

*/

import java.util.Scanner;

public class PassFailSystem {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);

     // Let's get marks as a input from users;
     System.out.print("Enter the makrs you got: ");
     double marks = scan.nextDouble();
	
        if (marks >= 24 ){
            System.out.print("Congrats: You passed the test paul.\n");
            }   else{
                        System.out.print("You filed paul.\n");
                    }

     scan.close();
  
  }
}
