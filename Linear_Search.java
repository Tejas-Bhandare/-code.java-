
public class Linear_Search {

    public static int search(int arr[], int target){

        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                System.out.println("Element found at index: "+ i);
                return i;
            }
        }
        System.out.println("Element not found");
        return -1;
    }
    


    public static void main(String[] args) {
        
        int num [] = {5,7,6,4,2,1,9};
        search(num, 1);
    }
}