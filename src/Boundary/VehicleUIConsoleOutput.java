package Boundary;

import dto.responseData;
import dto.responseError;

public class VehicleUIConsoleOutput implements OutputBoundary {

    @Override
    public void displayResult(responseData responseData) {
        System.out.println("\n--- Thong Tin Thue Xe ---");
        System.out.println("Chu xe: " + responseData.getOwnerName());
        System.out.println("Gia tri xe: " + responseData.getVehicleValue());
        System.out.println("Phan khoi: " + responseData.getEngineCapacity() + " cc");
        System.out.println("Thue: " + responseData.getTax());
        System.out.println("-------------------------");
    }

    @Override
    public void displayError(responseError responseError) {
        System.out.println("Error: " + responseError.getErrorMessage());
    }
}
