public class Missing_Number_In_Array {
    public static void main(String[] args) {
        int arr []  = {1,2,3,8,4,5,6};


        Solution obj = new Solution();
        int x = obj.MissingNumber(arr,8);
        System.out.println(x);
    }
}





// User function Template for Java

class Solution {
    int MissingNumber(int array[] ,int n){
        // Your Code Here

        int sum = n*(n+1)/2;


        for(int i=0;i<array.length;i++)
        {
            sum-=array[i];
        }

        return sum;
    }
}
