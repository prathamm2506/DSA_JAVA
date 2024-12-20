// class SingleLinkedList {
//     Node head;
//     private int size;

//     SingleLinkedList() {
//         this.size = 0;
//     }

//     class Node{
//         String data;
//         Node next;
//         Node(String data){
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }

//     // add node at beg
//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     // add node at end
//     public void addLast(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }

//         Node currNode = head;
//         while(currNode.next != null){
//             currNode = currNode.next;
//         }

//         currNode.next = newNode;
//     }

//     // delete first
//     public void deleteFirst(){
//         if(head == null){
//             System.out.println("List is empty");
//             return;
//         }
//         size--;
//         head = head.next;
//     }

//     // delete last
//     public void deleteLast(){
//         if(head == null){
//             System.out.println("List is empty");
//             return;
//         }
//         size--;
//         if(head.next == null){
//             head = null;
//             return;
//         }

//         Node secondLast = head;
//         Node lastNode = head.next;

//         while(lastNode.next != null){
//             lastNode = lastNode.next;
//             secondLast = secondLast.next;
//         }

//         secondLast.next = null;
//     }

//     public int getSize(){
//         return size;
//     }

//     // print list
//     public  void printList(){
//         if(head == null){
//             System.out.println("List is empty");
//             return;
//         }
//         Node currNode = head;
//         while(currNode != null){
//             System.out.print(currNode.data + "->");
//             currNode = currNode.next;
//         }

//         System.out.println("NULL");
//     }

//     public static void main(String[] args) {
//         SingleLinkedList list = new SingleLinkedList();
//         list.addFirst("Linked");
//         list.addFirst("List");
//         list.printList();
//         list.addLast("List");
//         list.printList();
//         list.deleteFirst();
//         list.printList();
//         list.deleteLast();
//         list.printList();
//         System.out.println(list.getSize());
//     }
// }


import java.util.*;

class LL{
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("List");
        list.addFirst("Linked");
        System.out.println(list);

        list.addLast("List");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + "->");
        }
        System.out.print("null");
    }
}