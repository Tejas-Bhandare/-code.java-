
/*
 * Problem Statement:
    Write a java program which accept string from user and count number of small characters.
      
      Input : “TejaS BhandAre”

      Output : 7
 
 */
import java.util.Scanner;

class StringDemo {
  int iCount;
  int iSize;

  public int CountSmall(String str) {
    iCount = 0;
    iSize = str.length();

    for (int i = 0; i < iSize; i++) {
      if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        iCount++;
      }
    }

    return iCount;
  }

}

public class A36Program2 {

  public static void main(String[] args) {

    String str = "";
    int iRet = 0;

    Scanner sobj = new Scanner(System.in);
    StringDemo sdobj = new StringDemo();

    System.out.println("Enter String :");
    str = sobj.nextLine();

    iRet = sdobj.CountSmall(str);

    System.out.println("String contains " + iRet + " Capital letters");

  }

}