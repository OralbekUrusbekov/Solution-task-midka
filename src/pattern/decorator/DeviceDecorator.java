package pattern.decorator;

import interfaces.Device;

// Base Decorator Class
abstract class DeviceDecorator implements Device {
    protected Device device; // The decorated device

    public DeviceDecorator(Device device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        device.turnOn(); // Delegates the turnOn operation to the wrapped device
    }

    @Override
    public void turnOff() {
        device.turnOff(); // Delegates the turnOff operation to the wrapped device
    }

    @Override
    public String getStatus() {
        return device.getStatus(); // Delegates the getStatus operation to the wrapped device
    }
}