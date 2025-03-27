package core;

import devices.EnergyMonitor;
import devices.Light;
import devices.Thermostat;
import interfaces.Device;
import pattern.composite.Room;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private List<Device> devices = new ArrayList<>(); // List of all devices

    // Add a device to the system
    public void addDevice(Device device) {
        devices.add(device);
    }

    // Turn on all lights in the system
    public void turnAllLightsOn() {
        System.out.println("Turning on all lights...");
        for (Device device : devices) {
            if (device instanceof Light) {
                device.turnOn();
            }
        }
    }



    // Turn off all lights in the system
    public void turnAllLightsOff() {
        System.out.println("Turning off all lights...");
        for (Device device : devices) {
            if (device instanceof Light) {
                device.turnOff();
            }
        }
    }

    // Set the temperature for all thermostats in the system
    public void setGlobalTemperature(int temp) {
        System.out.println("Setting global temperature to " + temp + "°C...");
        for (Device device : devices) {
            if (device instanceof Thermostat) {
                ((Thermostat) device).setTemperature(temp);
            }
        }
    }

    // Get the status of all devices in the system
    public String getSystemStatusReport() {
        StringBuilder report = new StringBuilder("System Status:\n");
        for (Device device : devices) {
            report.append(device.getStatus()).append("\n");
        }
        return report.toString();
    }


}