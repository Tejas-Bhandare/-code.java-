public class PrintSumNaturalNums {
    
    public static int calcSum(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return n + calcSum(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first "+n+" natural numbers is "+calcSum(n));
        ;
    }
}
