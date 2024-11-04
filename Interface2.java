public class Interface2 {
    public static void main(String[] args) {
        Bear B1 = new Bear();
        B1.EatsNonveg();
        B1.Eatveg();
    }   
}

interface Harbivores 
{
    void Eatveg();
}
interface Carnivores
{
    void EatsNonveg();
}

class Bear implements Harbivores, Carnivores
{
    public void  Eatveg()
    {
        System.out.println("Eats plants, grass, vegeterian food");
    }
    public void EatsNonveg()
    {
        System.out.println("Eats meat");
    }
}
