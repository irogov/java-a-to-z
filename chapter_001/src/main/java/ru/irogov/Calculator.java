public class Calculator {

    public double result;

    public static void main(String[] args) {

	
	
    }

    public void sum(double a, double b)
    {
        this.result = a + b;
    }
    public void substract(double a, double b)
    {
        this.result = a - b;
    }
    public void divide(double a, double b)
    {
        this.result = a/b;
    }
    public void multiply(double a, double b)
    {
        this.result = a * b;
    }
    public double getResult()
    {
        return result;
    }

}
