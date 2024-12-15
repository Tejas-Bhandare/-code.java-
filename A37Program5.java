
/*
 * Problem Statement:
    Write Java program which accept N numbers from user and display all such elements which are multiple of 11 .
 
    Input : N : 6
            Elements : 86 66 55 85 10 30
    
    Output : 66 55
 */
import java.util.Scanner;

class ArrayDemo {

  public void Display(int Numbers[]) {

    for (int iCnt = 0; iCnt < Numbers.length; iCnt++) {
      if (Numbers[iCnt] % 11 == 0) {
        System.out.println(Numbers[iCnt] + " ");
      }
    }
  }

}

public class A37Program5 {

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

    System.out.println("Numbers which are multiples of 11 :");

    adobj.Display(Arr);

  }

}