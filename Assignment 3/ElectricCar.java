//This is the child class of vehicle which is an electric car
//The electric car has more and different variables
public class ElectricCar extends Vehicle {
   private float batteryCapacity;
   private static final float KWH_COST = 2;
      
   //Constructors
   public ElectricCar() {
      super();
      batteryCapacity = 0;
   }

   public ElectricCar(String make, String model, int year, String licensePlate, int milesDriven, float batteryCapacity) {
      super(make, model, year, licensePlate, milesDriven);
      this.batteryCapacity = batteryCapacity;
   }
      
   //Returns the fuel efficacny of an electric car
   public float getFuelEfficiency(int newMiles) {
      float mpge = (float) newMiles / (batteryCapacity * KWH_COST);
      return mpge;
   }
}
