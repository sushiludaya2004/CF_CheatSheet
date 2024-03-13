//https://www.geeksforgeeks.org/problems/queue-reversal/1?page=1&category=Queue&sortBy=submissions
class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        // Stack<Integer> st = new Stack<>();
        // while (!q.isEmpty()) {
        //     st.push(q.remove());
        // }
        // while (!st.isEmpty()) {
        //     q.add(st.pop());
        // }

        // return q;
        
    }
    
    public void reverse(Queue<Integer> q) {
        if (q.isEmpty()) return; // Base case: if queue is empty, return
        int temp = q.poll(); // Remove the front element
        reverse(q); // Recursively reverse the remaining queue
        q.add(temp); // Add the removed element to the end
    }
    
    // Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q) {
        reverse(q);
        return q;
    }
    
    
    
    
}
