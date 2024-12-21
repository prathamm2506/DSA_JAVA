// public class StackLL {
//     static class Node {
//         int data;
//         Node next;
//         public Node(int data){
//             this.data = data;
//             next = null;
//         }
//     }

//     static class Stack{
//         public static Node head;
//         public static boolean isEmpty(){
//             return head == null;
//         }

//         public static void push(int data){
//             Node newNode = new Node(data);
//             if(isEmpty()){
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }

//         public static int pop(){
//             if(isEmpty()){
//                 System.out.println("Stack is Empty");
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Stack is Empty");
//             }
//             return head.data;
//         }
//     }
//     public static void main(String[] args) {
//         Stack s = new Stack();

//         s.push(0);
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


import java.util.*;

public class StackLL{
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(4, s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}