package Loops;

public class SumRange {

    public int countRange(int start, int finish)
    {
        int result = 0;
        for (int i = start; i <= finish; i++)
        {
            result = result + i;
        }
        return result;
    }

}
