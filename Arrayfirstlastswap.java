import java.util.Scanner;
public class Arrayfirstlastswap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Array before swap: ");
        for(int i=0;i<n;i++) 
        {
            System.out.print(arr[i]+" ");
        }
        int temp=arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=temp;
        System.out.println("");
        System.out.print("Array after swap: ");
        for(int i=0;i<n;i++) 
        {
            System.out.print(arr[i]+" ");
        }
    }
}
