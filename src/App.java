import Boundary.OutputBoundary;
import Boundary.VehicleUIConsoleInput;
import Boundary.VehicleUIConsoleOutput;
import Control.VehicleUseCaseControl;

public class App {
    public static void main(String[] args) {

        OutputBoundary outputBoundary = new VehicleUIConsoleOutput();
        VehicleUseCaseControl vehicleUseCaseControl = new VehicleUseCaseControl(outputBoundary);
        VehicleUIConsoleInput uiConsoleInput = new VehicleUIConsoleInput(vehicleUseCaseControl);
        uiConsoleInput.showMenu();
    }
}
