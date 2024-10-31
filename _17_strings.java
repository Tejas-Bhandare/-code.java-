import java.util.Scanner;

public class _17_strings {

    public static boolean ispallindrome() {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        int n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // shortest distance between destination dased on given path "wneenesennn
    // /WNEENESENNN "

    public static float shortestpath(String path) {
        int X = 0, Y = 0;

        for (int i = 0; i < path.length(); i++) {
            String str = "EWNS";
            if (path.charAt(i) == str.charAt(0)) {
                X++;
            }
            if (path.charAt(i) == str.charAt(1)) {
                X--;
            }
            if (path.charAt(i) == str.charAt(2)) {
                Y++;
            }
            if (path.charAt(i) == str.charAt(3)) {
                Y--;
            }
        }

        int X2 = X * X;
        int Y2 = Y * Y;

        return (float) Math.sqrt(X2 + Y2);
    }

    // for given string convert each first letter to upper case "hi i am tejas"

    public static String touppercase(String str) {

        StringBuilder sb = new StringBuilder(" ");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    // String compression compress string to small "aaaabbbcccdddd" to "a4b3c3d4"

    public static String stringcompressor(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sb.append(ch);
            Integer count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                sb.append(count);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        /*
         * boolean result = ispallindrome();
         * if (result) {
         * System.out.println("String is pallindrome");
         * } else {
         * System.out.println("String is not pallindrome");
         * }
         */
        // String path = "WNEENESENNN";
        // System.out.println("shortest distance for path " + path + " is " +
        // shortestpath(path));

        // String str = "hi i am tejas ";
        // System.out.println(touppercase(str));

        String str = "aaaabbbbdddsssfrrhhh";
        System.out.println(stringcompressor(str));

    }

}
