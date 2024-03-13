//https://www.geeksforgeeks.org/problems/implement-queue-using-array/1?page=1&category=Queue&sortBy=submissions
class MyQueue {

    int front, rear,cnt;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
		
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    //if(cnt == arr.length) return -1;
	    arr[rear++] = x;

    }
    

    //Function to pop an element from queue and return that element.
	int pop()
	{
	    if(rear == 0 || front == rear) return -1;
	    int val = arr[front % arr.length];
	    front++;
	    
	    return val;
		
	} 
}
