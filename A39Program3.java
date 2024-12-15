
/*
 * Problem Statement:
   Write java program which accept N numbers from user and accept one another number as NO , return index of last occurrence of that NO
    Input : N : 6
            NO : 55
            Elements : 86 62 55 85 86 36
    
    Output : 4     
 */
import java.util.Scanner;

class Numbers {

  public int LastOccurance(int Numbers[], int iNo) {
    int iIndex = -1;

    for (int iCnt = 0; iCnt < Numbers.length; iCnt++) {
      if (iNo == Numbers[iCnt]) {
        iIndex = iCnt;
      }
    }
    return iIndex;
  }

}

public class A39Program3 {

  public static void main(String[] args) {

    int Arr[];
    int iSize = 0, iValue = 0, iRet = 0;

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

    iRet = nobj.LastOccurance(Arr, iValue);

    if (iRet >= 0) {
      System.out.println("Last occurance index of number is : " + iRet);
    } else {
      System.out.println("Number not found");
    }

  }

}