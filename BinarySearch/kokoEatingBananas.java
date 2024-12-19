// leetcode 875 
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int start=1;
        int end=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(piles[i]>end){
                end=piles[i];
            }
        }

        int ans = -1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(isValidSpeed(piles, mid, h)){
                ans = mid;
                end = mid-1;
            }else{
                start  = mid + 1;
            }
        }
        return ans;
    }
    public boolean isValidSpeed(int[] piles, int speed, int hours){
        int minHours = 0;
        for(int i=0; i<piles.length; i++){
            minHours += piles[i]/speed;
            if(piles[i]%speed != 0){
                minHours += 1;
            }
            if(minHours>hours) return false;
        }
        return true;
    }
}
