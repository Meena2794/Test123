package patterns;

public class P28 {
	public static void main(String[] args) {
	    int rows = 4;
	    // Print the numbers pattern
	    for (int i = 1; i <= rows; i++) {
	        for (int j = i; j <= rows; j++) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	    // Print the letters pattern
	    for (int i = 0; i < rows; i++) {
	        // Print leading spaces
	        for (int j = 0; j < rows - 1 - i; j++) {
	            System.out.print("  ");
	        }
	        // Print letters
	        for (int j = 0; j <= i; j++) {
	            System.out.print((char)('a' + j) + " ");
	        }
	        System.out.println();
	    }
	}

}
