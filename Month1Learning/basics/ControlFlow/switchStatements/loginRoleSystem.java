import java.util.Scanner;

public class loginRoleSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* 
        Build login role system (admin, teacher, student)
        */
        int passwordForadmin = 1221;
        int passwordForstudent = 1001;
        int passwordForteacher = 2332;
        int password;

        System.out.print("Enter your role to get access : ");
        String role = scan.nextLine();

        switch (role) {
        case "admin": 
            System.out.println("You are trying to login as admin.");
            System.out.print("Enter your password : ");
            password = scan.nextInt();
            if (password == passwordForadmin) {
                System.out.println("Welcome admin (*_*)");
            }else {
                System.out.println("Sorry! password dosen't match.");
            }
            break;

        case "student": System.out.print("Enter your pass to get access as a student : ");
            password = scan.nextInt();
            if (password == passwordForstudent) {
                System.out.println("Welcome Kid.");
            }else {
                System.out.println("Invalid password.");
            }
            break;

        case "teacher": System.out.print("Enter your password to get access as techer to resources : ");
            password = scan.nextInt();
            if(password == passwordForteacher) {
                System.out.println("Welcome Teacher.");
            } else {
                System.out.println("You are not teacher right?");
            }
            break;



        }


        scan.close();
    }
}