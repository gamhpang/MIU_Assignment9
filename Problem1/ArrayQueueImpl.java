package Problem1;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    private int count;
    public int peek(){
        if(front == -1)
            return -1;
        return arr[front];
    }
    public void enqueue(int obj){
        if(rear==arr.length-1){
            resize();
        }
        if(count == arr.length)
            resize();
        arr[rear] = obj;
        if(front==-1){
            front = 0;
        }
        rear++;
        count ++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Q is empty");
            return -1;
        }
        int res = arr[front];
        front++;
        if(front == rear){
            front = -1;
            rear = 0;
        }
        count --;

        return res;
    }
    public boolean isEmpty(){
        if(count==0){
            return true;
        }
        return false;
    }

    public int size(){
        return count;
    }

    private void resize(){
        int len = arr.length;
        int newLen = 2 * len;
        int[] newArray = new int[newLen];
        System.arraycopy(arr,0,newArray,0,len);
        arr = newArray;
    }

}
