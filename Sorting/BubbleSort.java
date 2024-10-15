package Sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int[] nums = { 8, 3, 2, 9, 7, 1, 5 };
        // int size = nums.length;
        int temp;
        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[i] > nums[j + 1]) {
                    temp = nums[i];
                    nums[i] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }
        }

        System.out.println("");
        System.out.println("After Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}


/* Main Logic for BubbleSort
 

    for(int i=0; i<nums.length;i++){
        for(int j=0;j<nums.length-1;j++){   
            if(nums[i]>nums[j+1]){
                temp = nums[i];
                nums[i] = nums[j+1];
                nums[j+1]= temp;

            }
        }
    }

 */