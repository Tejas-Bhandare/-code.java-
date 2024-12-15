
/*
 * Problem Statement:
    Write a java program which accept number from user and return the count of digits in between 3 and 7.
  
    Input : 123478
    
    Output : 3
 */
import java.util.Scanner;

class Digit {

  public int CountRange(int iNo) {
    int iCount = 0, iDigit = 0;

    while (iNo != 0) {
      iDigit = iNo % 10;
      if (iDigit >= 3 && iDigit <= 7) {
        iCount++;
      }
      iNo = iNo / 10;
    }
    return iCount;

  }
}

public class A38Program3 {

  public static void main(String[] args) {

    int iValue = 0, iRet = 0;

    Scanner sobj = new Scanner(System.in);
    Digit dobj = new Digit();

    System.out.println("Enter number :");

    iValue = sobj.nextInt();
    iRet = dobj.CountRange(iValue);

    System.out.println("Count of digits between 3 and 7 in number is : " + iRet);

  }
}