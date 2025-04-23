package patterns;

public class P8 {
	public static void main(String[] args) {
		// Dimensions of the grid
		int rows = 4;
		int cols = 4;

		// Loop to print each row
		for (int i = 1; i <= rows; i++) {
			// Loop to print each column
			for (int j = 1; j <= cols; j++) {
				System.out.print(i + " ");
			}
			// Move to the next line after printing a row
			System.out.println();
		}
	}
}

