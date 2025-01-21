import java.util.Scanner;
public class Arrayaddition {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int a[][]=new int[size][size];
        int b[][]=new int[size][size];
        int c[][]=new int[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
    }
}
