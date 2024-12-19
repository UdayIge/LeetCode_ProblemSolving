public class BinarySearch {
    
    //Simple binary Search
    public static int binarySearch(int arr[],int target,boolean reverse){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            } 
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    
    //returns index of first ocurance of target
    public static int firstOcurence(int arr[],int target){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                end = mid - 1;
            } 
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    
    //returns index of last ocurance of target
    public static int lastOcurence(int arr[],int target){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                start = mid + 1;
            } 
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,6,6,7,8,8,9};
        int res[] = new int[2];
        int first = firstOcurence(arr, 99);
        int last = lastOcurence(arr, 10);
        res[0] = first;
        res[1] = last;
        System.out.println("["+res[0]+","+res[1]+"]");
        System.out.println(res[0]+" "+res[1]);
        
        // if(res == -1){
        //     System.out.println("Element Not found");
        // }
        // else{
        //     System.out.println("Element "+arr[res]+" Found at index "+res);
        // }

    }
    
}
