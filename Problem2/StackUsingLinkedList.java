package Problem2;

public class StackUsingLinkedList {

    private ListNode top;
    private int size;

    public StackUsingLinkedList(){
        size =0;
    }

    public void push(Object item){
        ListNode pred = top;
        ListNode toAdd = new ListNode(item);
        toAdd.next = pred;
        top = toAdd;
        size++;
    }

    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        Object result = top.val;
        size--;
        top = top.next;
        return result;
    }

    public Object peek(){
        if(isEmpty()){
            return null;
        }
        return top.val;
    }

    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    public int size(){
        return size;
    }

    public class ListNode{
        Object val;
        ListNode next;
        ListNode(Object x){val = x;}
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push("GG");
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

    }

}
