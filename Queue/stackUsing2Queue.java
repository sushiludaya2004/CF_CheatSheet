//https://www.geeksforgeeks.org/problems/stack-using-two-queues/1?page=1&category=Queue&sortBy=submissions
class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	     q1.add(a);	
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    if(q1.size()==0){
        return -1;
        }
        
        while(q1.size()>=2){
            q2.add(q1.remove());
        }
        
        int popped = q1.remove();
        
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return popped;
    }
	
}
