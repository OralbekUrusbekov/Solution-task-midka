import java.util.ArrayList;
import java.util.List;

// Home Controller: Manages all devices in the smart home system
class HomeController {
    private List<Device> devices = new ArrayList<>(); // List of devices

    // Add a device to the system
    public void addDevice(Device device) {
        devices.add(device);
    }

    // Turn on all lights in the system
    public void turnOnAllLights() {
        System.out.println("Turning on all lights...");
        for (Device device : devices) {
            if (device instanceof Light) {
                device.turnOn();
            }
        }
    }

    // Set the temperature for all thermostats in the system
    public void setTemperature(int temp) {
        System.out.println("Setting temperature to " + temp + "°C...");
        for (Device device : devices) {
            if (device instanceof Thermostat) {
                ((Thermostat) device).setTemperature(temp);
            }
        }
    }

    // Get the status of all devices in the system
    public String getStatus() {
        StringBuilder status = new StringBuilder("System Status:\n");
        for (Device device : devices) {
            status.append(device.getStatus()).append("\n");
        }
        return status.toString();
    }
}