public class Static2 {
    public static void main(String[] args) {
        
        student s1 = new student();
        s1.name = "tejas";
        s1.roll = 17;
        s1.schoolName = "SJVR";

        student s2 = new student();
        s2.name = "akash";
        s2.roll = 44;
        s2.schoolName = "ABC";

    }
}

class student
{
    String name;
    int roll;
    static String schoolName;

    static int returnPercentage(int a, int b, int c)
    {
        return (a + b + c)/3
;    }
}