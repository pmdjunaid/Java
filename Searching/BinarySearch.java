package Searching;
public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {2,3,4,5,6};
        int target = 5;

        int result = BinarySearchFinding(nums,target);
       
        if(result == -1)
        System.out.println("The element not found");
        else
        System.out.println("The element found at index : "+result);
    }
    public static int BinarySearchFinding(int [] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
           if(nums[mid] == target){
            return mid;
           }
           else if(nums[mid]<target){
            left = mid + 1;
           }
           else{
            right = mid - 1;
           }
        }
        return -1;
    }
}
