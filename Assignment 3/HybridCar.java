//This is the child class of vehicle which is a hybrid car
//The hybrid car has more and different variables
public class HybridCar extends Vehicle {
   private float batteryCapacity;
   private float tankCapacity;
   private String fuelType;
   private static final float KWH_COST = 2;

   //Constructors
   public HybridCar() {
      super();
      batteryCapacity = 0;
      tankCapacity = 0;
      fuelType = "unknown";
   }

   public HybridCar(String make, String model, int year, String licensePlate, int milesDriven, float batteryCapacity, float tankCapacity, String fuelType) {
      super(make, model, year, licensePlate, milesDriven);
      this.batteryCapacity = batteryCapacity;
      this.tankCapacity = tankCapacity;
      this.fuelType = fuelType;
   }
   //Returns the fuel efficency of the hybrid car 
   public float getFuelEfficiency(int newMiles) {
      float mpg = (float) newMiles / tankCapacity;
      float mpge = (float) newMiles / (batteryCapacity * KWH_COST);
      float mpgCombined = (mpg + mpge) / 2;
      return mpgCombined;
   }
}