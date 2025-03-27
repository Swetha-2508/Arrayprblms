import java.util.Scanner;
class Sumwithtarget {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int total = nums[i] + nums[j];
                if (total == target) {
                    return new int[]{i, j};  //return new int[]{nums[i], nums[j]}; Return the actual values
                }
            }
        }
        return null; 
    }
    public static void main(String[] args) {
        Sumwithtarget solution = new Sumwithtarget();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target=sc.nextInt();
        int[] result = solution.twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices of the two numbers that add up to " + target + ": [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two numbers add up to " + target);
        }
    }
}
