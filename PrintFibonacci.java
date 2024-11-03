public class PrintFibonacci {
    
    public static int printFibonacciSeries(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        int fnm1 = printFibonacciSeries(n-1);
        int fnm2 = printFibonacciSeries(n-2);
        int fn = fnm1 + fnm2;
        return fn;        
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println("Fibonacci series of "+n+ " is : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(printFibonacciSeries(i) + " ");
        }

    }
}
