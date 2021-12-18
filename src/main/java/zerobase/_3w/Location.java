package zerobase._3w;

public class Location {

    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("my location : (" + this.x + "," + this.y + ")");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
