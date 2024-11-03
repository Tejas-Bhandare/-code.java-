public class PrintLastOccurance {

    public static int printIndex(int [] arr, int n, int index, int i)
    {
        if(i == arr.length -1)
        {
            return index;
        }
        if(arr[i] == n)
        {
            index = i;
        }
        return printIndex(arr, n, index, i+1);
    } 

    public static void main(String[] args) {
        int index = 0;
        int n = 8;
        int arr [] = {1,2,4,8,5,7,8,4};

        System.out.println(printIndex(arr, n, index, 0));
    }
}