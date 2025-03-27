package pattern.adapter;

// Legacy Door Lock: Represents an old door lock system
class LegacyDoorLock {
    public void lock() {
        System.out.println("Old door lock is locked.");
    }

    public void unlock() {
        System.out.println("Old door lock is unlocked.");
    }
}