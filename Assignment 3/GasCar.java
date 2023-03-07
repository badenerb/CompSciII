//Child class of vehicle, the gas car will have different variables and a get fuel efficency methods
public class GasCar extends Vehicle {
   private float tankCapacity;
   private String fuelType;

   public GasCar() {
      super();
      tankCapacity = 0;
      fuelType = "unknown";
   }

   public GasCar(String make, String model, int year, String licensePlate, int milesDriven, float tankCapacity, String fuelType) {
      super(make, model, year, licensePlate, milesDriven);
      this.tankCapacity = tankCapacity;
      this.fuelType = fuelType;
   }
        
   //Returns the fuel efficency of the gas car 
   public float getFuelEfficiency(int newMiles) {
      float mpg = (float) newMiles / tankCapacity;
      return mpg;
   }
}