class PrintNum{
    public static void printDecNumbers(int n)
    {
        if(n>0)
        {
            System.err.print(n+" ");
            printDecNumbers(n - 1);
        }
        
    }
    public static void printAscNumbers(int n)
    {
        if(n>0)
        {
            printAscNumbers(n - 1);
            System.err.print(n+" ");
        }   
    }
    public static void main(String[] args){
        printDecNumbers(10);
        System.out.println();
        printAscNumbers(10);
    }
}