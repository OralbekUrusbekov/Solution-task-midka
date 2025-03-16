import java.util.ArrayList;
import java.util.List;

// Room: Represents a group of devices (Composite Pattern)
class Room implements Device {
    private String name; // Name of the room
    private List<Device> devices = new ArrayList<>(); // List of devices in the room

    public Room(String name) {
        this.name = name;
    }

    // Add a device to the room
    public void addDevice(Device device) {
        devices.add(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on all devices in " + name + "...");
        for (Device device : devices) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off all devices in " + name + "...");
        for (Device device : devices) {
            device.turnOff();
        }
    }

    @Override
    public String getStatus() {
        StringBuilder status = new StringBuilder(name + " room status:\n");
        for (Device device : devices) {
            status.append("- ").append(device.getStatus()).append("\n");
        }
        return status.toString();
    }
}