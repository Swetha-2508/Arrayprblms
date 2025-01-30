import java.util.Scanner;
import java.util.Arrays;
class Arraysort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String arr[]=new String[a+1];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextLine();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
