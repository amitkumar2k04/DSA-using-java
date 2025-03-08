package DS07_DSA.Recursion_Basics;

public class Find_Target_in_arr {
    static boolean searchInArr(int[] arr, int n, int target, int idx){
        // base case
        if(idx >= n) return false;
        // self work
        if(arr[idx] == target) return true;
        // recursive work
        return (searchInArr(arr, n, target, idx+1));
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};
        int target = 48;
        int n = arr.length;
        if(searchInArr(arr,n, target, 0)){      // Note: if condition ke andar after evaluate hokar true aaega - It return boolean
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
