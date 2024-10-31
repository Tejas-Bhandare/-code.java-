import java.util.*;

public class _17_prq {

    // Question1: count how many times vowvels are appered in string eentered by
    // user

    public static int countvowels(String str) {
        Integer count = 0;
        str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    // Given two strings. The task is to check whether the given strings are
    // anagrams of each other or not.
    // An anagram of a string is another string that contains the same characters,
    // only the order of characters can be different. For example, “abcd” and “dabc”
    // are an anagram of each other.

    public static void checkanagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] carr1 = str1.toCharArray();
            char[] carr2 = str2.toCharArray();

            Arrays.sort(carr1);
            Arrays.sort(carr2);

            boolean result = Arrays.equals(carr1, carr2);
            if (result) {
                System.out.println("Strings " + str1 + " and " + str2 + " are anagrams");
            } else {
                System.out.println("Strings " + str1 + " and " + str2 + " are not anagrams");
            }
        } else {
            System.out.println("Strings " + str1 + " and " + str2 + " are not anagrams");
        }

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String st = sc.nextLine();
        // sc.close();
        // System.out.println("There are " + countvowels(st) + " vowels in statement : "
        // + st);

        // String str = "ShradhaDidi";
        // String str1 = "ApnaCollege";
        // String str2 = "ShradhaDidi";
        // System.out.println(str.equals(str1) + " " + str.equals(str2));
        // String str3 = "ApnaCollege".replace("l", "");
        // System.out.println(str3);

        String str4 = "Rama";
        String str5 = "Amar";
        checkanagram(str4, str5);

    }
}
