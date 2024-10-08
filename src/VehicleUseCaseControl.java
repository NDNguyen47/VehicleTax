import java.util.ArrayList;
import java.util.List;

public class VehicleUseCaseControl {
    // Fields
    VehicleEntity vehicleEntity = null;
    VehicleUIConsoleOutput vehicleUIConsoleOutput = null;
    List<responseData> responseDataList = new ArrayList<>();  


    public VehicleUseCaseControl(VehicleEntity vehicleEntity, VehicleUIConsoleOutput vehicleUIConsoleOutput) {
        this.vehicleEntity = vehicleEntity;
        this.vehicleUIConsoleOutput = vehicleUIConsoleOutput;
    }


    public void execute(requestData requestData) {
        try {

            String ownerName = requestData.ownerName;
            double vehicleValue = Double.parseDouble(requestData.strVehicleValue);
            int engineCapacity = Integer.parseInt(requestData.strEngineCapacity);


            if (vehicleValue > 0 && engineCapacity >= 0) {

                double tax = vehicleEntity.calculateTax(vehicleValue, engineCapacity);


                responseData responseData = new responseData(ownerName, vehicleValue, engineCapacity, tax);


                responseDataList.add(responseData);

            } else {

                vehicleUIConsoleOutput.displayError("Vehicle value and engine must be possitve.");
            }

        } catch (NumberFormatException e) {

            vehicleUIConsoleOutput.displayError("Invalid input. Nhap 1 so.");
        }
    }


    public void displayAllVehicles() {
        if (responseDataList.isEmpty()) {
            vehicleUIConsoleOutput.displayError("No vehicles to display.");
        } else {
            for (responseData responseData : responseDataList) {
                vehicleUIConsoleOutput.displayResult(responseData);
            }
        }
    }
}
