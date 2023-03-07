//This tester class will test all of the child classes that are in this assignemnt

public class Tester extends Vehicle{
    public static void main(String[] args) {
        GasCar gasCar1 = new GasCar();
        GasCar gasCar2 = new GasCar("Honda", "Civic", 2021, "ABC123", 5000, 10, "Gas");
        
        ElectricCar electricCar1 = new ElectricCar();
        ElectricCar electricCar2 = new ElectricCar("Tesla", "Model S", 2021, "XYZ789", 1000, 80);
        
        HybridCar hybridCar1 = new HybridCar();
        HybridCar hybridCar2 = new HybridCar("Toyota", "Prius", 2021, "DEF456", 2000, 8, 40, "Gasoline");
        
        float gasMpg1 = gasCar1.getFuelEfficiency(200);
        float gasMpg2 = gasCar2.getFuelEfficiency(300);
        float electricMpge1 = electricCar1.getFuelEfficiency(50);
        float electricMpge2 = electricCar2.getFuelEfficiency(100);
        float hybridMpg1 = hybridCar1.getFuelEfficiency(150);
        float hybridMpg2 = hybridCar2.getFuelEfficiency(250);
        
        System.out.println("Gas car 1 mpg: " + gasMpg1);
        System.out.println("Gas car 2 mpg: " + gasMpg2);
        System.out.println("Electric car 1 mpge: " + electricMpge1);
        System.out.println("Electric car 2 mpge: " + electricMpge2);
        System.out.println("Hybrid car 1 mpg: " + hybridMpg1);
        System.out.println("Hybrid car 2 mpg: " + hybridMpg2);
    }
}