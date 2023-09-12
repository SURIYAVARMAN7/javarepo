package stack;

public class Queue {
	int SIZE=5;
	int items[]=new int[SIZE];
	int front,rear;
	Queue(){
		front=-1;
		rear=-1;
		}
	boolean isFull() {
		if (front==0 &&rear==SIZE-1) {
			return true;
		
		}
		return false;
	}
	boolean isEmpty() {
		if (front==-1)
			return true;
		else
			return false;
	}
	void enQueue(int element) {
		if (isFull()) {
			System.out.println("Queueis full");
		}else {
		 if (front==-1)
			 front=0;
		 rear++;
		 items[rear]=element;
		 System.out.println("inserted"+element);  
			 
		}
	}
	int deQueue(){
		int element;
		if (isEmpty()) {
			System.out.println("Queueos empty");
			return(-1);
			
		}
		else {
			element=items[front];
			if(front>=rear) {
				front=-1;
				rear=-1;
			}
			else {
				front++;
				
			}
			System.out.println("Deleted"+element);
			return(element);
			
		}
		
	}
	void display() {
		int i;
		if(isEmpty()) {
			System.out.println("Empty Queue");
			
		
		}
		else {
			System.out.println("\nFront index->"+front);
			System.out.println("items->");
			for(i=front;i<=rear;i++)
				System.out.println(items[i]+"");
			System.out.println("\nRear index->"+rear);
			
		}
	}
	public static void main(String[] args) {
		Queue q=new Queue();
		q.deQueue();
		q.enQueue(12);
		q.enQueue(23);
		q.enQueue(34);
		q.enQueue(45);
		q.enQueue(56);
		q.display();
		q.deQueue();
		q.display();
	}
	
	

}
