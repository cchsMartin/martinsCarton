import java.util.Scanner;

public class VoidTutorial {
	static void area(double length, double width) {
		double area = length * width;
		System.out.println(area);
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the length of the rectangle? ");
		double l = keyboard.nextDouble();
		
		System.out.println("What is the width of the rectangle? ");
		double w = keyboard.nextDouble();
		
		area(l, w);
	}
}
