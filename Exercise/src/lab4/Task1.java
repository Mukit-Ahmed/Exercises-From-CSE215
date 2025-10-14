package Lab04;

public class Task1 {

	public static void main(String[] args) {
		int i = 1, ctr = 0;
		while (i < 100) {
			int pentNum = getPentagonalNumber(i);
			System.out.print(pentNum + " ");
			i++;
			ctr++;
			if (ctr % 10 == 0)
				System.out.println();
		}
	}

	public static int getPentagonalNumber(int n) {
		int pentNum = n * (3 * n - 1) / 2;
		return pentNum;
	}

}
