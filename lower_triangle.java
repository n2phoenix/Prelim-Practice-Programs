import java.util.*;
class lower_triangle
{
    static void main (int m, int n)
    {
        Scanner in = new Scanner (System.in);
        int a[][] = new int [m][n];
        int i, j, x;
        i = j = 0;
        x = 1;

        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            {
                System.out.println ("Enter element at " + i + ", " + j + ":");
                a[i][j] = Integer.parseInt (in.nextLine());
            }
        }
        
        boolean c = true;
        
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            {
                if (j == i + 2 && a[i][j] != 0)
                c = false;
            }
        }
        
        for (i = 0; i < m; i++)
            System.out.println (Arrays.toString (a[i]));
        
        if (c)
        System.out.println ("Yep, it's a triangle.");
        else
        System.out.println ("Lol nah.");
    }
}