
/*
 * Problem Statement:
    Write a java program which accept number from user and return the count of odd digits.
  
    Input : 1234
    
    Output : 2
 */
import java.util.Scanner;

class Digit {

  public int CountOddDigits(int iNo) {
    int iCount = 0, iDigit = 0;

    while (iNo != 0) {
      iDigit = iNo % 10;
      if (iDigit % 2 != 0) {
        iCount++;
      }
      iNo = iNo / 10;
    }
    return iCount;

  }
}

public class A38Program2 {

  public static void main(String[] args) {

    int iValue = 0, iRet = 0;

    Scanner sobj = new Scanner(System.in);
    Digit dobj = new Digit();

    System.out.println("Enter number :");

    iValue = sobj.nextInt();
    iRet = dobj.CountOddDigits(iValue);

    System.out.println("Count of Odd digits of number is : " + iRet);

  }
}