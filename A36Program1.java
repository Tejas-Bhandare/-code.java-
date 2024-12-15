
/*
 * Problem Statement:
    1.Write a Java program which accept string from user and count number of capital characters.
      
      Input : “TejaS BhandAre”

      Output : 4
 
 */
import java.util.Scanner;

class StringDemo {
  int iCount;
  int iSize;

  public int CountCapital(String str) {
    iCount = 0;
    iSize = str.length();

    for (int i = 0; i < iSize; i++) {
      if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
        iCount++;
      }
    }

    return iCount;
  }

}

public class A36Program1 {

  public static void main(String[] args) {

    String str = "";
    int iRet = 0;

    Scanner sobj = new Scanner(System.in);
    StringDemo sdobj = new StringDemo();

    System.out.println("Enter String :");
    str = sobj.nextLine();

    iRet = sdobj.CountCapital(str);

    System.out.println("String contains " + iRet + " Capital letters");

  }

}