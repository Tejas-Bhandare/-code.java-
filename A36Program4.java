
/*
 * Problem Statement:
    Write a java program which accept string from user and check whether it contains vowels in it or not.
      
      Input : “TejaS BhandAre”

      Output : 
 
 */
import java.util.Scanner;

class StringDemo {

  int iSize;

  public boolean CheckVowel(String str) {

    boolean bIsVowel = false;
    iSize = str.length();

    for (int i = 0; i < iSize; i++) {
      if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
          || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O'
          || str.charAt(i) == 'u' || str.charAt(i) == 'u') {
        bIsVowel = true;
      }

    }

    return bIsVowel;
  }

}

public class A36Program4 {

  public static void main(String[] args) {

    String str = "";
    boolean bRet = false;

    Scanner sobj = new Scanner(System.in);
    StringDemo sdobj = new StringDemo();

    System.out.println("Enter String :");
    str = sobj.nextLine();

    bRet = sdobj.CheckVowel(str);

    if (bRet == true) {
      System.out.println("String contains vowels");
    } else {
      System.out.println("String dont contains vowels");
    }
  }

}