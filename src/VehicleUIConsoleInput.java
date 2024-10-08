import java.util.Scanner;

public class VehicleUIConsoleInput {
    // Control instance
    VehicleUseCaseControl vehicleUseCaseControl = null;

    // Constructor
    public VehicleUIConsoleInput(VehicleUseCaseControl vehicleUseCaseControl) {
        this.vehicleUseCaseControl = vehicleUseCaseControl;
    }


    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== Vehicle Registration Menu =====");
            System.out.println("1. Input vehicle details and create vehicle");
            System.out.println("2. Display all vehicle tax details");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    input();  
                    break;
                case "2":
                    vehicleUseCaseControl.displayAllVehicles();  
                    break;
                case "3":
                    System.out.println("Exiting program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
    }


    public void input() {
        Scanner sc = new Scanner(System.in);

        // Collect vehicle details
        System.out.print("Enter owner name: ");
        String ownerName = sc.nextLine();

        System.out.print("Enter vehicle value: ");
        String strVehicleValue = sc.nextLine();

        System.out.print("Enter engine capacity (cc): ");
        String strEngineCapacity = sc.nextLine();


        requestData requestData = new requestData(ownerName, strVehicleValue, strEngineCapacity);


        vehicleUseCaseControl.execute(requestData);

        System.out.println("Vehicle details stored successfully!");
    }
}
