//This Vehicle class is an example of polymorphism and inheritance. 
//Baden Erb

public class Vehicle {
   //These variables will be used across any type of vehicle class
    private String make;
    private String model;
    private int year;
    private String licensePlate;
    private int milesDriven;
    
    //Constructors
    public Vehicle() {
        make = "unknown";
        model = "unknown";
        year = 0;
        licensePlate = "unknown";
        milesDriven = 0;
    }
    
    public Vehicle(String make, String model, int year, String licensePlate, int milesDriven) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
        this.milesDriven = milesDriven;
    }
}
