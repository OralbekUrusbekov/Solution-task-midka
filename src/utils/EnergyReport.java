package utils;

import devices.EnergyMonitor;

import java.util.ArrayList;
import java.util.List;

// Energy Report: Generates a monthly energy consumption report
class EnergyReport {
    private List<EnergyMonitor> monitors = new ArrayList<>(); // List of energy monitors

    // Add a monitor to the list
    public void addMonitor(EnergyMonitor monitor) {
        monitors.add(monitor);
    }

    // Calculate the total monthly energy consumption
    public double calculateMonthlyConsumption() {
        double totalConsumption = 0;
        for (EnergyMonitor monitor : monitors) {
            totalConsumption += monitor.getEnergyConsumption();
        }
        return totalConsumption;
    }

    // Print the energy report
    public void printReport() {
        System.out.println("Monthly Energy Consumption Report:");
        for (EnergyMonitor monitor : monitors) {
            System.out.println("- " + monitor.getName() + ": " + monitor.getEnergyConsumption() + " W");
        }
        System.out.println("Total Consumption: " + calculateMonthlyConsumption() + " W");
    }
}