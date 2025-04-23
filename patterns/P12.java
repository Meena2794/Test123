package patterns;

public class P12 {
	public static void main(String[] args) {
	    int rows = 4;
	    int cols = 4;

	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            if (i % 2 == 0) {
	                System.out.print((char)('a' + j) + " ");
	            } else {
	                System.out.print((j + 1) + " ");
	            }
	        }
	        System.out.println();
	    }
	}

}
