import java.util.Scanner;

public class Triangle {
	public double perimeter(double a, double b, double c) {
		return a + b + c;
	}
	
	public double area(double a, double b) {
		return 0.5 * a * b;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is side 1 of your triangle?");
		double side1 = keyboard.nextDouble();
	}
}
