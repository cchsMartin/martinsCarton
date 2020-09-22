import java.util.Scanner;

public class Rectangle {
	public static double perimeter(double a, double b) {
		return 2 * (a + b);
	}
	
	public static double area(double a, double b) {
		return a * b;
	}
	
	public static void rectInfo(double a, double b) {
		System.out.println("The perimeter of your rectangle is: " + perimeter(a, b) + ". ");
		System.out.println("The area of your rectangle is: " + area(a, b) + ". ");
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the length of your rectangle?");
		double length = keyboard.nextDouble();
		
		System.out.println("What is the width of your rectangle?");
		double width = keyboard.nextDouble();
		
		rectInfo(length, width);
		keyboard.close();
		
		
	}
}
