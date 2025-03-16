import java.util.Scanner;
import java.util.Arrays;
class Arraylettersort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        String arr[]=new String[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.next();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
