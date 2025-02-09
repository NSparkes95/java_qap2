// Description: This class creates a rectangle object with a top left and bottom right point.
// Author: Nicole Sparkes
// Feburary 9, 2025

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters and Setters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Calculate the area of the rectangle
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    public int getArea() {
        return getWidth() * getHeight();
    }

    @Override
    public String toString() {
        return "Rectangle with top left corner at " + topLeft + " and bottom right corner at " + bottomRight;
    }
}
