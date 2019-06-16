public class RandomWalker {
    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]);
        int walkedDistance = 0;
        int steps = 0;

        int x = 0;
        int y = 0;

        System.out.println("("+x+", "+y+")");

        while (walkedDistance < r) {

            if (Math.random() <= 0.25)
                x = x + 1;
            else if (Math.random() > 0.25 && Math.random() <= 0.50)
                y = y + 1;
            else if (Math.random() > 0.50 && Math.random() <= 0.75)
                x = x - 1;
            else
                y = y - 1;

            walkedDistance = Math.abs(x) + Math.abs(y);

            System.out.println("("+x+", "+y+")");
            steps++;

        }

        System.out.println("steps = "+steps);


    }
}
