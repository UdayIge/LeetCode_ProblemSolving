class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int start=0;
        int end = n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            //looking for sorted part
            if(arr[start]<=arr[mid]){
                if(target<=arr[mid] && target>=arr[start]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target<=arr[end] && target>=arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
