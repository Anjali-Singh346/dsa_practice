import java.util.HashMap;

public class Majority{

    static void  isMajority(int arr[]){
        int k=(arr.length)/2;
         HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (freq.get(num) > k) {
                System.out.println(arr[i]);
                return;
            }
         

        }
        System.out.println(-1);
        
    }
    // 2nd way
    static int findMajority(int arr[]) {
        int candidate = 0;
        int count = 0;
        // Step 1: Find candidate
        for (int i=0; i<arr.length;i++) {
            int num=arr[i];
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify (important)
        count = 0;
        for (int i=0; i<arr.length; i++) {
            int num=arr[i];
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
           return  candidate;
        } 
        return -1;
    }

    
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5,1};
       isMajority(arr);
       System.err.println(findMajority(arr));
       


       
    }
}