public class BandMatrix {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i = 0;i < n; i++) {
            for (int j = 0; j < n; j++) {


                if (i == j)
                    if (j == n-1)
                        System.out.println("*");
                    else
                        System.out.print("*  ");
                else if ((j <= i + width) && (j >= i-width))
                    if (j == n-1)
                        System.out.println("*");
                    else System.out.print("*  ");
                else if (j == n-1)
                    System.out.println("0");
                else
                    System.out.print("0  ");


            }
        }

    }
}
