public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 5);
        MyPoint p2 = new MyPoint(4, 1);
        MyRectangle rect = new MyRectangle(p1, p2);

        System.out.println(rect);
        System.out.println("Width is: " + rect.getWidth());
        System.out.println("Height is: " + rect.getHeight());
        System.out.println("Area is: " + rect.getArea());
    }
}
