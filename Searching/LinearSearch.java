package Searching;
public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2,3,5,6,9};
        int target = 6;
        
        int result = LinerSearchFinding(nums,target);
        if(result == -1)
        System.out.println("The element not found");
        else
        System.out.println("The element found at index : "+result);
    }


    public static int LinerSearchFinding(int [] nums,int target){

        for(int i=0; i<nums.length;i++){
            if(nums[i] ==  target){
                return i;
            }
        }
        return -1;
    }

}



/* Without using static method

 public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2,3,5,6,9};
        int target = 6;
        Demo obj = new Demo();
        int result = obj.LinerSearchFinding(nums,target);
        if(result == -1)
        System.out.println("The element not found");
        else
        System.out.println("The element found at index : "+result);
    }
}  
class Demo{
    public int LinerSearchFinding(int [] nums,int target){

        for(int i=0; i<nums.length;i++){
            if(nums[i] ==  target){
                return i;
            }
        }
        return -1;
    }

}
 */