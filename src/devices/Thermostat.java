package devices;

import interfaces.Device;

// Thermostat: Represents a thermostat device
public class Thermostat implements Device {
    private String name; // Name of the thermostat
    private int temperature; // Current temperature

    public Thermostat(String name) {
        this.name = name;
        this.temperature = 20; // Default temperature
    }

    @Override
    public void turnOn() {
        System.out.println(name + " thermostat turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " thermostat turned off.");
    }

    @Override
    public String getStatus() {
        return name + " thermostat: " + temperature + "°C";
    }

    // Set the temperature
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(name + " thermostat temperature set to " + temperature + "°C.");
    }
}