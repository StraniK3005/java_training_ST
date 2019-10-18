package stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import stqa.pft.sandbox.task2.Point;

public class PointTests {

    @Test
    public void secondPointFurther() {
        Point p1 = new Point(5, 7);
        double distance = p1.distance(new Point(7, 11));
        Assert.assertEquals(distance, 4.47213595499958);
    }

    @Test
    public void firstPointFurther() {
        Point p1 = new Point(20, 25);
        double distance = p1.distance(new Point(4, 12));
        Assert.assertEquals(distance, 20.615528128088304);
    }

    @Test
    public void firstPoinNegative() {
        Point p1 = new Point(-30, -45);
        double distance = p1.distance(new Point(1, 2));
        Assert.assertEquals(distance, 56.302753041036986);
    }

    @Test
    public void secondPoinNegative() {
        Point p1 = new Point(20, 25);
        double distance = p1.distance(new Point(-2, -6));
        Assert.assertEquals(distance, 38.01315561749642);
    }

    @Test
    public void bothNegative() {
        Point p1 = new Point(-14, -17);
        double distance = p1.distance(new Point(-2, -6));
        Assert.assertEquals(distance, 16.278820596099706);
    }
}
