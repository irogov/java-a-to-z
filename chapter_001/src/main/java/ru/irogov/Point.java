/**
 * Created by User on 12.02.2017.
 */
public class Point {

    public static void main(String[] args) {

        Point first = new Point(2, 4);
        Point second = new Point(7, 8);
        Point third = new Point(14,9);
        Triangle triangle = new Triangle(first, second, third);
        System.out.println(triangle.area());

    }


    public double a;
    public double b;

    public Point(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public double distanceTo(Point point)
    {
        double distance = Math.sqrt(Math.pow(point.a - this.a, 2)+Math.pow(point.b - this.b, 2));
        return distance;
    }



}


