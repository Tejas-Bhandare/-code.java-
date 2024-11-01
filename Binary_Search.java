public class Binary_Search {
    
    // Recursive
    public static int recursiveSearch(int arr[], int target, int left, int right)
    {
        int mid = (left + right) / 2;
        if(left <= right)
        {
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target )
            {
                return recursiveSearch(arr, target, mid + 1, right);
            }
            else
            {
                return recursiveSearch(arr, target, left, mid - 1);
            }
        }
        return -1;        
    }
    
    public static int search(int arr[], int target)
    {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right)
        {
            int mid = (left + right) / 2;

            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target )
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int arr [] = {1,2,4,7,8,9,10,14,16};
        int target = 16;

        int left = 0;
        int right = arr.length - 1;
        
        System.out.println("Element found at index : "+ recursiveSearch(arr, target, left, right));
        System.out.println("Element found at index : "+ search(arr, target));
    }
}
