package devices;

// Energy-Saving Light: A light with adjustable brightness and auto-off feature
class EnergySavingLight extends Light {
    private int brightness; // Brightness level (0-100%)

    public EnergySavingLight(String name) {
        super(name);
        this.brightness = 100; // Default brightness is 100%
    }

    // Adjust the brightness of the light
    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println(getName() + " brightness set to " + brightness + "%");
    }

    // Automatically turn off the light if no one is in the room
    public void autoTurnOff() {
        turnOff();
        System.out.println(getName() + " automatically turned off (no one in the room)");
    }

    @Override
    public String getStatus() {
        return getName() + " light: " + (isOn() ? "on" : "off") + ", brightness " + brightness + "%";
    }
}