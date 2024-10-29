public class Demo {

  public static void main(StringOps[] ars) {
 
    Main ob = new Main();

    ob.printMessage(5);

  }

}

class Main {

  public void printMessage(int message) {

    System.out.println("Message primitive: " + message);

  }

  public void printMessage(Integer message) {

    System.out.println("Message object: " + message);

  }

}