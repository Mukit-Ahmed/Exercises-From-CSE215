
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt=0;
		try {
		myInt = Integer.parseInt("200000000000");
		} catch (Exception ex) {
			System.out.println("sad");
		} finally {
			System.out.print("finally\n\n\nHELLo Sexxxxxy\n");
		}
		System.out.println("gasrdqawe\n"+myInt);

	}

}
