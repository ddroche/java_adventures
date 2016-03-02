class VolcanoApplication {
    public static void main(String[] arguments) {
        VolcanoRobot dante = new VolcanoRobot("exploring", 2, 510);
        // dante.status = "exploring";
        // dante.speed = 2;
        // dante.temperature = 510;
        
        VolcanoRobot virgil = new VolcanoRobot("exploring", 4, 467);
        // virgil.status = "exploring";
        // virgil.speed = 4;
        // virgil.temperature = 467;
        
        dante.showAttributes();
        System.out.println("Increasing speed to 3.");
        dante.speed = 3;
        dante.showAttributes();
        System.out.println("Changing temperature to 670.");
        dante.temperature = 670;
        dante.showAttributes();
        System.out.println("Checking the temperature.");
        dante.checkTemperature();
        dante.showAttributes();
        
        virgil.showAttributes();
        System.out.println("Decreasing speed to 3.");
        virgil.speed = 3;
        virgil.showAttributes();
        System.out.println("Changing temperature to 680.");
        virgil.temperature = 680;
        virgil.showAttributes();
        System.out.println("Checking the temperature.");
        virgil.checkTemperature();
        virgil.showAttributes();
    }
}