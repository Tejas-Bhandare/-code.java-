public class Super1 {

    public static void main(String[] args) 
    {
        Horse h1 = new Horse();
        System.out.println(h1.color);

        Cat c1 = new Cat();
        System.out.println(c1.color);
    }
    
}

class Animal 
{
    String color;
    Animal()
    {
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal
{
    
    Horse()
    {
        super.color = "Brown";
        System.out.println("Horse constructor is called");
    }
}
class Cat extends Animal
{

    
    Cat()
    {
        super.color = "The glistening-white";
        System.out.println("Cat constructor is called");
    }
    
    
}
