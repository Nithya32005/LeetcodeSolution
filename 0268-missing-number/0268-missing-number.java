class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sumofn=(n*(n+1))/2;
        int sumofNums=0;
        for(int i=0;i<nums.length;i++){
            sumofNums+=nums[i];
        }
        return sumofn-sumofNums;
        
    }
}
 