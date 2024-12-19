// leetCode 1283 
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int start=1;
        int end=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(nums[i]>end){
                end=nums[i]; // find largest element in nums
            }
        }

        int ans = -1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(isValidSpeed(nums, mid, threshold)){
                ans = mid;
                end = mid-1;
            }else{
                start  = mid+ 1;
            }
        }
        return ans;
    }
    public boolean isValidSpeed(int[] nums, int divisor, int threshold){
        int result = 0;
        for(int i=0; i<nums.length; i++){
            result += nums[i]/divisor;
            if(nums[i]%divisor != 0){
                result += 1;
            }
            if(result>threshold) return false;
        }
        return true;
    }
}