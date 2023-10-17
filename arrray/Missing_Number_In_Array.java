//Missing number in array

//Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
//
//Example 1:
//
//Input:
//N = 5
//A[] = {1,2,3,5}
//Output: 4
//Example 2:
//



//Input:
//N = 10
//A[] = {6,1,2,8,3,4,7,10,5}
//Output: 9
//



//Your Task :
//You don't need to read input or print anything. Complete the function MissingNumber() that takes array and N as input  parameters and returns the value of the missing number.
//
//
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)



//public class
public class Missing_Number_In_Array {
    public static void main(String[] args) {
        int arr []  = {1,2,3,8,4,5,6};


        Solution obj = new Solution();
        int x = obj.MissingNumber(arr,8);
        System.out.println(x);
    }
}





//Solution class

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
