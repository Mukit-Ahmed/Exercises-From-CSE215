package lab5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double[][] arr = new double[3][4];
		for (int i = 0; i < arr.length; i++) {


			for (int j = 0; j < arr[0].length; j++) {
				double num = scanner.nextDouble();
				arr[i][j] = num;
			}
		}

		for (int i = 0; i < arr[0].length; i++) {
			System.out.println("Sum of the elements at column " + i + " is " + sumColumn(arr, i) + " ");
		}
		scanner.close();

	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
	}
}
