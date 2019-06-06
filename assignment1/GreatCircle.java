public class GreatCircle {

    public static void main(String[] args){

        double x1_deg = Double.parseDouble(args[0]);
        double y1_deg = Double.parseDouble(args[1]);

        double x2_deg = Double.parseDouble(args[2]);
        double y2_deg = Double.parseDouble(args[3]);

        //Convert to radians
        double x1_rad = Math.toRadians(x1_deg);
        double y1_rad = Math.toRadians(y1_deg);
        double x2_rad = Math.toRadians(x2_deg);
        double y2_rad = Math.toRadians(y2_deg);

        System.out.print(haversine(x1_rad,y1_rad,x2_rad,y2_rad));
        System.out.println(" kilometers");

    }

    public static double haversine(double x1, double y1, double x2, double y2){
        double radius = 6371.0;

        double x_dif = (x2 - x1)/2;

        double y_dif = (y2 - y1)/2;

        double squareroot_comp1 = Math.sin(x_dif) * Math.sin(x_dif);
        double squareroot_comp2 = Math.cos(x1) * Math.cos(x2) * Math.sin(y_dif) * Math.sin(y_dif);

        double distance = 2 * radius * Math.asin(Math.sqrt(squareroot_comp1 + squareroot_comp2));

        return distance;


    }
}
