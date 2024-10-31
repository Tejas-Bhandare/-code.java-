public class Oops {
    public static void main(String[] args) {
        // Pen obj1 = new Pen();

        // obj1.setcolor("Red");
        // obj1.settip(1);
        // String colour = obj1.color;
        // int TipPoint = obj1.tip;
        // System.out.println(colour + " " + TipPoint);

        // BankAc set = new BankAc();
        // set.setuser("tejas");
        // set.setPass("tejas", 1243);

        //Student s2 = new Student("Tejas");
        Student s1 = new Student();
        s1.name= "Ram";
        s1.roll= 15;
        s1.standard= "feco";
        
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2 = new Student(s1);
        s1.marks[2]=90;
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
        
        // Student s3 = new Student(17);




        
}
}
 
class Pen {
    String color;
    int tip;

    void setcolor(String newcolor) {
        color = newcolor;
    }

    void settip(int newtip) {
        tip = newtip;
    }

}

class Student {

    String name;
    String standard;
    int roll;
    int marks[];
    float percentage;

    void calPercentage(int phy, int math, int chem) {
        percentage = (phy + math + chem) / 3;
    }
    Student(){ 
        marks= new int[3];
        System.out.println("Constructor called");
    }
    Student(int roll){
        marks= new int[3];
        this.roll=roll;
        System.out.println(roll);
    }
    Student(String name){
        marks= new int[3];
        this.name=name;
        System.out.println(name);
    }
// copy constructor
    Student(Student s1){
        marks= new int[3];
        this.name=s1.name;
        this.roll=s1.roll; 
        this.marks=s1.marks;
    }

}

class BankAc{
    private String username;
    private int pin;
    String getuser(){
        return this.username;
    }
    String setuser(String username){
        this.username=username;
        return this.username; 
    }


    void setPass(String user, int Newpin){
        if(username==user){
            pin=Newpin;
            System.out.println("Pin reset successfully");
        }
    }
}


