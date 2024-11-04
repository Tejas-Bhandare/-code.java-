public class interface3 {
    public static void main(String[] args) {
        Mustangcar Mustang = new Mustangcar();

        Mustang.steeringtype();
        System.out.println();
        Mustang.engineType();
        System.out.println();
        Mustang.wheelstructure();
    }
}


interface wheel
{
    void wheelstructure();

}

interface Body 
{
    void steeringtype();
}

interface Engine
{
    void engineType();
}

class Mustangcar implements wheel,Body,Engine
{
    @Override
    public void wheelstructure() {
        System.out.println("Standard wheel '\' Tire dimensions : 17 in. x 7.5 in. 235/55R");
        System.out.println("Optional : 18 in. x 8.0 in. 235/50R W A/S; 19 in. x 8.5 in.\r\n" + //
                "255/40R W A/S; 20 in. x 9.0 in. 265/35R W A/S;\r\n" + //
                "Performance Package: 19 in. x 9.0 in. 255/40R\r\n" + //
                "Y (summer-only tires)");
        
    }

    @Override
    public void steeringtype() {
        System.out.println("Steering modes :  Normal, comfort, sport");
        System.out.println("Ratio : 15.5:1");
        System.out.println("Active features :  Optional MagneRide damping system ");
        
    }

    @Override
    public void engineType() {
        System.out.println("Engine Configuration are :");
        System.out.println("Engine : 2.3-liter EcoBoost");
        System.out.println("Configuration : Port fuel direct injection turbocharged I-4");
        System.out.println("Displacement : 137.5 cu. in. (2,300 cc)");
    }
}