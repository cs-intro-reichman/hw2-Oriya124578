public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String time = args[0];
        String minutesToAddstr = args[1];

        int minutesToAdd = Integer.parseInt(minutesToAddstr);

        String[] parts = time.split(":");

        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        int totalMinutes = hours * 60 + minutes + minutesToAdd;

        int newhours = (totalMinutes / 60) % 24;
        int newminutes = totalMinutes % 60;

        String andhours;
        String andminutes;

        if (newhours < 10) {
            andhours = "0" + newhours;
        } else {
            andhours = "" + newhours;
        }
        if (newminutes < 10) {
            andminutes = "0" + newminutes;
        } else {
            andminutes = "" + newminutes;
        }

        System.out.println(andhours + ":" + andminutes);

        


    }
}
