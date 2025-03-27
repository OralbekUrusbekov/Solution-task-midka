package devices;

import interfaces.Device;

// Energy Monitor (Leaf Class)
public class EnergyMonitor implements Device {
    private String name; // Name of the energy monitor
    private double energyConsumption; // Energy consumption in watts

    public EnergyMonitor(String name) {
        this.name = name;
        this.energyConsumption = 0; // Initial energy consumption is 0
    }

    // Getter for energy consumption
    public double getEnergyConsumption() {
        return energyConsumption;
    }

    // Getter for the device name
    public String getName() {
        return name;
    }

    // Setter for energy consumption
    public void setEnergyConsumption(double energyConsumption) {
        this.energyConsumption = energyConsumption;
        if (energyConsumption > 1000) { // Alert condition
            System.out.println(name + ": High energy consumption (" + energyConsumption + " W)");
        }
    }

    @Override
    public void turnOn() {
        System.out.println(name + " monitor turned on");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " monitor turned off");
    }

    @Override
    public String getStatus() {
        return name + " monitor: " + energyConsumption + " W";
    }
}
