
/*
 * Problem Statement:
    Write a java program which accept number from user and return the product of all digits.
  
    Input : 123
    
    Output : 6
 */
import java.util.Scanner;

class Digit {

  public int DigitProduct(int iNo) {
    int iProduct = 1, iDigit = 0;

    while (iNo != 0) {
      iDigit = iNo % 10;
      if (iDigit != 0) {
        iProduct = iProduct * iDigit;
      }
      iNo = iNo / 10;
    }
    return iProduct;

  }
}

public class A38Program4 {

  public static void main(String[] args) {

    int iValue = 0, iRet = 0;

    Scanner sobj = new Scanner(System.in);
    Digit dobj = new Digit();

    System.out.println("Enter number :");

    iValue = sobj.nextInt();
    iRet = dobj.DigitProduct(iValue);

    System.out.println("Product of all digits in number is : " + iRet);

  }
}