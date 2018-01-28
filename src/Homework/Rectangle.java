package Homework;

import static java.lang.Math.*;

public class Rectangle {

    private Point upperLeft;
    private Point lowerRight;

    public Rectangle(Point upperLeft, Point lowerRight) {
        this.upperLeft = upperLeft;
        this.lowerRight = lowerRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public Point getLowerRight() {
        return lowerRight;
    }

    public static double getSquare(Point upperLeft, Point lowerRight){
        int sideOfRectangle = abs(upperLeft.getX() - lowerRight.getX());
        double distanceBetweenPoints = upperLeft.distance(lowerRight);

        return sideOfRectangle * sqrt(pow(distanceBetweenPoints, 2) - pow(sideOfRectangle, 2));
    }

    public static double getDiagonal(Point upperLeft, Point lowerRight){

        return upperLeft.distance(lowerRight);
    }
}
