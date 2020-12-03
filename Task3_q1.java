import java.util.*;
class Luggage
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=Integer.parseInt(sc.nextLine());
        System.out.println("Enter value of m");
        int m=Integer.parseInt(sc.nextLine());
        System.out.println("Enter Elements for conveyers");
        String l1=sc.nextLine();
        String l2=sc.nextLine();
        String l3=sc.nextLine();

        l1=l1.trim();
        l2=l2.trim();
        l3=l3.trim();

        String ar1[]=l1.split(" ");
        String ar2[]=l2.split(" ");
        String ar3[]=l3.split(" ");

        
        String A[][]=new String[n][m];
        int x=0;
        for(int y=0; y<m; y++)
            A[x][y]=ar1[y];
        x++;

        for(int y=0; y<m; y++)
            A[x][y]=ar2[y];
        x++;

        for(int y=0; y<m; y++)
            A[x][y]=ar3[y];

        int c=0;
        for(x=0; x<=m-2; x++)
        {
            if(!A[n-1][x].equals("R"))
                c++;
            if(!A[x][m-1].equals("D"))
                c++;
        }
        System.out.println(c);
    }
}