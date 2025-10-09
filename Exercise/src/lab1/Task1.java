package lab1;

public class Task1 {
	public static void main(String[] args) {

		double tuition = 10000;

		for (int i = 0; i < 10; i++) {
			tuition *= 1.05;
		}

		System.out.printf("Tuition after 10 years: $%.2f\n", tuition);

		double totalCost = 0;
		for (int i = 0; i < 4; i++) {
			totalCost += tuition;
			tuition *= 1.05;
		}
		System.out.printf("Total cost for 4 years after 10th year: $%.2f\n", totalCost);
	}
}
