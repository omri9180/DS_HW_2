import java.util.ArrayList;

public class Main {
    public static <T> void main(String[] args) {

        MyDeque q1 = new MyDeque<>();
        MyDeque qr = new MyDeque<>();

        q1.add(95);
        q1.add(34);
        q1.add(14);
        q1.add(16);
        q1.add(25);
        q1.add(2);

//        MyDeque qSortted = new MyDeque<>();
//        qSortted.addToEnd(1);
//        qSortted.addToEnd(2);
//        qSortted.addToEnd(2);
//        qSortted.addToEnd(3);
//        qSortted.addToEnd(3);
//        qSortted.addToEnd(4);
//        qSortted.addToEnd(5);


        //----Reverse Dequeue-----
        System.out.println("Reverse before: \n" + q1 + "\n");

//        while (!q1.isEmpty()) {
//            qr.addToEnd(q1.getAndRemoveEnd());
//        }
//        System.out.println("Reverse after: \n" + qr + "\n");
//        //----End-----
//
//        //----Rearrangement-----
//        int mid = (int) Math.floor(qr.getCounter() / 2);
//        for (int i = 0; i < mid * 2; i++) {
//            if (i < mid) {
//                q1.addFirst(qr.getAndRemoveEnd());
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

        //----End-----

        //----Reverse list-----
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

        //----End-----
        //----circle list-----
//        Node<T> first = q1.getHeadNode();
//        Node<T> temp = first.getPrev();
//        if (temp == null) {
//            System.out.println("The given linked list is not a circular list");
//        } else if (temp.getNext() == first && first.getPrev() == temp) {
//            System.out.println("The given linked list is a circular list");
//
//        }


        //----End-----

        //----Same linkage-----

        //----End-----


    }

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
//        int piv = myDeque.getCounter() / 2;
//        MyDeque temp = new MyDeque();
//        for (int i = 0; i < myDeque.getCounter(); i++) {
//            temp.addFirst(myDeque.getAndRemoveEnd());
//        }
//        for (int i = 0; i < piv; i++) {
//            myDeque.addFirst(temp.getAndRemoveEnd());
//        }
//    }
//
//    public static void deleteDoubles(MyDeque q) {
//        MyDeque temp = new MyDeque();
//        temp.addToEnd(q.getAndRemoveHead());
//        int limit = q.getCounter();
//        for (int i = 0; i <= limit; i++) {
//            if (temp.getEnd() != q.getHead()) {
//                temp.addToEnd(q.getAndRemoveHead());
//            } else {
//                q.getAndRemoveHead();
//            }
//        }
//
//        limit = temp.getCounter();
//        q.getAndRemoveHead();
//        for (int i = 0; i < limit; i++) {
//            q.addToStart(temp.getAndRemoveHead());
//        }
//    }
}

