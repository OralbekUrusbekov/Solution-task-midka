package pattern.adapter;

import interfaces.Device;

// Legacy Door Lock Adapter: Integrates the old door lock into the modern system
class LegacyDoorLockAdapter implements Device {
    private LegacyDoorLock legacyDoorLock; // The old door lock system

    public LegacyDoorLockAdapter(LegacyDoorLock legacyDoorLock) {
        this.legacyDoorLock = legacyDoorLock;
    }

    @Override
    public void turnOn() {
        legacyDoorLock.unlock(); // Unlock the door
    }

    @Override
    public void turnOff() {
        legacyDoorLock.lock(); // Lock the door
    }

    @Override
    public String getStatus() {
        return "Old door lock: " + (Math.random() > 0.5 ? "locked" : "unlocked");
    }
}