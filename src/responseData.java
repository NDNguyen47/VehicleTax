public class responseData {
    String ownerName;
    double vehicleValue;
    int engineCapacity;
    double tax;

    // Constructor
    public responseData(String ownerName, double vehicleValue, int engineCapacity, double tax) {
        this.ownerName = ownerName;
        this.vehicleValue = vehicleValue;
        this.engineCapacity = engineCapacity;
        this.tax = tax;
    }
}