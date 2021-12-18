package zerobase._3w;

public class RandomLocation {
    private int x;
    private int y;

    public RandomLocation(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("random location : (" + this.x + "," + this.y + ")");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
