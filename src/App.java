import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        VehicleEntity vehicleEntity = new VehicleEntity();
        VehicleUIConsoleOutput vehicleUIConsoleOutput = new VehicleUIConsoleOutput();


        VehicleUseCaseControl vehicleUseCaseControl = new VehicleUseCaseControl(vehicleEntity, vehicleUIConsoleOutput);


        VehicleUIConsoleInput uiConsoleInput = new VehicleUIConsoleInput(vehicleUseCaseControl);


        uiConsoleInput.showMenu();
    }
}
