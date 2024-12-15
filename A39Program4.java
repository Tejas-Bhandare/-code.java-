
/*
 * Problem Statement:
   Write java program which accept N numbers from user and accept one another number as NO , return index of first occurrence of that NO
    Input : N : 6
            NO : 55
            start : 30
            end : 60
            Elements : 86 62 55 85 86 36
    
    Output : 55 36
 */
import java.util.Scanner;

class Numbers {

  public void Display(int Numbers[], int iStart, int iEnd) {

    for (int iCnt = 0; iCnt < Numbers.length; iCnt++) {
      if (Numbers[iCnt] > iStart && Numbers[iCnt] < iEnd) {
        System.out.println(Numbers[iCnt] + " ");
      }
    }
  }

}

public class A39Program4 {

  public static void main(String[] args) {

    int Arr[];
    int iSize = 0, iValue1 = 0, iValue2 = 0;

    Scanner sobj = new Scanner(System.in);
    Numbers nobj = new Numbers();

    System.out.println("How many elements you want to enter :");
    iSize = sobj.nextInt();

    Arr = new int[iSize];

    System.out.println("Enter the elements :");

    for (int i = 0; i < iSize; i++) {
      Arr[i] = sobj.nextInt();
    }

    System.out.println("Enter Starting value of range :");
    iValue1 = sobj.nextInt();
    System.out.println("Enter Ending value of range :");
    iValue2 = sobj.nextInt();

    System.out.println("Numbers between " + iValue1 + " and " + iValue2 + " are :");
    nobj.Display(Arr, iValue1, iValue2);

  }

}