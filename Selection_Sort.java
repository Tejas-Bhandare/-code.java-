public class Selection_Sort {
    

    public static void sort(int arr[], int size)
    {

        System.out.println("befor sorting");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        int max = 0;

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size - i - 1; j++)
            {
                if(arr[max]<arr[j])
                {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp; 
        }

        System.out.println();
        System.out.println("After sorting");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,1,9,5,8};
        int size = arr.length;

        sort(arr, size);
    }
}
