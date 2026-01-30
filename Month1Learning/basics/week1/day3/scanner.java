import java.util.*;
public class scanner {

public static void main(String[] args){
//learning scanner class
Scanner scan = new Scanner(System.in);

String name;
int age;

System.out.print("Enter your Name: ");
name = scan.nextLine();

System.out.print("Enter your age: ");
age = scan.nextInt();

System.out.println("Your name is : " + name + " and you are " + age + " years old");
 



	}

}
