package ru.irogov;

public class Pyramid {

    public void Pyramid(int height)
    {
        for (int i = 0; i <= height; i++)
        {
            for (int b = height - i; b > 0; b-- )
            {
                System.out.print(" ");
            }
            int c = 0;
            while(c < i)
            {
                System.out.print("^ ");
                c++;
            }
            System.out.println();
        }
    }
}