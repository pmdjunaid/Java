package Arrays;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the elements: ");
        for(int i=0; i<len;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("You entered: ");
        for(int i=0; i<len;i++) {
            System.out.print(arr[i] +" ");
        }
        
    }
}
