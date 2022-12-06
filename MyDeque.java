public class MyDeque<T> {

    private Node<T> head = new Node<>(null);

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public T getHead() {
        if (isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        return this.head.getData();
    }

    public T getEnd() {
        if (isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        Node<T> returnData = head;
        while (returnData.getNext() != null) {
            returnData = returnData.getNext();
        }

        return returnData.getData();
    }


    public T getAndRemoveHead() {
        if (isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        Node<T> returnData = head;
        Node<T> newHead = head.getNext();

        head = newHead;
        newHead.setPrev(null);

        return returnData.getData();
    }


    public T getAndRemoveEnd() {
        Node<T> returnData;
        if (isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        } else {
            returnData = head;
            Node<T> newEnd;
            while (returnData.getNext() != null) {
                returnData = returnData.getNext();
            }
            newEnd = returnData.getPrev();
            newEnd.setNext(null);

        }
        return returnData.getData();
    }

    public void addToStart(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.getPrev() != null) {
                temp = temp.getPrev();
            }
            temp.setPrev(newNode);
            newNode.setNext(temp);
            this.head = newNode;
        }
    }

    public void addToEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
            newNode.setPrev(temp);

        }
    }

    public void addFirst(T data) {
        if (isEmpty()) {
            head = new Node<>(data);
        } else {
            Node<T> first = new Node<>(data);
            this.head.setPrev(first);
            first.setNext(head);

        }
    }

    public void addAfter(T data) {
        if (isEmpty()) {
            head = new Node<>(data);
        } else {
            Node<T> after = new Node<>(data);
            this.head.setNext(after);
            after.setPrev(head);
            head = after;

        }
    }

}
