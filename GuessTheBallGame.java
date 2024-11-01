import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GuessTheBallGame {

    static int guessTheBall(int n, int arr [][])
    {
        int glasses [] = {1,2,3};
        int temp = 0, g1 = 0, g2 = 0;

        for(int i = 0; i < 3; i++)
        {
            g1 = arr[i][0] - 1;
            g2 = arr[i][1] - 1;

            temp = glasses[g1];
            glasses[g1] = glasses[g2];
            glasses[g2] = temp;
        }
        return glasses[n-1];
    }

    public static void main(String[] args) throws IOException {
        
        int n = 0;
        int array [][] = new int[3][2];

        //Using BufferedReader class
        /* 
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        String inputStr = br.readLine();
        System.out.println(inputStr);
        br.close();
        */

        //Using Scanner class
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        String input [] = inputStr.split("[,]");
        n = Integer.parseInt(input[0]);
        int j = 1;
        for(int i = 0; i < 3; i++)
        {
            array[i][0] = Integer.parseInt(input[j]);
            array[i][1] = Integer.parseInt(input[j+1]);
            j += 2;
        }

        System.out.println(guessTheBall(n, array));
        inputStr.
        

    }
    
}


