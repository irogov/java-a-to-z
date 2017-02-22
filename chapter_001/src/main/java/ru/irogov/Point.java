package ru.irogov;

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


