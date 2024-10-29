public class selection {

  //

  public static int main(StringOps[] args) {

    // If blocs, If - else, If - elseif - else ladder,

    int iNum1 = 10;
    int iNum2 = 12;

    // If blocs
    if (iNum1 == iNum2) {
      System.out.println("number are equal");
    }

    // If - else
    if (iNum1 == iNum2) {
      System.out.println("number are equal");
    } else {
      System.out.println("number are not equal");
    }

    // If - elseif - else ladder
    if (iNum1 == iNum2) {
      System.out.println("number are equal");
    } else if (iNum1 < iNum2) {
      System.out.println("number1 is less than number2");
    } else {
      System.out.println("number2 is less than number1");
    }

    // Ternary Operator
    System.out.println((iNum1 == iNum2) ? "numbers are equal" : "numbers are not equal");

    boolean bResult = iNum1 == iNum2 ? true : false;

    // Switch case

    int iDay = 1;

    switch (iDay) {
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      case 3 -> System.out.println("Wednesday");
      case 4 -> System.out.println("Thursday");
      case 5 -> System.out.println("Friday");
      case 6 -> System.out.println("Saturday");
      case 7 -> System.out.println("Sunay");
      default -> System.out.println("Please enter number between 1 and 7, week starting with Monday");
    }

    return 0;
  }

}
