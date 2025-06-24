public class main{
	public static void main(String[] args) {
		for (int a = 0; a <= 100; ++a) {
			if ((a % 3 == 0) || (a % 5 ==0)) {
				System.out.printf(a+ " ");
			}
		}
	}
}