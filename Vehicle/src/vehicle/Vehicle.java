
package vehicle;


public abstract class Vehicle {
private int VehicleId;

    public Vehicle() {
    }

    public Vehicle(int VehicleId) {
        this.VehicleId = VehicleId;
    }

    public int getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(int VehicleId) {
        this.VehicleId = VehicleId;
    }
    
    
   public abstract  boolean  checkConsumeEnergy(double distance);
  
    
}
