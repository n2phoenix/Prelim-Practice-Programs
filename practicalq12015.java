import java.util.*;
class practicalq12015
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter m: ");
        int m = Integer.parseInt (in.nextLine());
        System.out.println ("Enter n: ");
        int n = Integer.parseInt (in.nextLine());

        while (m < 100 || m > 10000)
        {
            System.out.println ("Enter correct value of m: ");
            m = Integer.parseInt (in.nextLine());
        }

        while (n > 100)
        {
            System.out.println ("Enter correct value of n: ");
            n = Integer.parseInt (in.nextLine());
        }

        for (int i = m + 1; i < 10000; i++)
        {
            int x = splitd (i);
            if (x == n)
            {
                System.out.println ("Required number: " + x);
                int xa = x; byte c = 0;
                while (xa != 0)
                {
                    xa /= 10; c++;
                }
                System.out.println ("Number of digits: " + c);
                c = 0;
            }
        }
    }

    static int splitd (int n)
    {
        int sum = 0;
        while (n != 0)
        {
            sum += (n % 10);
            n /= 10; 
        }
        return sum;
    }
}