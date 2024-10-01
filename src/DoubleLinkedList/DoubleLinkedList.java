package DoubleLinkedList;

public class DoubleLinkedList {
   private Node first;
   private Node last;
    private int size;
   public DoubleLinkedList() {
       first = null;
       last = null;
       size = 0;
   }

   public int getSize() {
       return size;
   }

   public boolean isEmpty() {
       return first == null;
   }

   public void InsertFrist(int value){
       Node newNode = new Node(value);
       if(isEmpty()){
           first = last = newNode;
           newNode.next = null;
           newNode.prev = null;

       }else{
           newNode.next = first;
           first.prev = newNode;
           first = newNode;
           newNode.prev = null;
       }

       size++;

   }

   public void InsertLast(int value){
       Node newNode = new Node(value);
       if(isEmpty()){
           first = last =newNode;
           newNode.prev = null;
           newNode.next = null;
       }else{
           newNode.prev = last;
           last.next = newNode;
           last = newNode;
           newNode.next = null;
       }

       size++;
   }

   public void DeleteFrist(){
       if(first == null){
           return ;
       }
       if(first == last){
           first = last =null;
       }
       else{
           first = first.next;
           first.prev = null;
       }
           size--;
   }

   public void DelelteLast(){
       if(last == null){
           return;
       }
       if(last == first){
           first = last = null;
       }
       else{
           last = last.prev;
           last.next = null;
           size--;
       }
   }

   public void DisplayForward(){
        Node current = first;
        if(current == null){
            System.out.println("List is empty");
            return;
        }
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
   }

   public void DisplayBackward(){
       Node current = last;
       if(current == null){
           System.out.println("List is empty");
           return;
       }
       while(current != null){
           System.out.print(current.data + " ");
           current = current.prev;
       }
   }

   public boolean SearchFirst(int searchValue){
       Node current = first;
       while(current != null ){
           if(current.data == searchValue){
               return true;
           }else{
               current = current.next;
           }
       }
       return false;
   }

    public boolean SearchLast(int searchValue){
        Node current = last;
        while(current.data != searchValue ){
                current = current.prev;
                if(current == null){
                    return false;
                }
        }
        return true;
    }

    public void InsertAfter(int value, int searchValue){
       Node current = first;
       Node newNode = new Node(value);
       while(current.data != searchValue){
           current = current.next;
           if(current == null){
               return;
           }
       }
       if(current == last){
           last = newNode;
       }
       else{
           newNode.next = current.next;
           current.next.prev = newNode;
       }
        newNode.prev = current;
       current.next = newNode;
       size++;

    }
   public static void main(String[] args) {
       DoubleLinkedList list = new DoubleLinkedList();
       list.InsertFrist(1);
       list.InsertFrist(2);
       list.InsertLast(3);
       list.InsertLast(5);
       list.DisplayBackward();
       System.out.println(" ");
       list.DisplayForward();
       System.out.println(" ");
       System.out.println(list.SearchFirst(5));
       System.out.println(list.SearchLast(3));
       list.InsertAfter(4,3);
       System.out.println(" ");
       list.DisplayForward();
   }

}
