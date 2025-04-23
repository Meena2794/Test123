package patterns;

public class P3 {
	public static void main(String[] args) {
		int numStars = 4;
		char ch = 'A';

		for (int i = 0; i < numStars; i++) {
			System.out.println(ch++);
		}
	}
}
