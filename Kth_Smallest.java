import java.util.*;
public class Kth_Smallest {
    static int kthSmallest(int arr[], int k){
         if(k <= 0 || k > arr.length) {
        return -1; 
    }
        Arrays.sort(arr);
        return arr[k-1];
         
    }
   
// 2nd way
   static int kthSmallest2(int arr[], int k){
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max heap
    for(int num : arr){
        pq.add(num);
        if(pq.size() > k){
            pq.poll();
        }
    }
    return pq.peek();
}
    public static void main(String[] args) {
        int arr[]={7, 10, 4, 3, 20, 15};
        int k=3;
        System.out.println(kthSmallest(arr,k));
        System.err.println(kthSmallest2(arr, k));
    }
}