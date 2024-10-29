class Calculator {
  public int Addition(int iValue1, int iValue2) {
    int iAddition = 0;

    iAddition = iValue1 + iValue2;

    return iAddition;
  }

  public void createInnerObject() {
    InnerClass inner = new InnerClass(); // Can be instantiated here
    inner.display();
  }

  private class InnerClass { // Valid: private nested class
    public void display() {
      System.out.println("Inside private inner class");
    }
  }
}

public class P1Class {

  public static void main(String args[]) {

    int iNum1 = 10;
    int iNum2 = 20;

    int iResult = iNum1 + iNum2;
    System.out.println(iResult);

    Calculator c1 = new Calculator();
    iResult = c1.Addition(iNum1, iNum2);

    System.out.println(iResult);

    c1.createInnerObject();

  }

}
