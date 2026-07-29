// package Stack programs;

public class stack_basic {
    int[] a;
    int top,max;
    stack_basic(int size){
        max = size;
        a= new int[max];
        top = -1;
    }
    // PUSH
    void push(int ele){
        if(top == max - 1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        a[top] = ele;
    }
    // POP
    void pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Deleted element is " + a[top]);
        top--;
    }
    // PEEK
    void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Peek element is " + a[top]);
    }
    // DISPLAY
    void display(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i = top; i >= 0; i--){
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        stack_basic m1 = new stack_basic(10);
        m1.push(1);
        m1.push(2);
        m1.push(3);
        m1.display();
        System.out.println();
        m1.pop();
        m1.peek();
    }
}
