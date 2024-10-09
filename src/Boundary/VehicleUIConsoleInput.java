package Boundary;

import java.util.Scanner;

import Control.VehicleUseCaseControl;
import dto.requestData;

public class VehicleUIConsoleInput {
    private InputBoundary inputBoundary;

    // Constructor
    public VehicleUIConsoleInput(InputBoundary inputBoundary) {
        this.inputBoundary = inputBoundary;
    }


    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== Menu DK xe =====");
            System.out.println("1. Them thong tin xe");
            System.out.println("2. Xem tat ca thong tin va thue");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    input();  
                    break;
                case "2":
                    ((VehicleUseCaseControl) inputBoundary).displayAllVehicles();  
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


        System.out.print("Ten chu xe: ");
        String ownerName = sc.nextLine();

        System.out.print("Gia tien cua xe: ");
        String strVehicleValue = sc.nextLine();

        System.out.print("Phan khoi(cc): ");
        String strEngineCapacity = sc.nextLine();


        requestData requestData = new requestData(ownerName, strVehicleValue, strEngineCapacity);


        inputBoundary.execute(requestData);

        System.out.println("Thong tin xe them thanh cong!");
    }
}
