public class PrintXtoPowerN {
    //brute force method O(n)
    public static int printXtoN(int x, int n)
    {
        if(n == 1)
        {
            return x * 1;
        }
        return x * printXtoN(x, n - 1);  
    }

    // optimized solution O(n log n)
    public static int optimizedPower(int a, int n)
    {
        if(n == 0)
        {
            return 1;
        }

        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;
        // if n is odd
        if(n % 2 != 0)
        {
            halfPowerSq = a * halfPowerSq;
        } 
        return halfPowerSq;
    }


    public static void main(String[] args) {
        int x = 9;
        int n = 3;
        System.out.println(printXtoN(x, n));
        System.out.println(optimizedPower(x, n));
    }
}
