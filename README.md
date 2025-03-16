
# Smart Home Control System

The Smart Home Control System is a Java-based application designed to simulate the management of various smart home devices such as lights, thermostats, and energy monitors. The system allows users to add, remove, and control devices, as well as generate reports on energy consumption and system status.

---

## Features

1. Device Management:
    - Add and remove devices (lights, thermostats, energy monitors).
    - Turn on/off individual devices or groups of devices.

2. Global Control:
    - Turn on/off all lights in the system.
    - Set a global temperature for all thermostats.

3. Energy Monitoring:
    - Track energy consumption for devices.
    - Generate energy reports.

4. Scheduling:
    - Schedule devices to turn on/off at specific times using decorators.

5. Legacy Integration:
    - Integrate legacy systems (e.g., old door locks) using adapters.

6. User-Friendly Interface:
    - Command-line interface (CLI) for easy interaction.

---

## Design Patterns Used

The project implements the following design patterns:

1. Composite Pattern:
    - Manages groups of devices (e.g., rooms) as a single entity.
    - Example: A Room can contain multiple devices like lights and thermostats.

2. Decorator Pattern:
    - Adds additional functionality to devices dynamically.
    - Example: ScheduledDevice adds scheduling capabilities to lights.

3. Facade Pattern:
    - Provides a simplified interface to manage all devices.
    - Example: SmartHomeController allows users to control devices without knowing their internal details.

4. Adapter Pattern:
    - Integrates legacy systems into the modern smart home system.
    - Example: LegacyDoorLockAdapter allows an old door lock to work with the system.

5. Interface Pattern:
    - Ensures all devices follow a consistent structure and behavior.
    - Example: The Device interface defines common methods like turnOn(), turnOff(), and getStatus().

---

## How to Use

### Prerequisites
- Java Development Kit (JDK) installed.
- A terminal or command prompt to run the application.

### Running the Application
1. Clone the repository or download the source code.
2. Navigate to the project directory.
3. Compile the Java files:

   javac Main.java

4. Run the application:

   java Main

### Menu Options
When the application starts, you will see the following menu:

Welcome to the Smart Home Control System!

What would you like to do?
1. Add a device
2. Remove a device
3. Turn on all lights
4. Set temperature
5. View system status
6. View energy report
7. Turn off all lights
8. Exit
   Enter your choice (1-8):
- Add a Device: Add a new device (light, thermostat, or energy monitor).
- Remove a Device: Remove a device by its name.
- Turn On All Lights: Turn on all lights in the system.
- Set Temperature: Set the temperature for all thermostats.
- View System Status: Display the current status of all devices.
- View Energy Report: Generate and display an energy consumption report.
- Turn Off All Lights: Turn off all lights in the system.
- Exit: Exit the application.

---

## Example Usage

### Adding a Device
1. Select option 1 (Add a device).
2. Choose the device type:
    - 1 for Light.
    - 2 for Thermostat.
    - 3 for Energy Monitor.
3. Enter the device name (e.g., "Living Room Light").

### Turning On All Lights
1. Select option 3 (Turn on all lights).
2. All lights in the system will be turned on.

### Setting Temperature
1. Select option 4 (Set temperature).
2. Enter the desired temperature (e.g., 22).
3. All thermostats in the system will be set to the specified temperature.

### Viewing System Status
1. Select option 5 (View system status).
2. The current status of all devices will be displayed.



