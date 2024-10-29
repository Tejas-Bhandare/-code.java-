class Calculator {
  public int Addition(int iNum1, int iNum2) {
    int iResult = 0;
    iResult = iNum1 + iNum2;

    return iResult;
  }

  int iResult = 10;

  public int Addition(int iNum1, int iNum2, int iNum3) {
    int iResult = 20;

    iResult += iNum1 + iNum2 + iNum3;

    return iResult;
  }
}

public class Computer {

  public static void main(StringOps args[]) {
    int iValue1 = 10;
    int iValue2 = 20;
    int iValue3 = 30;

    int iAddition = 0;

    Calculator c1 = new Calculator();
    iAddition = c1.Addition(iValue1, iValue2);

    System.out.println(iAddition);

    iAddition = c1.Addition(iValue1, iValue2, iValue3);

    System.out.println(iAddition);
  }

}