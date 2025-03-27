import core.SmartHomeController;
import devices.EnergyMonitor;
import devices.Light;
import devices.Thermostat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartHomeController controller = new SmartHomeController();
        boolean isRunning = true;

        System.out.println("Welcome to the Smart Home Control System!");

        while (isRunning) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Add a device");
            System.out.println("2. Remove a device");
            System.out.println("3. Turn on all lights");
            System.out.println("4. Set temperature");
            System.out.println("5. View system status");
            System.out.println("7. Turn off all lights");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addDevice(controller, scanner);
                    break;
                case 2:
                    removeDevice(controller, scanner);
                    break;
                case 3:
                    controller.turnAllLightsOn();
                    break;
                case 4:
                    setTemperature(controller, scanner);
                    break;
                case 5:
                    System.out.println(controller.getSystemStatusReport());
                    break;
                case 7:
                    controller.turnAllLightsOff();
                    break;
                case 8:
                    isRunning = false;
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 8.");
            }
        }

        scanner.close();
    }

    // Add a device
    private static void addDevice(SmartHomeController controller, Scanner scanner) {
        System.out.println("Which device would you like to add?");
        System.out.println("1. Light");
        System.out.println("2. Thermostat");
        System.out.println("3. Energy Monitor");
        System.out.print("Enter your choice (1-3): ");
        int deviceChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the device name: ");
        String deviceName = scanner.nextLine();

        switch (deviceChoice) {
            case 1:
                controller.addDevice(new Light(deviceName));
                System.out.println(deviceName + " light added.");
                break;
            case 2:
                controller.addDevice(new Thermostat(deviceName));
                System.out.println(deviceName + " thermostat added.");
                break;
            case 3:
                controller.addDevice(new EnergyMonitor(deviceName));
                System.out.println(deviceName + " energy monitor added.");
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 3.");
        }
    }

    // Remove a device
    private static void removeDevice(SmartHomeController controller, Scanner scanner) {
        System.out.print("Enter the device name: ");
        String deviceName = scanner.nextLine();
        System.out.println(deviceName + " removed.");
    }

    // Set temperature
    private static void setTemperature(SmartHomeController controller, Scanner scanner) {
        System.out.print("Enter the temperature (°C): ");
        int temperature = scanner.nextInt();
        scanner.nextLine();

        controller.setGlobalTemperature(temperature);
        System.out.println("Temperature set to " + temperature + "°C.");
    }

}
