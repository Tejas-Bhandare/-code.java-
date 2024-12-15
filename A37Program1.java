
/*
 * Problem Statement:
    Write Java program which accept N numbers from user and return difference between summation of even elements and summation of odd elements.
 
    Input : N : 6
            Elements : 86 62 77 84 93 88
    
    Output : 150 (320 - 170)        
 */
import java.util.Scanner;

class ArrayDemo {

  public int Difference(int Numbers[]) {

    int iEvenSum = 0, iOddSum = 0;

    for (int iCnt = 0; iCnt < Numbers.length; iCnt++) {
      if (Numbers[iCnt] % 2 == 0) {
        iEvenSum = iEvenSum + Numbers[iCnt];
      } else {
        iOddSum = iOddSum + Numbers[iCnt];
      }
    }
    return (iEvenSum - iOddSum);
  }

}

public class A37Program1 {

  public static void main(String[] args) {

    int Arr[];
    int iSize = 0;
    int iRet = 0;

    Scanner sobj = new Scanner(System.in);
    ArrayDemo adobj = new ArrayDemo();

    System.out.println("How many elements you want to enter :");
    iSize = sobj.nextInt();

    Arr = new int[iSize];

    System.out.println("Enter the elements :");

    for (int i = 0; i < iSize; i++) {
      Arr[i] = sobj.nextInt();
    }

    iRet = adobj.Difference(Arr);

    System.out.println("Difference between summation of even numbers and summation of odd numbers is : " + iRet);

  }

}