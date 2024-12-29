package J29_Java.Array.Practice;

import java.util.Scanner;

public class pairSum {
    static int pairSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;

        for(int i = 0; i<n; i++){   // first number
            for(int j = i+1; j<n; j++){   // second number
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum: ");
        int target = sc.nextInt();

        System.out.println(pairSum(arr, target));
    }
}