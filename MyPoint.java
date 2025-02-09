// Description: This class represents a point in 2D space with x and y coordinates.
// Author: Nicole Sparkes
// Date: Febuary 7, 2025

public class MyPoint {
    private int x;
    private int y;

    // Constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    // Calculate distance between two points
    public double distance(MyPoint another) {
        if (another == null) {
            throw new IllegalArgumentException("The point is null");
        }
        int xDiff = x - another.getX();
        int yDiff = y - another.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // String representation of the point
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}