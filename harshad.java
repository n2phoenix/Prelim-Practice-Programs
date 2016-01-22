class harshad
{
    static void main (int x)
    {
       int d = 0; int xa = x;
       while (xa != 0)
       {
           d += xa % 10;
           xa /= 10;
       }
       
       if (x % d == 0)
       System.out.println ("Yeah.");
       else
       System.out.println ("Just... no.");
    }
}