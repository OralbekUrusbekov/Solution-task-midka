// SmartDeviceDecorator: The base decorator class for adding functionality to devices
abstract class SmartDeviceDecorator implements Device {
    protected Device decoratedDevice; // The wrapped device

    public SmartDeviceDecorator(Device decoratedDevice) {
        this.decoratedDevice = decoratedDevice;
    }

    @Override
    public void turnOn() {
        decoratedDevice.turnOn(); // Delegate the turnOn operation to the wrapped device
    }

    @Override
    public void turnOff() {
        decoratedDevice.turnOff(); // Delegate the turnOff operation to the wrapped device
    }

    @Override
    public String getStatus() {
        return decoratedDevice.getStatus(); // Delegate the getStatus operation to the wrapped device
    }
}