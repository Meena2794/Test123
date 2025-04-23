package patterns;

public class P13 {
	public static void main(String[] args) {
	    int rows = 4;
	    int cols = 4;
	    
	    char letter = 'a';
	    int digit = 1;

	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            if (i % 2 == 0) {
	                System.out.print(letter + " ");
	                letter++;
	            } else {
	                System.out.print(digit + " ");
	                digit++;
	            }
	        }
	        System.out.println();
	    }
	}

}
