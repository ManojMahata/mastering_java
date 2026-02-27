import java.util.*;

public class Correct_Mini_Quiz_Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int point = 0;
		int totalQuestion = 5;
		int bestScore = 0;

		// for loop to give user 2 attempts
		for ( int attempt = 1; attempt <= 2; attempt ++) {
			point = 0; // reset points each attempt
			System.out.println("\n=============================");
            System.out.println("   Attempt " + attempt + " of 2");
            System.out.println("=============================");

            // Q1
            System.out.print("\nQ1. How much is 2 * 2? ");
            String ans1 = scan.nextLine();
            if (ans1.equals("4") || ans1.equals("4.0")){
            	System.out.println("Correct!");
            	point++;
            } else {
            	System.out.println("Wrong! Answer was 4.");
            }

            //Q2
            System.out.print("\nQ2. What is the capital or Nepal? ");
            String ans2 = scan.nextLine();
            if ( ans2.equalsIgnoreCase("Kathmandu")){
            	System.out.println("Correct!");
            	point++;
            } else {
            	System.out.println("Wrong! Answer is Kathmandu.");
            }

            //Q3
            System.out.print("\nWhich planet is closest to the Sun? ");
            String ans3 = scan.nextLine();
            if (ans3.equalsIgnoreCase("Mercury")){
            	System.out.println("Correct!");
            	point++;
            }else {
            	System.out.println("Wrong! Answer is Mercury.");
            }

            //Q4
            System.out.print("\nWhat does JVM stands for? ");
            String ans4 = scan.nextLine();
            if (ans4.equalsIgnoreCase("Java Virtual Machine")) {
            	System.out.println("Correct!");
            	point++;
            } else{
            	System.out.println("Wrong! Answer is Java Virtual Machine");
            }

            //Q5
            System.out.print("\nQ.5 Is Java platform independent? ");
            String ans5 = scan.nextLine();
            if (ans5.equalsIgnoreCase("yes")){
            	System.out.println("Correct!");
            	point++;
            } else {
            	System.out.println("Wrong! Answer is Yes.");
            }

            // type casting
            double percantage = ((double) point / totalQuestion) * 100;
            System.out.println("\nYou socre: " + point + "/" + totalQuestion);
            System.out.printf("Percantage: %.1f%%%n", percantage);

            // trace best score accross attempts
            if ( point > bestScore) bestScore = point;

             // SWITCH — grade based on score
            System.out.print("Grade: ");
            switch (point) {
                case 5:
                    System.out.println("A+ — Perfect score! Outstanding!");
                    break;
                case 4:
                    System.out.println("A — Great job!");
                    break;
                case 3:
                    System.out.println("B — Good effort!");
                    break;
                case 2:
                    System.out.println("C — Needs improvement.");
                    break;
                case 1:
                    System.out.println("D — Keep practicing!");
                    break;
                default:
                    System.out.println("F — Better luck next time!");
                    break;
            }

            // if perfect score, no need for second attempt
            if (point == totalQuestion){
            	System.out.println("\nPerfect score on attempts " + attempt + "! No need to for another attempt.");
            	break;
            }
            if ( attempt ==1 && point < totalQuestion){
            	System.out.println("\nYou hava 1 more attempt. Try to  beat your score!");
            }
		}
		System.out.println("\n=============================");
        System.out.println("Your best score: " + bestScore + "/" + totalQuestion);
        System.out.println("Thanks for playing!");
        System.out.println("=============================");

		scan.close();
	}
}