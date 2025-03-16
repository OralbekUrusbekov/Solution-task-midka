// Adapter: Integrates an old system into the modern system
class DoorLockAdapter implements Device {
    private OldDoorLock oldLock; // The old door lock system
    private boolean bool;

    public DoorLockAdapter(OldDoorLock oldLock) {
        this.oldLock = oldLock;
    }

    @Override
    public void turnOn() {
        oldLock.unlock(); // Unlocks the old door lock
        bool = false;
    }

    @Override
    public void turnOff() {
        oldLock.lock(); // Locks the old door lock
        bool = true
    }

    @Override
    public String getStatus() {
        return "Old door lock: " + ( bool ? "locked" : "unlocked");
    }
}