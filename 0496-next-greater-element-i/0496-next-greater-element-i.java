class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for(int i = 0; i<nums1.length; i++){
            result[i] = -1;
            boolean found = false;
            for(int j = 0; j<nums2.length; j++){
                if(nums2[j] == nums1[i]){
                    found = true;
                }
                // If the number is found, find the next greater element
                if(found && nums2[j] > nums1[i]){
                    result[i] = nums2[j];
                    break;
                }
            }
        }
        return result;
    }
}