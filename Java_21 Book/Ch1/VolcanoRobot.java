class VolcanoRobot {
    String status = "";
    int speed = 0;
    float temperature = 0;

    VolcanoRobot(String currentStatus, int currentSpeed, float currentTemp) {
        status = currentStatus;
        speed = currentSpeed;
        temperature = currentTemp;
    }
    
    void checkTemperature() {
        if (temperature > 660) {
            status = "returning home";
            speed = 5;
        }
    }
    
    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }
}
