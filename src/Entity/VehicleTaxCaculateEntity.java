package Entity;
public class VehicleTaxCaculateEntity {
    private String ownerName;        
    private double vehicleValue;      
    private int engineCapacity;      
    private double tax;               


    public VehicleTaxCaculateEntity(String ownerName, double vehicleValue, int engineCapacity) {
        this.ownerName = ownerName;
        this.vehicleValue = vehicleValue;
        this.engineCapacity = engineCapacity;
        this.tax = calculateTax();  
    }


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getVehicleValue() {
        return vehicleValue;
    }

    public void setVehicleValue(double vehicleValue) {
        this.vehicleValue = vehicleValue;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getTax() {
        return tax;
    }


    private double calculateTax() {
        if (engineCapacity < 100) {
            return vehicleValue * 0.01;  // 1% cho động cơ < 100cc
        } else if (engineCapacity <= 200) {
            return vehicleValue * 0.03;  // 3% cho động cơ 100-200cc
        } else {
            return vehicleValue * 0.05;  // 5% cho động cơ > 200cc
        }
    }
}
