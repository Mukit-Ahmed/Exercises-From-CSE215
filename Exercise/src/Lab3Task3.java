
public class Lab3Task3 {
	public static void main(String[] args) {
		for (int i = 10; i < 20; i++) {
			for (int j = i * 10; j < (i + 1) * 10; j++) {
				if (j % 5 == 0 || j % 6 == 0) {
					if (j % 30 != 0) {
						System.out.print(j + " ");
					}
				}
			}
			System.out.println();
		}
		System.out.println("200");
	}
}
