package patterns;

public class P27 {
	public static void main(String[] args) {
	    int rows = 7;

	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j <= i; j++) {
	            if (i < 3) {
	                System.out.print((j + 1) + " ");
	            } else {
	                System.out.print((char)('a' + j) + " ");
	            }
	        }
	        System.out.println();
	    }
	}

}
