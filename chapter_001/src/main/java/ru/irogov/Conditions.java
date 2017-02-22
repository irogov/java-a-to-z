
public class Conditions {

    public static void main(String[] args) {

        System.out.println(max(0,2));
        System.out.println(max(15,2,14));
    }

    public static int max(int a, int b)
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

    public static int max(int a, int b, int c)
    {
        int result = max(a, max(b, c));
        return result;
    }


}
