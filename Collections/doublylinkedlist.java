import org.w3c.dom.Node;

public class doublylinkedlist{
    class node{
        int data;
        node prev;
        node next;
        public node(int data){
            this.data = data;
        }
    }
    public class Doublylinkedlist{
        private node head;
        private node tail;
         public void addFirst(int data) {
    node newNode = new node(data);
    if (isEmpty()) {
      head = tail = newNode;
    } else {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
  }

    }
    public static void main(String[] args) {
        

    }
}