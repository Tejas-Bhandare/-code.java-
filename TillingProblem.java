/**
 * TillingProblem
 */
public class  TillingProblem {

    public static int claculateWays(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        //vertical choice
        int fnm1 = claculateWays(n - 1);

        //horizontal choice
        int fnm2 = claculateWays(n - 2);

        int toWays = fnm1 + fnm2;

        return toWays;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(claculateWays(n));
    }
    
}