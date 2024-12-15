
/*
 * Problem Statement:
   Write java program which accept N numbers from user and return product of all odd elements.
    Input : N : 6
            Elements : 1 3 2 4 8 5
    
    Output : 15
 */
import java.util.Scanner;

class Numbers {

  public int OddNumsProduct(int Numbers[]) {
    int iOddProduct = 1;

    for (int iCnt = 0; iCnt < Numbers.length; iCnt++) {
      if (Numbers[iCnt] % 2 != 0) {
        iOddProduct = iOddProduct * Numbers[iCnt];
      }
    }
    return iOddProduct;
  }

}

public class A39Program5 {

  public static void main(String[] args) {

    int Arr[];
    int iSize = 0, iRet = 0;

    Scanner sobj = new Scanner(System.in);
    Numbers nobj = new Numbers();

    System.out.println("How many elements you want to enter :");
    iSize = sobj.nextInt();

    Arr = new int[iSize];

    System.out.println("Enter the elements :");

    for (int i = 0; i < iSize; i++) {
      Arr[i] = sobj.nextInt();
    }

    iRet = nobj.OddNumsProduct(Arr);

    System.out.println("Product of all odd numbers is : " + iRet);
  }

}