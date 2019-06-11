public class GreatCircle {
    public static void main(String[] args) {

        // test

        double x1Deg = Double.parseDouble(args[0]);
        double y1Deg = Double.parseDouble(args[1]);
        double x2Deg = Double.parseDouble(args[2]);
        double y2Deg = Double.parseDouble(args[3]);

        // Convert to radians
        double x1Rad = Math.toRadians(x1Deg);
        double y1Rad = Math.toRadians(y1Deg);
        double x2Rad = Math.toRadians(x2Deg);
        double y2Rad = Math.toRadians(y2Deg);

        double radius = 6371.0;

        double xDif = (x2Rad - x1Rad)/2;
        double yDif = (y2Rad - y1Rad)/2;
        double firstComp = Math.sin(xDif)*Math.sin(xDif);
        double secondComp = Math.cos(x1Rad)*Math.cos(x2Rad)*Math.sin(yDif)*Math.sin(yDif);

        double distance = 2*radius*Math.asin(Math.sqrt(firstComp + secondComp));

        System.out.println(distance + " kilometers");
    }
}
