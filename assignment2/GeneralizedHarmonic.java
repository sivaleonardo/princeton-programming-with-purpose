public class GeneralizedHarmonic {

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);


        double harmonic = 1/(Math.pow(1,r));

        for(int i=2; i<=n;i++){
            harmonic += 1/(Math.pow(i,r));
        }

        System.out.println(harmonic);
    }
}
