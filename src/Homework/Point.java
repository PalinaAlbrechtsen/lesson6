package Homework;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public double distance(Point object) {

        return sqrt(pow((object.x - this.x), 2) + pow((object.y - this.y), 2));
    }
}
