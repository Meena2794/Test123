package patterns;

public class P32 {
	public static void main(String[] args) {
	    int rows = 4;

	    // Print the first part of the pattern
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < rows; j++) {
	            if (j >= i) {
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
	            if (j >= i) {
	                if (i == 0) {
	                    System.out.print((j + 1) + " ");
	                } else if (i == 1) {
	                    System.out.print((char)('a' + j - 1) + " ");
	                } else if (i == 2) {
	                    System.out.print((j - 1) + " ");
	                } else {
	                    System.out.print("a ");
	                }
	            } else {
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
	}

}
