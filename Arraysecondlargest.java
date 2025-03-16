import java.util.*;
public class arraysecondlargest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int max=0;
        int arr[]= new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int secondlargest=arr[0];
        int largest=arr[1];
        for(int i=0;i<size;i++)
        {
            if(max<arr[i])
            {
                secondlargest=max;
                max=arr[i];
            }
        }
        System.out.println("Second largest: "+secondlargest);
    }  
}
