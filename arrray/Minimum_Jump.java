//Minimum number of jumps


//Expected Time Complexity: O(N)
//Expected Space Complexity: O(1)

        //N = 11
//        arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
//        Output: 3
//        Explanation:
//        First jump from 1st element to 2nd
//        element with value 3. Now, from here
//        we jump to 5th element with value 9,
//        and from here we will jump to the last.
////
//Given an array of N integers arr[] where each element represents the maximum length of the jump that can be made forward from that element. This means if arr[i] = x, then we can jump any distance y such that y ≤ x.
//        Find the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then you cannot move through that element.
//
//        Note: Return -1 if you can't reach the end of the array.




public class Minimum_Jump {
    public static void main(String[] args) {

        Solution1 obj = new Solution1();
      int x =  obj.minJumps(new int[]{1,3,5,6,9});

        System.out.println(x);
    }
}





class Solution1{
    static int minJumps(int[] arr){
        // your code here

        // your code here
        int ans = 0;
        int end = -1;
        int max = 0;

        for(int i=0;i<arr.length-1;i+=1){
            if(i>end){
                ans+=1;
                end = max;
            }
            max = Math.max(max,arr[i]+i);
            if(max>=arr.length-1){
                return ans;
            }
            if(max<=i)
                return -1;
        }
        return ans;
    }
}
