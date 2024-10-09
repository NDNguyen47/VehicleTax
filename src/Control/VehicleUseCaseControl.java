package Control;

import java.util.ArrayList;
import java.util.List;

import Boundary.InputBoundary;
import Boundary.OutputBoundary;
import Entity.VehicleTaxCaculateEntity;
import dto.requestData;
import dto.responseData;
import dto.responseError;

public class VehicleUseCaseControl implements InputBoundary {
    private OutputBoundary outputBoundary;
    private List<VehicleTaxCaculateEntity> vehicleList = new ArrayList<>();  // Danh sách các đối tượng xe


    public VehicleUseCaseControl(OutputBoundary outputBoundary) {
        this.outputBoundary = outputBoundary;
    }


    @Override
    public void execute(requestData requestData) {
        try {

            String ownerName = requestData.getOwnerName();
            double vehicleValue = Double.parseDouble(requestData.getStrVehicleValue());
            int engineCapacity = Integer.parseInt(requestData.getStrEngineCapacity());

            if (vehicleValue > 0 && engineCapacity >= 0) {

                VehicleTaxCaculateEntity vehicle = new VehicleTaxCaculateEntity(ownerName, vehicleValue, engineCapacity);
                vehicleList.add(vehicle);  

            } else {

                responseError responseError = new responseError("Giá trị xe và dung tích xy-lanh phải là số dương.");
                outputBoundary.displayError(responseError);
            }

        } catch (NumberFormatException e) {

            responseError responseError = new responseError("Dữ liệu không hợp lệ. Vui lòng nhập số.");
            outputBoundary.displayError(responseError);
        }
    }


    public void displayAllVehicles() {
        if (vehicleList.isEmpty()) {
            responseError responseError = new responseError("Không có xe nào để hiển thị.");
            outputBoundary.displayError(responseError);
        } else {
            for (VehicleTaxCaculateEntity vehicle : vehicleList) {

                responseData responseData = new responseData(
                    vehicle.getOwnerName(),
                    vehicle.getVehicleValue(),
                    vehicle.getEngineCapacity(),
                    vehicle.getTax()
                );
                outputBoundary.displayResult(responseData);
            }
        }
    }
}
