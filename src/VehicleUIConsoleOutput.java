public class VehicleUIConsoleOutput implements OutputBoundary {


    @Override
    public void displayResult(responseData responseData) {
        System.out.println("\n--- Vehicle Tax Information ---");
        System.out.println("Chu xe: " + responseData.ownerName);
        System.out.println("Gia tri xe: " + responseData.vehicleValue);
        System.out.println("Phan khoi: " + responseData.engineCapacity + " cc");
        System.out.println("Tax: " + responseData.tax);
        System.out.println("-------------------------------");
    }


    @Override
    public void displayError(String errorMessage) {
        System.out.println("Error: " + errorMessage);
    }
}
