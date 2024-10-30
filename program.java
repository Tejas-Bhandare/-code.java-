
import java.util.Scanner;

public class program {

  static int SumDigits(int iNo) {

    int iResult = 0;
    int iDigit = 0;

    while (iNo > 0) {
      iDigit = iNo % 10;
      iResult += iDigit;
      iNo = iNo / 10;
    }
    return iResult;

  }

  public static void main(String[] args) {

    int iNum = 0;
    int iSum = 0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number :");
    iNum = sc.nextInt();

    iSum = SumDigits(iNum);

    System.out.println("Addition of the digits of " + iNum + " is : " + iSum);
  }
}
