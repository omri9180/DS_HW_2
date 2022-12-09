public class MyDeque<T> {

    private Node<T> head;
    private Node<T> end;
    private int counter;

    public MyDeque() {
        head = null;
        end = null;
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public T getEnd() {
        if (isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        return end.getData();
    }

    public T getData(){
        return this.getData();
    }

    public void setNext(Node<T> next){
        this.setNext(next);
    }


    public T getAndRemoveHead() {
        counter--;
        if (this.isEmpty()) {
            throw new NullPointerException("empty deque");
        }
        Node<T> temp = new Node<T>(head.getData());
        if (head.getNext() == null) {
            head = end;
            return temp.getData();
        }
        head = head.getNext();
        head.setPrev(null);
        return temp.getData();

    }


    public T getAndRemoveEnd() {
        counter--;
        if (this.isEmpty())
            throw new NullPointerException("empty deque");
        else {
            Node<T> temp = end;
            if (end == head) {
                end = null;
                head = null;
                return temp.getData();
            }
            end = end.getPrev();
            end.setNext(null);
            return temp.getData();

        }
    }


    public void addToStart(T data) {
        counter++;
        Node<T> newNode = new Node<>(data);
        if (this.isEmpty()) {
            head = newNode;
        } else {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = head.getPrev();
        }
    }

    public T addToEnd(T data) {
        counter++;
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            end = head;
        } else {
            newNode.setPrev(end);
            end.setNext(newNode);
            end = end.getNext();

        }
        return end.getData();
    }

    public void addFirst(T data) {
        counter++;
        if (isEmpty()) {
            Node<T> temp = new Node<T>(data);
            head = temp;
            end = temp;
        } else {
            Node<T> first = new Node<>(data);
            this.head.setPrev(first);
            first.setNext(head);
            head = first;

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

    public void setEnd(Node<T> end) {
        this.end = end;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public T getHead() {
        if (isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        return this.head.getData();
    }

    public T getNext(){
        return this.getNext();
    }

    public Node<T> getHeadNode(){
        return this.head;
    }

    public String toString() {
        Node temp = head;
        String toStr = null;
        while (temp != null) {
            toStr = toStr + " <-> " + temp.getData();
            temp = temp.getNext();
        }
        toStr = toStr + " <-> null";
        return toStr;
    }

}
