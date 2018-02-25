
package vehicle;


public abstract class Vehicle {
private int VehicleId;
private double distance;
    public Vehicle() {
    }

    public Vehicle(int VehicleId) {
        this.VehicleId = VehicleId;
    }
    
   public abstract  boolean  checkConsumeEnergy(double distance);
  
    
}
