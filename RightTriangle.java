import java.util.Arrays;


public class RightTriangle {

    public static void main(String[] args) {
        int[] sides = new int[3];

        sides[0] = Integer.parseInt(args[0]);
        sides[1] = Integer.parseInt(args[1]);
        sides[2] = Integer.parseInt(args[2]);

        Arrays.sort(sides);


       if (testPositive(sides) == true)
           System.out.println(pythagoreanTriple(sides));

       else
           System.out.println(testPositive(sides));

    }

    public static boolean pythagoreanTriple(int[] sides){
        int squareSum = (sides[0]*sides[0]) + (sides[1] * sides[1]);
        int squareThird = sides[2] * sides[2];

        if(squareSum == squareThird){
            return true;
        }else
            return false;

    }


    public static boolean testPositive(int[] sides){

        int isNegative = 0;

        for(int i=0; i<3; i++){
            if(sides[i]<0)
                isNegative++;
        }

        if(isNegative>0)
            return false;
        else
            return true;
    }


}
