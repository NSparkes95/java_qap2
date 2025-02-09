// Description: A line composed of two MyPoint instances.
// Author: Nicole Sparkes
// Date: Febuary 7, 2025

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    // Constructor
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getters and Setters
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Calculate the length of the line
    public double getLength() {
        return begin.distance(end);
    }

    @Override
    public String toString() {
        return "Line from " + begin + " to " + end;
    }
}