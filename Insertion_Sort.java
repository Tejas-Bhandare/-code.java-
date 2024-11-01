public class Insertion_Sort {
    
    public static void sort(int arr[])
    {

        System.out.println();
        System.out.println("Before sorting");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        for(int i=1; i<arr.length; i++)
        {
           
            int j = i-1, key = arr[i];
            
            while (j>=0 && arr[j]>key) 
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println();
        System.out.println("After sorting");

        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,4,9,5,2,7,3,6};

        sort(arr);
     }
}
