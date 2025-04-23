package patterns;

public class P26 {
	public static void main(String[] args) {
	    int rows = 6;
	    int num = 1;
	    char ch = 'a';

	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j <= i; j++) {
	            if (i < 3) {
	                System.out.print(num + " ");
	                num++;
	            } else {
	                System.out.print(ch + " ");
	                ch++;
	            }
	        }
	        System.out.println();
	    }
	}

}
