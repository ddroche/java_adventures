class HeightSampler {
    public static void main(String[] arguments) {
        HeightSample thing = new HeightSample();
        thing.height = 50;
        thing.width = 25;
        thing.depth = 10;
        
        System.out.println("Height: " + thing.height);
        System.out.println("Width: " + thing.width);
        System.out.println("Depth: " + thing.depth);
        System.out.println("Volume: " + thing.volume());
    }
}