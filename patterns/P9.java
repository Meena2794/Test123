package patterns;

public class P9 {
	public static void main(String[] args) {
	    // Dimensions of the grid
	    int rows = 4;
	    int cols = 4;
	    
	    // Variables for digits and characters
	    int digit = 1;
	    char ch = 'a';
	    
	    // Loop through the rows
	    for (int i = 0; i < rows; i++) {
	        // Print numbers for the first and third row
	        if (i % 2 == 0) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(digit + " ");
	                digit++;
	            }
	        } 
	        // Print letters for the second and fourth row
	        else {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(ch + " ");
	                ch++;
	            }
	        }
	        // Move to the next line after printing a row
	        System.out.println();
	    }
	}

}
