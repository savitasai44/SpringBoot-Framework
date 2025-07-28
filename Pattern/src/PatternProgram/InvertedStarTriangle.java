package PatternProgram;

public class InvertedStarTriangle {
	
	
	    public static void main(String[] args) {
	        int rows = 5; // Number of rows

	        for (int i = rows; i >= 1; i--) {
	            // Print stars
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            // New line after each row
	            System.out.println();
	        }
	    }
	}



