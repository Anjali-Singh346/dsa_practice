import java.util.*;
public class LongestSum {
 static int kthSum(int arr[],int k){
    int len=0;
    for(int i=0; i<arr.length; i++){
        int sum=0;
        for (int j=i; j<arr.length; j++){
             sum+=arr[j];
            if(sum==k){
                len=Math.max(len, j-i+1);
            }   
        }
    }
    return  len;
 }
 // Optimized way
 static int kthSum2(int arr[],int k){
    int len=0;
    int sum=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0; i<arr.length; i++){
             sum+=arr[i];
            if(sum==k){
                len=Math.max(len, i+1);
            }
             if (!map.containsKey(sum)) {
            map.put(sum, i);
        }
            if(map.containsKey(sum-k)){
                len=Math.max(len, (i-map.get(sum-k)));
                
            } 
        }
    return  len;
 }


 public static void main(String[] args) {
     int arr[]={1,2,3,2,1,1,1};
     int k=5;
     System.err.println(kthSum(arr, k));
     System.out.println(kthSum2(arr, k));
 }
    
}