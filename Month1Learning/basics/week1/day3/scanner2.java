import java.util.*;

public class scanner2{

public static void main(String[] args){
Scanner scan = new Scanner(System.in);//scanner class to take input from user;

System.out.print("Please enter an integer: ");
int i = scan.nextInt();
System.out.print("Please enter byte a integer: ");
byte b = scan.nextByte();
System.out.print("Please enter short integer: ");
short s = scan.nextShort();
System.out.print("Please enter long integer: ");
long l = scan.nextLong();

System.out.println("Integer is : " +i );
System.out.println("Byte integer is: " +b);
System.out.println("Short integer is: " +s );
System.out.println("Long integer is: " +l );


scan.close();

	}
}
