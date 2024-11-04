public class Static1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.school = "SJVR";
        s1.setName("tejas");
        System.out.println(s1.getName());

        Student s2 = new Student();
        System.out.println(s2.school);

        Student s3 = new Student();
        s3.school = "ABC";
        System.out.println(s3.school);
        System.out.println(s2.school);

        int Percentage = s1.returnPrecentage(89, 78, 91);
        System.out.println(Percentage);
    }
}

class Student
{

    int returnPrecentage(int math, int phy, int chem)
    {
        return (math + phy + chem)/3;
    }

    private String name;
    int roll;
    static String school;
    
    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return this.name;
    }


}