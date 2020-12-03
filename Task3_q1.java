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

        l1=l1.trim();

        String ar1[]=l1.split(" ");
        
        String A[][]=new String[n][m];
        int i=0;
        for(int x=0; x<n; x++)
        {
            for(int y=0; y<m; y++)            
                A[x][y]=ar1[i++];
        }

        int c=0;
        for(int x=0; x<=m-2; x++)
        {
            if(!A[n-1][x].equals("R"))
                c++;
            if(!A[x][m-1].equals("D"))
                c++;
        }
        System.out.println(c);
    }
}