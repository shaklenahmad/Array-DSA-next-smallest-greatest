import java.io.*;
import java.util.*;
class TUF2 {
    public static int[] nextGreaterElementsToLeft(int[] nums) {
        int n = nums.length;
        int nge[] = new int[n];
        Stack < Integer > st = new Stack <> ();
        for (int i =0; i <= n-1; i++) {           

            while (st.isEmpty() == false && st.peek() <= nums[i]) {
                st.pop();
            }
            
            
            if (st.isEmpty() == false) nge[i] = st.peek();
            else nge[i] = -1;
            
            st.push(nums[i]);            
        }
        return nge;
    }
    public static void main(String args[]) {
        int arr[]={5,7,1,2,6,0};

        int arr2[] = nextGreaterElementsToLeft(arr);
        System.out.println("The next greater elements to the left are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}