public class Static3 {

    public static void main(String[] args) {
        System.out.println("Hello from main method");
    }

    static
    {
        System.out.println("static block called first time ");
    }
    static
    {
        System.out.println("static block called second time");
    }
    
}
