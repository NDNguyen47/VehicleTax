import java.util.ArrayList;
import java.util.List;

public class VehicleUseCaseControl implements InputBoundary {
    // Fields
    private VehicleEntity vehicleEntity;
    private OutputBoundary outputBoundary;  
    private List<responseData> responseDataList = new ArrayList<>(); 


    public VehicleUseCaseControl(VehicleEntity vehicleEntity, OutputBoundary outputBoundary) {
        this.vehicleEntity = vehicleEntity;
        this.outputBoundary = outputBoundary;
    }


    @Override
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

                outputBoundary.displayError("Vehicle value and engine capacity must be positive.");
            }

        } catch (NumberFormatException e) {

            outputBoundary.displayError("Invalid input. Please enter valid numbers.");
        }
    }


    public void displayAllVehicles() {
        if (responseDataList.isEmpty()) {
            outputBoundary.displayError("No vehicles to display.");
        } else {
            for (responseData responseData : responseDataList) {
                outputBoundary.displayResult(responseData);
            }
        }
    }
}
