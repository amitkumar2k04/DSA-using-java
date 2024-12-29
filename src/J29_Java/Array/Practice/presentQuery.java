package J29_Java.Array.Practice;

import java.util.Scanner;

public class presentQuery {
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];

        for(int i = 0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq ;
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

        int[] freq = makeFrequencyArray(arr);  // ye method jo bhi array ko paas kiya jaega ushka freq array bna dega

        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();

        // yaha ish loop me hum user se q times searched input le rahe hai
        while (q > 0){
            System.out.println("Enter number to be searched: ");
            int x = sc.nextInt();
            // aab hume batana hai ye x, freq arr me present hai ya nahi
            if(freq[x] > 0){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
            q--;
        }
    }
}
