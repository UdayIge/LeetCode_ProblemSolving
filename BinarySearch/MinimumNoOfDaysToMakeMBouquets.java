// 1482 
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(m*k > n) return -1;
        int start = 1; // min days can be 1
        int end = Integer.MIN_VALUE; 
        for(int i=0; i<n; i++){
            if(end<bloomDay[i]){
                end = bloomDay[i]; // max 
            }
        }
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isValidDays(bloomDay, mid, m, k)){
                ans = mid;
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return ans;

    }
    public boolean isValidDays(int[] bloomDay, int minDays, int b, int flowers){
        int count = 0;
        int adjFlowers = 0;
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i]<=minDays){
                adjFlowers++;
            }
            else{
                adjFlowers = 0; // always check for adjecent flowers
            }
            if(adjFlowers == flowers){
                count++;
                adjFlowers = 0;
            }
            if(count >= b) return true;
        }
        return false;
    }
}