public class stack_deleatation_addElement {

    int[] a;
    int top,max;
    // constructor
    stack_deleatation_addElement(int size){
        max=size;
        a = new int[max];
        top = -1;
    }
    void push(int ele) {
        if(top == max-1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        a[top] = ele;
    }
    void pop(){
        if(top == -1){
            System.out.println("stack underflow");
            return;
        }
        System.out.println("Deleted element is " + a[top]);
        top--;
    }
    void display() {
        if(top == -1){
            System.out.println("Stack Underflow");
            return;
        }
        for(int i = 0; i <= top; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    void search(int key){
        for(int i = 0; i <= top; i++){
            if(a[i] == key){
                System.out.println("Element "+key+" found at index "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
    // void deleteElement(int key){
    // stack_deleatation_addElement temp = new stack_deleatation_addElement(max);
    // while(top != -1){
    //     int val = a[top];
    //     pop();
    //     if(val != key){
    //         temp.push(val);
    //     }
    // }
    // while(temp.top != -1){
    //     push(temp.a[temp.top]);
    //     temp.top--;
    // }
    // System.out.println("Element " + key + " deleted");
    // }
    public static void main(String[] args) {
        stack_deleatation_addElement m1 = new stack_deleatation_addElement(5);
        m1.push(1);
        m1.push(2);
        m1.push(3);
        m1.push(4);
        m1.push(5);
        m1.display();
        m1.search(2);
        m1.search(6);
        //manual 3 elment delete b/c follow lifo then 4 ,5 ko dubra push and display
        m1.pop();
        m1.pop();
        m1.pop();
        m1.push(4);
        m1.push(5);
        m1.display();

        //use of another stack
        // m1.deleteElement(3);
        // m1.display();

    }
}
