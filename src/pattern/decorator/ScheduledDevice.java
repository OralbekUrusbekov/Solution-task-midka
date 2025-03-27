package pattern.decorator;

import interfaces.Device;

// pattern.decorator.ScheduledDevice: A decorator that adds scheduling functionality to a device
class ScheduledDevice extends DeviceDecorator {
    private String schedule; // The time schedule for turning the device on/off

    public ScheduledDevice(Device device, String schedule) {
        super(device); // Call the constructor of the base decorator
        this.schedule = schedule;
    }

    @Override
    public void turnOn() {
        System.out.println("Scheduled turn on at: " + schedule);
        super.turnOn(); // Call the turnOn method of the wrapped device
    }

    @Override
    public void turnOff() {
        System.out.println("Scheduled turn off at: " + schedule);
        super.turnOff(); // Call the turnOff method of the wrapped device
    }
}