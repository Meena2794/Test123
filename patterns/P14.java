package patterns;

public class P14 {
	public static void main(String[] args) {
	    int rows = 4;
	    int cols = 2;

	    char ch = 'a';

	    for (int i = 1; i <= rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            System.out.printf("%d %c ", i, ch);
	            ch++;
	        }
	        System.out.println();
	    }
	}

}
