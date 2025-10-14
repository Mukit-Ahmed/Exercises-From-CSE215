package Lab04;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 3 numbers: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		displaySortedNumbers(a, b, c);
	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double temp;
		if (num1 > num2) {
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		if (num2 > num3) {
			temp = num3;
			num3 = num2;
			num2 = temp;
		}
		if (num1 > num2) {
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		System.out.println(num1 + " " + num2 + " " + num3);

	}
}
