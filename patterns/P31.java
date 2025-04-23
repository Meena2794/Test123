package patterns;

public class P31 {
	public static void main(String[] args) {
	    for (int i = 0; i < 8; i++) {
	        if (i % 4 == 0) {
	            System.out.print("a ");
	        } else if (i % 4 == 1) {
	            System.out.print("1 2 ");
	        } else if (i % 4 == 2) {
	            System.out.print("b c d ");
	        } else if (i % 4 == 3) {
	            System.out.print("4 5 6 7 ");
	        }
	        System.out.println();
	    }
	}
}
