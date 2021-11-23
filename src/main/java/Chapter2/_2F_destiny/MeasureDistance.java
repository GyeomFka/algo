package Chapter2._2F_destiny;

public class MeasureDistance {

    private Point2D[] stars;

    public MeasureDistance(Point2D[] stars) {
        this.stars = stars;
    }

    public Point2D[] getStars() {
        return stars;
    }

    public double getDistanceTo(Point2D base, Point2D target) {

        int horizontality = target.getX() - base.getX();
        int verticality = target.getY() - base.getY();

        //double distance = Math.sqrt((target.getX() - base.getX())^2 + (target.getY() - base.getY())^2);
        double distance = Math.sqrt(Math.pow(horizontality, 2) + Math.pow(verticality, 2));

        //return Math.sqrt(distance);
        return Math.round(distance * 1000) / 1000;
    }
}