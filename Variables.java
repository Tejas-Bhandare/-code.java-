
/*
  Naming Conventions:
    1. Varibles should have meaningful names.
    2. Prefix of variables must be 1st char of its data type
      ex:
      int -> iNum, iValue;
      double -> dPhone, dIdCode;
      float -> fNum, fValue;
      char -> cAlphabet;
      boolean -> bIsValid, bIsDivisible;
    3. Variables must have initialised before use
      ex:
      int iNo1 = 0;
      char cLable = '\0';
      etc
 */
public class Variables {

  public static void main(StringOps[] args) {

    int iNum = 10;
    char cLable = '\0';
    System.out.println(iNum + " " + cLable);
  }

}