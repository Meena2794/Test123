package patterns;

public class P30 {
	public static void main(String[] args) {
	    int rows = 5;
	    int cols = 5;
	    int num = 1;

	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            if ((i == 1 && j == 2) || (i == 2 && j == 1) || (i == 2 && j == 3) || (i == 3 && j == 2)) {
	                System.out.print(" ");
	            } else {
	                System.out.print(num + " ");
	                num++;
	            }
	        }
	        System.out.println();
	    }
	}

}
