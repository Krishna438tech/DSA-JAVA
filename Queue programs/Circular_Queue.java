public class Circular_Queue {
    int[] a;
    int front, rear, max;
    Circular_Queue(int size){
        max = size;
        a = new int[max];
        front = rear = -1;
    }
    void enQueue(int ele){
        if(front == (rear + 1) % max){
            System.out.println("queue is full");
            return;
        }
        if(front == -1){
            front = rear = 0;
        }else{
            rear = (rear + 1) % max;
        }
        a[rear] = ele;
    }

    void deQueue(){
        if(front == -1){
            System.out.println("queue is empty");
            return;
        }
        System.out.println("deleted element is " + a[front]);
        if(front == rear){
            front = rear = -1;
            return;
        }
        front = (front + 1) % max;
    }

    void frontPeek(){
        if(front == -1){
            System.out.println("queue is empty");
            return;
        }

        System.out.println("Front element is " + a[front]);
    }

    void rearPeek(){
        if(front == -1) {
            System.out.println("queue is empty");
            return;
        }

        System.out.println("Rear element is " + a[rear]);
    }

    void display(){
        if(front == -1){
            System.out.println("queue is empty");
            return;
        }
        int i = front;
        while(true){
            System.out.print(a[i] + " ");
            if(i == rear){
                break;
            }
            i = (i + 1) % max;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Circular_Queue m1 = new Circular_Queue(5);
        m1.display();
        m1.deQueue();

        m1.enQueue(1);
        m1.enQueue(2);
        m1.enQueue(3);
        m1.enQueue(4);
        m1.enQueue(5);

        m1.display();

        m1.enQueue(6);

        m1.deQueue();
        m1.display();

        m1.enQueue(6);
        m1.display();

        m1.deQueue();
        m1.deQueue();
        m1.deQueue();
        m1.deQueue();
        m1.display();

        m1.deQueue();
        m1.deQueue();
        m1.display();

    }
}
