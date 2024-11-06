import java.util.Scanner;
public class arrayreverse {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array elements");
        int size=sc.nextInt();
        System.out.println("Enter array elements");
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Elements in reverse order");
        for(int i=size-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}
