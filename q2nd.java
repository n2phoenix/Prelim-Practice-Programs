import java.util.*;
class q2nd
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter x: ");
        String xa = in.nextLine();
        System.out.println ("Enter y: ");
        String ya = in.nextLine();
        int x = 0;
        int y = 0;

        String hex[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        for (int i = 0; i < xa.length(); i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if (xa.charAt (i) == hex [j].charAt(0))
                {
                    String temp = xa.substring (0, i) + (j + 10) + xa.substring (i + 1);
                    xa = temp;
                }
            }
        }

        for (int i = 0; i < ya.length(); i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if (ya.charAt (i) == hex [j].charAt(0))
                {
                    String temp = ya.substring (0, i) + (j + 10) + ya.substring (i + 1);
                    System.out.println (temp);
                    ya = temp;
                }
            }
        }

        x = Integer.parseInt (xa);
        y = Integer.parseInt (ya);
        boolean c = false;
        
        for (int i = 1; i <= 20; i++)
        {
            for (int j = 1; j <= 20; j++)
            {
                if (base_change (x, i) == base_change (y, j))
                {
                System.out.println ("Output bases: " + i + ", " + j);
                c = true;
                }
            }
        }
        
        if (!c)
        System.out.println ("Can't find that bass tho");
    }

    static int base_change (int c, int b2)
    {
        int ca = c; ; int sum = 0; int i = 0;
        while (ca != 0)
        {
            sum += (ca % 10) * Math.pow (b2, i);
            ca /= 10;
            i++;
        }

        return sum;
    }
}