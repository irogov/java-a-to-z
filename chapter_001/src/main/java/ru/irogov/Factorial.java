package ru.irogov;

public class Factorial {   

    public int factorial(int a)
    {
        int fact = 1;
        for (int i = a; i > 0; i--)
        {
            fact = fact * i;
        }
        return fact;
    }
}