public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        MyLine l1 = new MyLine(p1, p2);
        System.out.println(l1);
        System.out.println("Length is: " + l1.getLength());
        l1.setBegin(p2);
        l1.setEnd(p1);
        System.out.println(l1);
        System.out.println("Length is: " + l1.getLength());
    }
}