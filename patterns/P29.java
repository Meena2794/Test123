package patterns;

public class P29 {
	public static void main(String[] args) {
	    int rows = 4;

	    // Print the first part of the pattern
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < rows; j++) {
	            if (j >= rows - 1 - i) {
	                System.out.print((char)('a' + i) + " ");
	            } else {
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }

	    // Print the second part of the pattern
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < rows; j++) {
	            if (i == 0 || i == rows - 1 || j == 0 || j == rows - 1) {
	                System.out.print((char)('a' + i * rows + j) + " ");
	            } else {
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
	}

}
