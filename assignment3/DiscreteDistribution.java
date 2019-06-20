public class DiscreteDistribution {

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        int [] a = new int[args.length -1];

        for(int i=1; i < args.length; i++){
            a[i-1] = Integer.parseInt(args[i]);
        }

        int[] sums = new int[a.length + 1];
        sums[0] = 0;
        for(int j = 1; j<sums.length; j++){
            sums[j] = 0;
            for(int k = 0; k < j; k++) {
                sums[j] += a[k];
            }
        }

        
        int[] indices = new int[m];

        for (int h = 0; h < m; h++) {
            int r = (int) (Math.random() * (sums[sums.length - 1]-1));
            for (int l = 0; l < sums.length; l++) {
                if ((r >= sums[l]) && (r < sums[l + 1])) {
                    indices[h] = l + 1;
                }
            }
        }

        for (int n = 0; n < indices.length; n++) {
            System.out.print(indices[n]+" ");
        }

        System.out.println("");


    }
}
