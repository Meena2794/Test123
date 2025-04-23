package patterns;

public class P11 {
	public static void main(String[] args) {
	    // Dimensions of the grid
	    int rows = 4;
	    int cols = 4;

	    // Loop through the rows
	    for (int i = 0; i < rows; i++) {
	        // Loop to print each column
	        for (int j = 0; j < cols; j++) {
	            // Print 'a' for the first and third rows
	            if (i % 2 == 0) {
	                System.out.print("a ");
	            } 
	            // Print '1' for the second and fourth rows
	            else {
	                System.out.print("1 ");
	            }
	        }
	        // Move to the next line after printing a row
	        System.out.println();
	    }
	}

}
