import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        VehicleEntity vehicleEntity = new VehicleEntity();
        OutputBoundary outputBoundary = new VehicleUIConsoleOutput();


        InputBoundary vehicleUseCaseControl = new VehicleUseCaseControl(vehicleEntity, outputBoundary);

        VehicleUIConsoleInput uiConsoleInput = new VehicleUIConsoleInput(vehicleUseCaseControl);


        uiConsoleInput.showMenu();
    }
}
