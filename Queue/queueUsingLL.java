//https://www.geeksforgeeks.org/problems/implement-queue-using-linked-list/1?page=1&category=Queue&sortBy=submissions
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        QueueNode que =new QueueNode(a);
        if(rear==null){
            front= que;
            rear= que;
        }
        rear.next=que;
        rear=que;
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        if(front==null){
            return -1;
        }
        if(front==rear){
            int data=front.data;
            front=rear=null;
            return data;
        }
        int data=front.data;
        front=front.next;
        return data;
	}
}
