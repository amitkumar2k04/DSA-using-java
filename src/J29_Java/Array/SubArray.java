package J29_Java.Array;

public class SubArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};
        int tartget = 12;
        //1 = 1
        //1 2 = 3
        //1 2 3 = 6
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            for(int j = i; j<arr.length; j++){
                sum += arr[j];
                if(sum == tartget) ans++;
            }
        }
        System.out.println(ans);

    }
}
