
/*
 * Problem Statement:
    Write a java program which accept string from user and return difference between frequency of small characters and frequency of capital characters.
      
      Input : “TejaS BhandAre”

      Output : 3
 
 */
import java.util.Scanner;

class StringDemo {

  int iSize;

  public int CountDifference(String str) {
    int iCountSmall = 0;
    int iCountCapital = 0;
    iSize = str.length();

    for (int i = 0; i < iSize; i++) {
      if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        iCountSmall++;
      } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
        iCountCapital++;
      }
    }

    return iCountSmall - iCountCapital;
  }

}

public class A36Program3 {

  public static void main(String[] args) {

    String str = "";
    int iRet = 0;

    Scanner sobj = new Scanner(System.in);
    StringDemo sdobj = new StringDemo();

    System.out.println("Enter String :");
    str = sobj.nextLine();

    iRet = sdobj.CountDifference(str);

    System.out.println("Difference between capital and small letters is " + iRet);

  }

}