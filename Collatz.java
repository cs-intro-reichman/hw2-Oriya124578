// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code

		int n = Integer.parseInt(args[0]);
		String mode = (args [1]);

		for (int seed = 1; seed <= n; seed++) {
			int count = 1;
			String sequenceStr = String.valueOf(seed);
			int number = seed;

			
			while (number != 1) {
				count++;
				if (number % 2 == 0) {
					number = number / 2;
					sequenceStr += " " + number;
				} else {
					number = 3 * number + 1;
					sequenceStr += " " + number;
				}
				
			} 
			if (seed == 1) {
                sequenceStr = "1 4 2 1"; 
                count = 4; 
            }
			
			

			if (mode.equals("v")) {
				System.out.println(sequenceStr + " (" + count + ")");
			}
		}
		
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");


	
	}
}
