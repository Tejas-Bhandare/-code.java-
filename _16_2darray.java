

public class _16_2darray {

    // ******************************************* */
    // Printing ths 2d matrix spiral matrix print

    public static void printspiral(int matrix[][]) {
        int sr = 0;
        int sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;
        while (sr <= er && sc <= ec) {
            // top
            for (int i = sc; i <= ec; i++) {
                System.out.print(matrix[sr][i] + " ");
            }
            // right
            for (int j = sr + 1; j <= er; j++) {
                System.out.print(matrix[j][ec] + " ");
            }
            // bottom
            for (int k = ec - 1; k >= sc; k--) {
                if (sr == er) {
                    break;
                }
                System.out.print(matrix[er][k] + " ");
            }
            // left
            for (int l = er - 1; l >= sr + 1; l--) {
                if (sc == ec) {
                    break;
                }
                System.out.print(matrix[l][sc] + " ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        System.out.println();
    }
    // ************************************************ */
    // calculating the diagonal sum for matrix

    // brute force approach
    public static int digonalsum(int matrix[][]) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // optimal approach
    public static int digsum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }

        }
        return sum;
    }

    // *********************************************** */
    // searching element in the sorted array both col-wise and row-wise Staircase
    // method

    // approach 1 start from (o,n-1)
    public static boolean search1(int matrix[][], int key) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found");
        return false;

    }

    // approach 2 start from (n-1,0)
    public static boolean search2(int matrix[][], int key) {
        int row = matrix.length - 1;
        int col = 0;

        while (col < matrix.length && row >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printspiral(matrix);

        // diagonal sum
        System.out.println(digonalsum(matrix));
        System.out.println(digsum(matrix));

        int matr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        int key = 33;
        search1(matr, key);
    }
}
