
/*
 * Problem Statement:
    Write a java program which accept string from user and display it in reverse order.
      
      Input :  "Tejas"

      Output : "sajeT"
 
 */
import java.util.Scanner;

class StringDemo {

  int iSize;

  public void Reverse(String str) {

    StringBuilder sbString = new StringBuilder();
    iSize = str.length();

    for (int i = iSize - 1; i >= 0; i--) {
      sbString = sbString.append(str.charAt(i));
    }

    System.out.println(sbString);
  }

}

public class A36Program5 {

  public static void main(String[] args) {

    String str = "";

    Scanner sobj = new Scanner(System.in);
    StringDemo sdobj = new StringDemo();

    System.out.println("Enter String :");
    str = sobj.nextLine();

    sdobj.Reverse(str);

  }

}