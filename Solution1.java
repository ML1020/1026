//给定一个整数数组 nums 和一个目标值 target，
// 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
public class Solution1 {
    public static int[]  twoSum(int[] nums, int target) {
        int[] arr = new int[10];
        for (int i = 0; i < nums.length;i++){
            for (int j = nums.length - 1;j > i ; j--) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    System.out.println("["+ i+","+j+"]");
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 18;
        twoSum(nums,target);
    }
}
