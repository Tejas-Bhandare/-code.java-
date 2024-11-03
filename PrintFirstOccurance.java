public class PrintFirstOccurance {

    public static int printIndex(int arr[],int n, int i)
    {
        if(i == arr.length - 1)
        {
            return -1;
        }
        if(arr[i] == n)
        {
            return i;
        }
        return printIndex(arr,n,i+1);
    }

    public static void main(String[] args) {
        int  n = 7;
        int arr [] = {1,4,5,2,6,8,4,8,5,7,4,8};
        
        System.out.println(printIndex(arr, n , 0));
    }
}
