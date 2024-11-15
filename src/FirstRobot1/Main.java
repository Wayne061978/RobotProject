package FirstRobot1;

public class Main {
    public static void main(String[] args) {
        Robot myRobot = new Robot(); // Create a new Robot object
        for (int i = 0; i < 15; i++)
            myRobot.move(); // Make the robot move
        myRobot.checkBatteryLevel(); // Check battery level
        myRobot.stop(); // Stop the robot
        myRobot.chargeBattery(); // Charge the robot's battery
        myRobot.displayInfo(); // robot’s name, color, and weight


    }public class SumSeries {
        public static void main(String[] args) {
            for (int i = 0; i < 7; i++) {
                System.out.println("Welcome to Java");
            }

        }
    }


}
