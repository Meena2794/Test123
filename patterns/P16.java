package patterns;

public class P16 {
	public static void main(String[] args) {
	    int rows = 4;
	    int cols = 4;

	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            if (i == rows - 1) {
	                System.out.print("* ");
	            } else {
	                System.out.print("- ");
	            }
	        }
	        System.out.println();
	    }
	}

}
