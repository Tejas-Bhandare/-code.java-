

public class sorting {

    public static void bubblesort(int array[]) {
        for (int turn = 0; turn < array.length - 1; turn++) {
            for (int j = 0; j < array.length - 1 - turn; j++) {
                if (array[j] > array[j + 1]) {
                    //swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 6, 5 };
        bubblesort(arr);
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}



/************* Selection sort ****************/
/*
 * public class sorting {
 * public static void selectionsort(int array[]) {
 * for (int turn = 0; turn < array.length - 1; turn++) {
 * int minpos = turn;
 * for (int j = turn + 1; j < array.length; j++) {
 * if (array[minpos] > array[j]) {
 * minpos = j;
 * }
 * }
 * // swap
 * int temp = array[minpos];
 * array[minpos] = array[turn];
 * array[turn] = temp;
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int arr[] = { 2, 3, 1, 6, 5 };
 * selectionsort(arr);
 * for (int i : arr) {
 * System.out.println(i + " ");
 * }
 * }
 * }
 * 
 */