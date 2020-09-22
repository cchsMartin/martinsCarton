import java.util.Scanner;

//Scanner is used to gather input from the keyboard or a file
public class InputTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name? ");
		String username = keyboard.nextLine(); //store the next thing typed as a string
		System.out.println("Hello, " + username + "!");

		System.out.println("How old are you? ");
		int userAge = keyboard.nextInt();  //store the next thing typed as an integer
		System.out.println("Wow, " + userAge + " is quite old.");
		
		System.out.println("What was your high school GPA? ");
		double userGPA = keyboard.nextDouble();
		System.out.println("With a GPA like, " + userGPA + " I bet you got a lot of scholarships.");
		
	}

}
