package Numerical;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting the number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter starting the number : ");
        int num2 = sc.nextInt();
        System.out.println("Armstrong num beteween "+num1+" and "+num2+" are");
        for (int i = num1; i < num2; i++) {
            if (armstrong(i)) {
                System.out.print(i+" ");
            }
        }


        // int temp = num;
        // int digits=Integer.toString(temp).length();

        // while (temp!=0) {
        //     temp=temp/10;
        //     digits++;
        // }
        // System.out.println("Digits : "+digits);

        // int sum=0;
        // temp=num;
        // while (temp!=0) {
        //     int rem = temp%10;
        //     sum = sum+(int)(Math.pow(rem,digits));
        //     temp=temp/10;
        // }
        // System.out.println("Sum : "+sum);
        // if (armstrong(num)) {
        //     System.out.println("Armstrong");
        // }else{
        //     System.out.println("Not Armstrong");
        // }
        sc.close();
    }
    public static boolean armstrong(int num){
        int digits = Integer.toString(num).length();
        int sum=0;
        int temp=num;
        while (temp!=0) {
            int rem = temp%10;
            sum = sum+(int)(Math.pow(rem,digits));
            temp=temp/10;
        }
        return sum==num;
       
    }
}
