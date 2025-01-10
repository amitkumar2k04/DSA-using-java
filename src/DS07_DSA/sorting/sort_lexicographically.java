package DS07_DSA.sorting;

public class sort_lexicographically {
    static void sortFruits(String[] fruits){
        int n = fruits.length;
        for(int i = 0; i<n-1; i++){
            int min_index = i;
            for(int j = i+1; j<n; j++){
                // comparison in string
                if(fruits[j].compareTo(fruits[min_index]) < 0){
                    // update
                    min_index = j;
                }
            }
            // swap fruits[min_index], fruits[i]
            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"};
        sortFruits(fruits);
        for(String val : fruits){
            System.out.println(val + " ");
        }
    }
}
