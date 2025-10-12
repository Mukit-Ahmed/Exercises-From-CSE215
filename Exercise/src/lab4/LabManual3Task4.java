package lab4;

import java.util.Scanner;

public class LabManual3Task4 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		System.out.print("The factors are: ");
		
		for (int i = 2; i * i <= num; i++) {
			while (num % i == 0) {
				System.out.print(i + ",");
				num /= i;
			}
		}
		if (num != 1)
			System.out.print(num);
		scanner.close();
	}
}