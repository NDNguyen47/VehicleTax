public class VehicleUIConsoleOutput {

    // Method to display the result using ResponseData
    public void displayResult(responseData responseData) {
        System.out.println("\n--- Vehicle Tax Information ---");
        System.out.println("Owner: " + responseData.ownerName);
        System.out.println("Vehicle Value: " + responseData.vehicleValue);
        System.out.println("Engine Capacity: " + responseData.engineCapacity + " cc");
        System.out.println("Tax: " + responseData.tax);
        System.out.println("-------------------------------");
    }


    public void displayError(String errorMessage) {
        System.out.println("Error: " + errorMessage);
    }
}
