package patterns;

public class P10 {
	public static void main(String[] args) {
	    // Dimensions of the grid
	    int rows = 4;
	    int cols = 4;
	    
	    // Variables for digits and characters
	    int digit = 1;
	    char ch = 'a';
	    
	    // Loop through the rows
	    for (int i = 0; i < rows; i++) {
	        // Loop to print each column
	        for (int j = 0; j < cols; j++) {
	            // Print digit in even columns, character in odd columns
	            if (j % 2 == 0) {
	                System.out.print(digit + " ");
	                digit++;
	            } else {
	                System.out.print(ch + " ");
	                ch++;
	            }
	        }
	        // Move to the next line after printing a row
	        System.out.println();
	    }
	}

}
