package vehicle;

public class Motorcycle extends Vehicle{

    private String model;
    private String manufacturer;
    private double gasoline;

    public Motorcycle(String model, String manufacturer, double gasoline, int VehicleId) {
        super(VehicleId);
        this.model = model;
        this.manufacturer = manufacturer;
        this.gasoline = gasoline;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getGasoline() {
        return gasoline;
    }

    public void setGasoline(double gasoline) {
        this.gasoline = gasoline*0.12;
    }
    
   public boolean checkConsumeEnergy(double distance){
   if(distance==gasoline){
     return true;
     }
     else{
         return false;
     }
   }   
}
