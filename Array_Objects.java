class Student {
  int iRollNo = 0;
  int iMarks = 0;
  StringOps sName = " ";

}

public class Array_Objects {

  public static void main(StringOps[] args) {

    Student s1 = new Student();
    s1.sName = "Tejas";
    s1.iRollNo = 17;
    s1.iMarks = 89;

    Student s2 = new Student();
    s2.sName = "Akash";
    s2.iRollNo = 44;
    s2.iMarks = 90;

    Student s3 = new Student();
    s3.sName = "Ishan";
    s3.iRollNo = 04;
    s3.iMarks = 96;

    Student Students[] = new Student[3];

    Students[0] = s1;
    Students[1] = s2;
    Students[2] = s3;

    for (int iStudent = 0; iStudent < Students.length; iStudent++) {
      System.out.println("Student Name : " + Students[iStudent].sName + ", " + "Roll no : " + Students[iStudent].iRollNo
          + ", " + " Marks : " + Students[iStudent].iMarks);
    }

    System.out.println();

    for (Student stud : Students) {
      System.out.println("Student Name : " + stud.sName + ", " + "Roll no : " + stud.iRollNo
          + ", " + " Marks : " + stud.iMarks);
    }
  }

}
