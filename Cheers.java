
// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0];
                int n = Integer.parseInt(args[1]);

                name = name.toUpperCase();

                for (int i = 0; i < name.length(); i++) {
                        char currentCh = name.charAt(i);



                        String anletter = "AEFHILMNORSX";
                        if (anletter.indexOf(currentCh) != -1) {
                                System.out.println("Give me an " + currentCh + "!");
                                System.out.println(currentCh + "!");
                        } else {
                                System.out.println("Give me a " + currentCh + "!");
                                System.out.println(currentCh + "!");
                        }
                }

                System.out.println("What does that spell?");

                for (int j = 0; j < n; j++) {
                        System.out.println(name + "!!!");

        

                }

        


	    // Replace this comment with your code
        }
}
