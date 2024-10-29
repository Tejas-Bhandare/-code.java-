
class Human {

  private int iAge = 0;
  private String sName = "";

  public Human() {
    iAge = 18;
    sName = "Dummy";
    System.out.println("Inside constructor");
  }

  public Human(int iAge, String sName) {
    this.iAge = iAge;
    this.sName = sName;
  }

  public void setName(String sName) {
    this.sName = sName;
  }

  public void setAge(int iAge) {
    this.iAge = iAge;
  }

  public int getAge() {
    return iAge;
  }

  public String getName() {
    return sName;
  }

  public void Display() {
    System.out.println(sName + " : " + iAge);
  }

}

public class Encapsulation {

  public static void main(String[] args) {

    Human h1 = new Human();
    h1.setAge(23);
    h1.setName("Tejas");

    h1.Display();

    Human h2 = new Human();
    h2.setAge(21);
    h2.setName("Raju");

    h2.Display();

    Human h3 = new Human(19, "Ram");
    h3.Display();
  }
}
