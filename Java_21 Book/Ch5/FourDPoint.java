import java.awt.Point;

class FourDPoint extends Point {
    int z;
    int a;


    FourDPoint(int x, int y, int z, int a) {
        super(x,y);
        this.z = z;
        this.a = a;
    }

    public static void main(String[] arguments) {
        FourDPoint fd = new FourDPoint(1,2,3,4);
        System.out.println("My new point is (x,y,z,a): ");
        System.out.println("\n x: " + fd.x);
        System.out.println("\n y: " + fd.y);
        System.out.println("\n z: " + fd.z);
        System.out.println("\n a: " + fd.a);
    }
}