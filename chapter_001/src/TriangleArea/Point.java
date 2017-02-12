package TriangleArea;

public class Point {    

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

public class Triangle {

    public Point x;
    public Point y;
    public Point z;

    public Triangle(Point x, Point y, Point z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double area()
    {
        double area = 0.;
        double sideA = Math.abs(this.x.distanceTo(this.y));
        double sideB = Math.abs(this.y.distanceTo(this.z));
        double sideC = Math.abs(this.z.distanceTo(this.x));
        double p = 0.5 * (sideA + sideB + sideC);
        if ((sideA + sideB) > sideC && (sideB + sideC) > sideA && (sideC + sideA) > sideB)
        {
            area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        }
        return area;
    }
}