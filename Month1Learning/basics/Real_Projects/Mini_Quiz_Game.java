import java.util.Scanner;

public class Mini_Quiz_Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int point = 0;
		for ( int i = 1 ; i <= 1 ; i++ ) {
			System.out.print("How much is 2 * 2 ? ");
			String ans1 = scan.nextLine();
			if  (ans1.equals("4") || ans1.equals("4.0")){
				System.out.println("Right answer!");
				point ++;
			}
			else{
				System.out.println("Wrong answer!!");
				point = 0;
			}

			System.out.print("What is the capital of Nepal? ");
			String ans2 = scan.nextLine();
			if (ans2.equals("Kathmandu") || ans2.equals("kathmandu")){
				System.out.println("Correct");
				point ++;
			}
			else{
				System.out.println("Worng!!");
				if (point>=1) {
					point -= 1;
				}
			}

			System.out.print("Who is our current Prime Minister? ");
			String ans3 = scan.nextLine();
			if (ans3.equals("Susila Karki") || ans3.equals("susila karki")){
				System.out.println("Correct answer..");
				point ++;
			}
			else{
				System.out.println("Wrong answer.\nYour iq is lil low.");
				if (point >= 1){
					point -=1;
				}
			}

			System.out.print("Which party is going to win this upcoming election? ");
			String ans4 = scan.nextLine();
			if (ans4.equals("RSP") || ans4.equals("rsp")){
				System.out.println("Correct answer!");
				point++;
			}
			else {
				System.out.println("Incorrect!");
				if (point >=1){
					point -= 1;
				}
			}

			System.out.print("Java is cool, isn't it? Yes or No: ");
			String ans5 = scan.nextLine();
			if (ans5.equals("Yes") || ans5.equals("yes")){
				System.out.println("Correct!");
				point++;
			}
			else {
				System.out.println("Incorrect answer!!");
				if (point>=1){
					point -= 1;
				}
			}

			switch (point) {
				case 5:
					System.out.println("5 out of 5");
					System.out.println("You did great kid.");
					break;

				case 4:
					System.out.println("4 out of 5");
					break;

				case 3:
					System.out.println("3 out of 5");
					break;

				case 2:
					System.out.println("2 out of 5 nigg.");
					break;

				case 1:
					System.out.println("1 out of 5, poor guy!!");
					break;
				default:
					System.out.println("0 out of five\nBye kid. Better luck next time.");
					break;
			}
		}


		scan.close();
	}
}