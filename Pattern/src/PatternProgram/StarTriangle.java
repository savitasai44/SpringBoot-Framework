package PatternProgram;

public class StarTriangle {
	

	    public static void main(String[] args) {
	        int rows = 5; // Number of rows

	        for (int i = 1; i <= rows; i++) {
	            // Print stars
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            // New line after each row
	            System.out.println();
	        }
	    }
	}



