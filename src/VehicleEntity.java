public class VehicleEntity {

    public double calculateTax(double vehicleValue, int engineCapacity) {
        if (engineCapacity < 100) {
            return vehicleValue * 0.01;  // 1% tax
        } else if (engineCapacity <= 200) {
            return vehicleValue * 0.03;  // 3% tax
        } else {
            return vehicleValue * 0.05;  // 5% tax
        }
    }
}
