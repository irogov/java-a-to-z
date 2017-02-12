package Condition;

public class Conditions {    

    public int max(int a, int b)
    {
        int check = 0;

        if (a==b)
        {
            check = a;
        }
        else
            {
                check = a>b ? a : b;
            }
        return check;
    }

    public int max(int a, int b, int c)
    {
        int result = max(a, max(b, c));
        return result;
    }
}