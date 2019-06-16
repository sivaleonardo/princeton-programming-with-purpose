public class RandomWalkers {

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int steps = 0;



        for (int i=0; i<trials; i++) {

            int walkedDistance = 0;
            int x = 0;
            int y = 0;

            while (walkedDistance < r) { // Put different conditions for moving north, east, west or south by 1 unit
                if (Math.random() <= 0.25)
                    x = x + 1;
                else if (Math.random() > 0.25 && Math.random() <= 0.50)
                    y = y + 1;
                else if (Math.random() > 0.50 && Math.random() <= 0.75)
                    x = x - 1;
                else
                    y = y - 1;

                walkedDistance = Math.abs(x) + Math.abs(y);
                steps++;

            }
        }

        double averageSteps = (double) steps/trials;
        System.out.println("average number of steps = "+averageSteps);
    }
}
