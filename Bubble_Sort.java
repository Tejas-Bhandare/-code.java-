public class Bubble_Sort {

    public static void sort(int arr[], int size)
    {

        System.out.println("befor sorting");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size -i - 1; j++)
            {
                if (arr[j]>arr[j+1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;                   
                }
            }
        }

        System.out.println();
        System.out.println("after sorting");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {6,5,7,8,1,4,2};
        int size = arr.length;

        sort(arr, size);
    }
    
}
