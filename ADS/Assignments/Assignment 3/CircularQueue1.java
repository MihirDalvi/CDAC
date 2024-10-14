
class Queue {
    int size = 5;
    int cq [] = new int[size];
    int front, rear;

    Queue (){
        front =-1;
        rear = -1;

    }
    boolean  isEmpty (){
        return (front == -1);

    }
    boolean isFull(){
        return ((rear + 1) % size == front);
    }

    void enqueue (int ele){
        if (isFull()) {
            System.out.println("queue is full");
            return;
        }
        else{

            if (front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;  // Move rear circularly
            cq[rear] = ele;
        }
    }

    int dequeue (){
        if(isEmpty())
        {
            System.out.println("queue is empty");
            return -1;
        }
        else
        {

            int deletedEle = cq[front];
            if (front == rear)
                {
                    front = -1;
                    rear = -1;
                }
            else
                {
                    front = (front+1) % size; //f++
                }
                return deletedEle;
        }
        
        }
        

    }


public class CircularQueue1 {
    public static void main(String [] args)
    {
        Queue q1 = new Queue();
        System.out.println(q1.isEmpty());
        System.out.println(q1.isFull());

        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        q1.enqueue(6);

        System.out.println("deleted ele : "+q1.dequeue());
        System.out.println("deleted ele : "+q1.dequeue());
        System.out.println("deleted ele : "+q1.dequeue());
        q1.enqueue(6);
        q1.enqueue(7);
        q1.enqueue(8);
        q1.enqueue(9);

        System.out.println("deleted ele : "+q1.dequeue());
        System.out.println("deleted ele : "+q1.dequeue());
        System.out.println("deleted ele : "+q1.dequeue());
        System.out.println("deleted ele : "+q1.dequeue());
        System.out.println("deleted ele : "+q1.dequeue());
        System.out.println("deleted ele : "+q1.dequeue());
    }
}
