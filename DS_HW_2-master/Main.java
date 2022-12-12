
public class Main {
    public static <T> void main(String[] args) {

        MyDeque q1 = new MyDeque<>();
        MyDeque qr = new MyDeque<>();

        q1.addToEnd(95);
        q1.addToEnd(34);
        q1.addToEnd(14);
        q1.addToEnd(16);
        q1.addToEnd(25);
        q1.addToEnd(2);

        MyDeque qSortted = new MyDeque<>();
        qSortted.addToEnd(1);
        qSortted.addToEnd(2);
        qSortted.addToEnd(2);
        qSortted.addToEnd(3);
        qSortted.addToEnd(3);
        qSortted.addToEnd(4);
        qSortted.addToEnd(5);

        // deleteDoubles(qSortted);
        qSortted.printMyDeque();

    }

    // ************ WORKS PERFECT ***************
    public static void reverse(MyDeque q) {
        MyDeque temp = new MyDeque();
        while (!q.isEmpty()) {
            temp.addToEnd(q.getAndRemoveEnd());
        }
        while (!temp.isEmpty()) {
            q.addToStart(temp.getAndRemoveHead());
        }
    }

    // ************ WORKS PERFECT ***************
    public static void rearrange(MyDeque q) {
        int size = q.getSize();
        for (int i = 0; i < size / 2; i++) {
            q.addToStart(q.getAndRemoveEnd());
        }
    }

    // ************ WORKS PERFECT ***************
    public static void deleteDoubles(MyDeque q) {
        MyDeque temp = new MyDeque();
        temp.addToStart(q.getAndRemoveHead());
        while (!q.isEmpty()) {
            if (temp.getEnd() != q.getHead()) {
                temp.addToEnd(q.getAndRemoveHead());
            } else {
                q.getAndRemoveHead();
            }
        }
        q.addToStart(temp.getAndRemoveHead());
        while (!temp.isEmpty()) {
            if (temp.getHead() != q.getEnd())
                q.addToEnd(temp.getAndRemoveHead());
            else temp.getAndRemoveHead();

        }
        q.addToEnd(temp.getAndRemoveHead());
    }

    public static void noStructureReverse(Node n) {
        if (n == null)
            throw new NullPointerException();
        if (n.next == null)
            return;
        Node temp;
        Node ptr = n;
        while (ptr.next != null) {
            temp = ptr.next;
            ptr.next = ptr.prev;
            ptr.prev = temp;

        }
    }

    public static boolean isCircle(Node n) {
        Node ptr = n.next;
        while (ptr != null && ptr != n) {
            ptr = ptr.getNext();
        }
        if (ptr == null)
            return false;
        return true;
    }

    public static Node portion(Node a, Node b) {
        Node n = new Node(null);
        Node ptr = n;
        while (a.next != null) {
            while (b.next != null) {
                if (a.getData() == b.getData())
                    ptr.data = a.data;
                while (a.next == b.data)
                    ptr.next = new Node(a.data);
                break;
            }
        }
        return n;
    }

//
//        //----Reverse Dequeue-----
//        System.out.println("Reverse before: \n" + q1 + "\n");
//
//        while (!q1.isEmpty()) {
//            qr.addToEnd(q1.getAndRemoveEnd());
//        }
//        System.out.println("Reverse after: \n" + qr + "\n");
//        //----End-----
//
//        //----Rearrangement-----
//        int mid = (int) Math.floor(qr.getSize() / 2);
//        for (int i = 0; i < mid * 2; i++) {
//            if (i < mid) {
//                q1.addToStart(qr.getAndRemoveEnd());
//            } else {
//                q1.addToEnd(qr.getAndRemoveHead());
//            }
//        }
//        System.out.println("Rearrange: \n" + q1 + "\n");
//        //----End-----
//
//        //----Delete Double-----
//        Node<T> headNode = qSortted.getHeadNode();
//        while (headNode != null) {
//            Node<T> temp = headNode;
//            while (temp != null && temp.getData().equals(headNode.getData())) {
//                temp = temp.getNext();
//            }
//            headNode.setNext(temp);
//            headNode = headNode.getNext();
//        }
//        qSortted.addToStart(headNode);
//        System.out.println("Duplicated remove: \n" + qSortted + "\n");
//
//        //----End-----
//
//        //----Reverse list-----
//        Node<T> revList = qSortted.getHeadNode();
//
//        while (revList.getNext()!=null){
//            revList = revList.getNext();
//        }
//        while (revList.getPrev()!=null){
//            revList.setNext(revList.getPrev());
//            revList.setPrev(revList.getNext().getPrev());
//        }
//        qSortted.addToStart(revList);
//
//        System.out.println(qSortted);
//
//        //----End-----
//        //----circle list-----
//        Node<T> first = q1.getHeadNode();
//        Node<T> temp = first.getPrev();
//        if (temp == null) {
//            System.out.println("The given linked list is not a circular list");
//        } else if (temp.getNext() == first && first.getPrev() == temp) {
//            System.out.println("The given linked list is a circular list");
//
//        }
//
//
//        //----End-----
//
//        //----Same linkage-----
//
//        //----End-----
//
//
//    }
//
//    public static void reverseLinkedList(Node head) {
//        if (head.getNext() == null)
//            return;
//        while (head != null) {
//            head.setPrev(head.getNext());
//            head = head.getNext();
//        }
//    }
//
//
//    public static void reverseMyDeque(MyDeque myDeque) {
//        MyDeque temp = new MyDeque();
//        while (!myDeque.isEmpty())
//            temp.addToStart(myDeque.getAndRemoveEnd());
//        while (!temp.isEmpty())
//            myDeque.addToStart(temp.getAndRemoveHead());
//    }
//
//    public static void rearrange(MyDeque myDeque) {
//        int piv = myDeque.getSize() / 2;
//        MyDeque temp = new MyDeque();
//        for (int i = 0; i < myDeque.getSize(); i++) {
//            temp.addToStart(myDeque.getAndRemoveEnd());
//        }
//        for (int i = 0; i < piv; i++) {
//            myDeque.addToStart(temp.getAndRemoveEnd());
//        }
//    }
//
//    public static void deleteDoubles(MyDeque q) {
//        MyDeque temp = new MyDeque();
//        temp.addToEnd(q.getAndRemoveHead());
//        int limit = q.getSize();
//        for (int i = 0; i <= limit; i++) {
//            if (temp.getEnd() != q.getHead()) {
//                temp.addToEnd(q.getAndRemoveHead());
//            } else {
//                q.getAndRemoveHead();
//            }
//        }
//
//        limit = temp.getSize();
//        q.getAndRemoveHead();
//        for (int i = 0; i < limit; i++) {
//            q.addToStart(temp.getAndRemoveHead());
//        }

}
