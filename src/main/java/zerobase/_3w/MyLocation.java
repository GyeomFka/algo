package zerobase._3w;

public class MyLocation {
    private int x;
    private int y;

    public MyLocation(int x, int y) {
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
