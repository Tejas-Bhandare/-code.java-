
/*
 * Problem Statement:
    Write a java program which accept number from user and return difference between summation of even digits and summation of odd digits.
  
    Input : 123456
    
    Output : 3
 */
import java.util.Scanner;

class Digit {

  public int CountDifference(int iNo) {
    int iEvenDigitSum = 0, iOddDigitSum = 0, iDigit = 0;

    while (iNo != 0) {
      iDigit = iNo % 10;
      if (iDigit % 2 == 0) {
        iEvenDigitSum = iEvenDigitSum + iDigit;
      } else {
        iOddDigitSum = iOddDigitSum + iDigit;
      }
      iNo = iNo / 10;
    }
    return (iEvenDigitSum - iOddDigitSum);

  }
}

public class A38Program5 {

  public static void main(String[] args) {

    int iValue = 0, iRet = 0;

    Scanner sobj = new Scanner(System.in);
    Digit dobj = new Digit();

    System.out.println("Enter number :");

    iValue = sobj.nextInt();
    iRet = dobj.CountDifference(iValue);

    System.out
        .println("difference between summation of even digits and summation of odd digits in number is : " + iRet);

  }
}