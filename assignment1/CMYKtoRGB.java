public class CMYKtoRGB {

    public static void main(String[] args){
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        double white = 1 - black;
        int red = (int) Math.round(255 * white * (1 - cyan));
        int green = (int) Math.round(255 * white * (1 - magenta));
        int blue = (int) Math.round(255 * white * (1 - yellow));



        System.out.print("red    = ");
        System.out.println(red);
        System.out.print("green  = ");
        System.out.println(green);
        System.out.print("blue   = ");
        System.out.println(blue);
    }
}
