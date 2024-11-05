import java.util.Scanner;
class minarray
{
  static void min(int arr[])
  {  
    int min=arr[0];  
    for(int i=1;i<arr.length;i++)  
    if(min>arr[i])  
    min=arr[i];  
    System.out.println(min);  
  }
  public static void main(String args[])
  {
    int arr[]=new int[10];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array elements");
    for (int i = 0; i < 10; i++) {
      arr[i]=sc.nextInt();
    }
    min(arr);
  }  
}
