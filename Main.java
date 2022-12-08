
public class Main {
    public static void reverseLinkedList(Node head) {
        if(head.getNext() == null)
            return;
        while(head != null){
            head.setPrev(head.getNext());
            head = head.getNext();
        }
    }


    public static void reverseMyDeque(MyDeque myDeque) {
        MyDeque temp = new MyDeque();
        while (!myDeque.isEmpty())
            temp.addToStart(myDeque.getAndRemoveEnd());
        while (!temp.isEmpty())
            myDeque.addToStart(temp.getAndRemoveHead());
    }

    public static void rearrange(MyDeque myDeque) {
        int piv = myDeque.getCounter() / 2;
        MyDeque temp = new MyDeque();
        for (int i = 0; i < myDeque.getCounter(); i++) {
            temp.addFirst(myDeque.getAndRemoveEnd());
        }
        for (int i = 0; i < piv; i++) {
            myDeque.addFirst(temp.getAndRemoveEnd());
        }
    }

    public static void main(String[] args) {
//        MyDeque q1 = new MyDeque();//first Deque
//        q1.addToEnd(8);
//        q1.addToEnd(8);
//        q1.addToEnd(8);
//        q1.addToEnd(5);
//        q1.addToEnd(3);
//        deleteDoubles(q1);
        Node n1 = new Node(0);
        n1.setNext(new Node(1));
        n1.getNext().setNext(new Node(2));
        n1.getNext().getNext().setNext(new Node(3));
        reverseLinkedList(n1);
        Node ptr = n1;
        while(ptr != null){
            System.out.println(ptr.getData());
            ptr = ptr.getNext();
        }
        //q1.printMyDeque();
    }

    public static void deleteDoubles(MyDeque q) {
        MyDeque temp = new MyDeque();
        temp.addToEnd(q.getAndRemoveHead());
        int limit = q.getCounter();
        for (int i = 0; i <= limit; i++) {
            if (temp.getEnd() != q.getHead()) {
                temp.addToEnd(q.getAndRemoveHead());
            } else {
                q.getAndRemoveHead();
            }
        }

        limit = temp.getCounter();
        q.getAndRemoveHead();
        for (int i = 0; i < limit; i++) {
            q.addToStart(temp.getAndRemoveHead());
        }
    }
}

