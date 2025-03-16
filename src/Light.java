// Light: Represents a light device
class Light implements Device {
    private String name; // Name of the light
    private boolean isOn; // Current state of the light (on/off)

    public Light(String name) {
        this.name = name;
        this.isOn = false; // Initially, the device is off
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " light turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " light turned off.");
    }

    @Override
    public String getStatus() {
        return name + " light: " + (isOn ? "on" : "off");
    }
}