package dto;
public class responseData {
    private String ownerName;
    private double vehicleValue;
    private int engineCapacity;
    private double tax;

    // Constructor
    public responseData(String ownerName, double vehicleValue, int engineCapacity, double tax) {
        this.ownerName = ownerName;
        this.vehicleValue = vehicleValue;
        this.engineCapacity = engineCapacity;
        this.tax = tax;
    }

    // Getter Setter
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

    public void setTax(double tax) {
        this.tax = tax;
    }
}