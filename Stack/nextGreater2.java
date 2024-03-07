//https://leetcode.com/problems/next-greater-element-ii/submissions/1196689344/
class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int nge[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i % n]) {
                st.pop();
            }
            if (i < n) {
                if (!st.isEmpty()) {
                    nge[i] = arr[st.peek()];
                } else {
                    nge[i] = -1;
                }
            }
            st.push(i % n);
        }
        return nge;
    }
}
 
