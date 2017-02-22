package ru.irogov;
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
