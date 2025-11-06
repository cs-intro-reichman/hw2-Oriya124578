// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code

		int N = Integer.parseInt(args[0]);
		double sum = 0.0;
		double Sign = 1.0;
		double denominator = 1;
		for (int i = 0; i < N; i++) {
			sum = sum + Sign / denominator;
			Sign = -Sign;
			denominator = denominator + 2;
		}

		double pi = 4 * sum;

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pi);



		

		




	}
}
