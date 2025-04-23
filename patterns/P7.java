package patterns;

public class P7 {
	public static void main(String[] args) {
		// Dimensions of the grid
		int rows = 4;
		int cols = 4;

		// Loop to print each row
		for (int i = 0; i < rows; i++) {
			// Loop to print each column
			for (int j = 0; j < cols; j++) {
				System.out.print((j + 1) + " ");
			}
			// Move to the next line after printing a row
			System.out.println();
		}
	}
}


