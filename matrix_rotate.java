import java.util.*;
class matrix_rotate
{
    public static void main (int m, int n)
    {
        int[][] a = new int [m][n];
        int i, j, x;
        i = j = 0;
        x = 1;

        while (i < m)      //Assigning random values, incrementing by 1
        {
            while (j < n)
            {
                a[i][j] = x;
                j++;
                x++;
            }
            j = 0;
            i++;
        }

        System.out.println ("Original matrix: ");
        for (i = 0; i < m; i++)
        {
            System.out.println (Arrays.toString (a[i]));
            System.out.println ();
        }

        int b[][] = new int [m][n];
        x = m - 1;
        
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            {
                 b[j][i] = a[x][j];
            }
            x--;
        }
        
        System.out.println ("Rotated matrix: ");
        for (i = 0; i < m; i++)
        {
            System.out.println (Arrays.toString (b[i]));
            System.out.println ();
        }
    }
}

class row
{   
    int[] row;
    row next;
    row prev;
}