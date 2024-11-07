import java.util.Scanner;
public class Arraymerge
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in first array");
        int a=sc.nextInt();
        System.out.println("Enter number of elements in second array");
        int b=sc.nextInt();
        int c=a+b;
        int arr1[] = new int[a];
        int arr2[] = new int[b];
        int arr3[] = new int[c];
        System.out.println("Enter first array elements");
        for(int i=0;i<a;i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter second array elements");
        for(int i=0;i<b;i++)
        {
            arr2[i] = sc.nextInt();
        }
        for (int i= 0;i<a;i++)
        {
            arr3[i] = arr1[i];
        }
        for(int i=0;i<b;i++)
        {
            arr3[a+i]=arr2[i];
        }
        System.out.println("Merged array");
        for(int i=0;i<c;i++)
        {
            System.out.println(arr3[i]);
        }
    }
    
}
