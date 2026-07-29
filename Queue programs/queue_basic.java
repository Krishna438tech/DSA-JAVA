// package Queue programs;
public class queue_basic {
    int front,rear,max;
    int[] a;
    queue_basic(int size){
        max=size;
        a=new int[max];
        front=rear=-1;
    }
    void enqueue(int ele){
        if(rear==max-1){
            System.out.println("queue is full");
            return;
        }
        if(front==-1){
            front=rear=0;
            a[rear]=ele;
            return;
        }
        rear++;
        a[rear]=ele;
    }
    void dequeue(){
        if(front==-1){
            System.out.println("queue is empty");
            return;
        }
        System.out.println("deleted element is "+a[front]);
        if(front==rear){
            front=rear=-1;
            return;
        }
        front++;
    }
    void frontPeek(){
        if(front==-1){
            System.out.println("queue is empty");
            return;
        }
        System.out.println("Front peek element is "+a[front]);
    }
    void rearPeek(){
        if(front==-1){
            System.out.println("queue is empty");
            return;
        }
        System.out.println("Rear peek element is "+a[rear]);
    }
    void display(){
       if(front==-1){
            System.out.println("queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++)
        System.out.print(a[i]+" ");
    System.out.println();
    }
    public static void main(String[] args) {
        queue_basic m1=new queue_basic(10);
		m1.dequeue();
		m1.enqueue(1);
		m1.enqueue(2);
		m1.enqueue(3);
        m1.enqueue(4);
		m1.display();
		m1.frontPeek();
		m1.rearPeek();
		m1.dequeue();
		m1.display();

    }
}
