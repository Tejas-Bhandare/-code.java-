
/*
 * Problem Statement:
   Write java program which accept N numbers from user and accept one another number as NO , check whether NO is present or not.
 
    Input : N : 6
            NO : 55
            Elements : 86 62 55 85 10 36
    
    Output : true       
 */
import java.util.Scanner;

class Numbers {

  public boolean CheckNum(int Numbers[], int iNo) {
    boolean bIsFound = false;

    for (int iCnt = 0; iCnt < Numbers.length; iCnt++) {
      if (iNo == Numbers[iCnt]) {
        bIsFound = true;
        return bIsFound;
      }
    }
    return bIsFound;
  }

}

public class A39Program1 {

  public static void main(String[] args) {

    int Arr[];
    int iSize = 0, iValue = 0;
    boolean bRet = false;

    Scanner sobj = new Scanner(System.in);
    Numbers nobj = new Numbers();

    System.out.println("How many elements you want to enter :");
    iSize = sobj.nextInt();

    Arr = new int[iSize];

    System.out.println("Enter the elements :");

    for (int i = 0; i < iSize; i++) {
      Arr[i] = sobj.nextInt();
    }

    System.out.println("Enter number to check :");
    iValue = sobj.nextInt();

    bRet = nobj.CheckNum(Arr, iValue);

    if (bRet) {
      System.out.println("Number found");
    } else {
      System.out.println("Number not found");
    }

  }

}