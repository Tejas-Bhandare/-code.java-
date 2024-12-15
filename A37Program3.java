
/*
 * Problem Statement:
   Write Java program which accept N numbers from user and display all such elements which are even and divisible by 5.
 
    Input : N : 6
            Elements : 86 62 55 85 10 36
    
    Output : 10        
 */
import java.util.Scanner;

class ArrayDemo {

  public void Display(int Numbers[]) {

    for (int iCnt = 0; iCnt < Numbers.length; iCnt++) {
      if (Numbers[iCnt] % 5 == 0 && Numbers[iCnt] % 2 == 0) {
        System.out.println(Numbers[iCnt] + " ");
      }
    }
  }

}

public class A37Program3 {

  public static void main(String[] args) {

    int Arr[];
    int iSize = 0;

    Scanner sobj = new Scanner(System.in);
    ArrayDemo adobj = new ArrayDemo();

    System.out.println("How many elements you want to enter :");
    iSize = sobj.nextInt();

    Arr = new int[iSize];

    System.out.println("Enter the elements :");

    for (int i = 0; i < iSize; i++) {
      Arr[i] = sobj.nextInt();
    }

    System.out.println("Even numbers divisible by 5 are :");

    adobj.Display(Arr);

  }

}