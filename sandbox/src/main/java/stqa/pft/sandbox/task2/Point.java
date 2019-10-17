package stqa.pft.sandbox.task2;

import static java.lang.Math.*;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point p1) {
        return sqrt(pow(p1.getX() - x, 2) + pow(p1.getY() - y, 2));
    }


}
