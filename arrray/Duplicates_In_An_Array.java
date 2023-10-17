//Given an array a of size N which contains elements from 0 to N-1,
// you need to find all the elements occurring more than once in the given array. Return the answer in ascending order.
// If no such element is found, return list containing [-1].
//Note: The extra space is only for the array to be returned. Try and perform all operations within the provided array.

//Example 1:
//
//Input:
//N = 4
//a[] = {0,3,1,2}
//Output:
//-1
//Explanation:
//There is no repeating element in the array. Therefore output is -1.


//Example 2:
//
//Input:
//N = 5
//a[] = {2,3,1,2,3}
//Output:
//2 3
//Explanation:
//2 and 3 occur more than once in the given array.


//Expected Time Complexity: O(n).
//Expected Auxiliary Space: O(n).

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates_In_An_Array {
    public static void main(String[] args) {

        ArrayList<Integer> ak = new ArrayList<>();

        int arr[]  = {1,2,2,3,3,4,5};
        Solution2 obj = new Solution2();
       ak = obj.duplicate(arr, arr.length);

        for (int ele:ak
             ) {
            System.out.print(ele+" ");
        }

    }
}



class Solution2 {
    static   ArrayList<Integer> duplicate(int arr[], int n) {
        // code ()

        Arrays.sort(arr);
        ArrayList<Integer> ayu = new ArrayList<>();



        int sum = (n)*(n-1)/2;
        int tot=0;
        for(int ele: arr){
            tot+=ele;
        }

        if(sum == tot)
        {
            ayu.add(-1);
            return ayu;
        }



        int x = arr[0];
        int i=1;
        while(i<n)
        {
            if(arr[i] == x)
            {
                ayu.add(arr[i]);

            }
            x = arr[i];
            i++;

        }
        // remove sorted element

        ArrayList<Integer> ayu2 = new ArrayList<>();

        int pre = ayu.get(0);
        ayu2.add(pre);
        int k=1;
        while(k< ayu.size()){
            if(ayu.get(k)!= pre){
                ayu2.add(ayu.get(k));
            }

            pre = ayu.get(k);
            k++;
        }



        return ayu2;



    }
}
