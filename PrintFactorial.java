public class PrintFactorial {

    public static int printFactorial(int n)
    {
        int factorial;
        if(n == 0)
        {
            factorial = 1;
            return factorial;
        }
        else
        {
            factorial = n * printFactorial(n - 1);
            return factorial;
        }

        /* Shoter Version
        if(n == 0)
        {
            return 1;
        }
        return n * printFactorial(n - 1);
        
        */
        
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Factorial of "+n+ " is "+printFactorial(n));
    }
}
