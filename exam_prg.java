import java.io.*;
class exam_prg
{
    public static void main()throws IOException
    {
        DataInputStream in = new DataInputStream(System.in);
        int i,j,flag=0,ans1=0,ans2=0;
        String X,Y;
        System.out.println("Enter values of X and Y");
        X = in.readLine();
        Y = in.readLine();
        int m1,m2,max1,max2;

        m1 = findmax(X);
        m2 = findmax(Y);
        max1=m1;
        max2=m2;

        int Arr1[] = new int[20-max1];
        int Arr2[] = new int[20-max2];

        for(i = 0;i<Arr1.length;i++)
        {
            Arr1[i] = getbase(X,max1);
            max1++;
        }

        for(i = 0;i<Arr2.length;i++)
        {
            Arr2[i] = getbase(Y,max2);
            max2++;
        }

        for(i = 0;i<Arr1.length;i++)
        { 
            for(j = 0;j<Arr2.length;j++)
            {
                if(Arr1[i] ==Arr2[j])
                {
                    ans1 = m1+i;
                    ans2 = m2+j;
                    flag = 1;
                    break;
                }
            }
            if(flag==1)
                break;  /** to break out of the outer loop */
        }

        if(flag==0)
            System.out.println("not equal in any bases");
        else
            System.out.println("o/p bases " + ans1 + " and " + ans2);
    }//main

    public static int findmax(String val)
    {/** assumming user enters digits 0-9 and alphabets A to j only */
        char ch=' ', ch1=' ';
        int d=0,d1=0;
        for(int i = val.length()-1;i>=0;i--)
        {
            ch = val.charAt(i);
            if(Character.isDigit(ch)==false)
            {
                if(ch>ch1)   
                    ch1=ch;
            }
            else
            {
                d=ch-48;
                if(d>d1)
                    d1=d;
            }     

        }
        if (ch1==' ')
            return ++d1;  // there are no alphabets
        else
            return (74-ch)+1;
    }

    public static int getbase(String val,int n)
    {
        int c = 0,sum = 0;
        char ch; int v2;
        for(int i = val.length()-1;i>=0;i--)
        {
            ch = val.charAt(i);
            if(Character.isDigit(ch)==false)
                v2 = ch -55;
            else
                v2 = ch-48;
            
            sum = sum+( v2* (int)Math.pow(n,c));
            c++;
        }
        return sum;

    }

}
