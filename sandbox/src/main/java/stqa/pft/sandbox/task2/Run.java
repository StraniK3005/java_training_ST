package stqa.pft.sandbox.task2;

public class Run {

    public static void main(String[] args) {
        Point p1 = new Point(2, 12);
        Point p2 = new Point(8, 5);

        System.out.println("Distance is :" + distance(p1, p2));

        System.out.println("Distance is: " + p1.distance(p2));
    }


    private static double distance(Point p1, Point p2) {
        double value1 = Math.pow(p1.getX() - p2.getX(), 2);
        double value2 = Math.pow(p1.getY() - p2.getY(), 2);
        return Math.sqrt(value1 + value2);
    }

}
