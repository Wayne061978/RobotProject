/**
 * Robot_Class_Java_Lab-1-1.docx
 */


public class Robot {

    int batteryLevel = 100; // Battery level percentage (0 to 100)
    int speed = 0; // Current speed of the robot
    String name = "Juggernaut"; // Name of the robot
    String color = "blue";
    int weight = 2000;

    public void displayInfo(){
       System.out.println(weight+" lb");
        System.out.println("The color is " + color);
        System.out.println("Robot Name is " + name);

    }

    /**
     * Purpose: Simulates the robot moving forward.
     * Explanation: This method increases the speed field to simulate the robot
     * moving and prints a message.
     */
    public void move() {
        if (batteryLevel > 0) {
            if (speed < 100) {
                speed += 5;
                System.out.println(name + " is moving at speed " + speed + " mph.");

                // Decrease battery level by 1% for every 10 mph of speed
                if (speed % 10 == 0) {
                    batteryLevel -= 1;
                    System.out.println("Battery level decreased to " + batteryLevel + "%.");
                }
            } else {
                System.out.println(name + " is already at maximum speed of 50 mph.");
            }
        } else {
            System.out.println(name + " has insufficient battery to move.");
        }
    }



    /**
     * Purpose: Simulates the robot stopping.
     * Explanation: This method sets speed to 0 and prints a message indicating
     * the robot has stopped.
     */
    public void stop() {
        speed = 0;
        System.out.println(name + " has stopped.");
    }

    /**
     * Purpose: Increases the robot’s battery level to simulate charging.
     * Explanation: This method sets batteryLevel to 100 and prints a message
     * about the battery status.
     */
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println(name + "'s battery is fully charged.");
    }

    /**
     * Purpose: Displays the current battery level of the robot.
     * Explanation: This method prints the current batteryLevel of the robot
     */
    public void checkBatteryLevel() {
        System.out.println(name + "'s current battery level is " + batteryLevel + "%.");
    }


}
