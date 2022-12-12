public class MyDeque<T> {

    private Node<T> head;
    private Node<T> end;
    private int counter;

    public MyDeque() {
//        head = null;
//        end = null;
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public Node<T> getEnd() {
        Node<T> last = getHead();
        if (isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        while (last.getNext() != null) {
            last = last.getNext();
        }

        return last;
    }

    public T getData() {
        return getData();
    }

    public void setNext(Node<T> next) {
        getEnd().setNext(next);
    }


    public T getAndRemoveHead() {
        counter--;
        if (this.isEmpty()) {
            throw new NullPointerException("empty deque");
        }
        Node<T> temp = new Node<T>(getHead().getData());
        if (getHead().getNext() == null) {
            setHead(getEnd());
            return temp.getData();
        }
        setHead(getHead().getNext());
        return temp.getData();

    }


    public T getAndRemoveEnd() {
        counter--;
        Node<T> temp = getEnd();
        if (this.isEmpty())
            throw new NullPointerException("empty deque");
        else {
            Node<T> removeNode = getHead();
            if (removeNode.getNext()==null){
                setHead(null);
               return removeNode.getData();
            }
            while (removeNode.getNext().getNext()!=null){
                removeNode = removeNode.getNext();
            }
            removeNode.setNext(null);
                       return temp.getData();

        }

    }


    public void addToStart(T data) {
        counter++;
        Node<T> newNode = new Node<>(data);
        if (this.isEmpty()) {
            setHead(newNode);
        } else {
            newNode.setNext(getHead());
            setHead(newNode);

        }
    }

    public void add(T data) {
        counter++;
        Node<T> temp = new Node<>(data);
        if (isEmpty()) {
            setHead(temp);
        } else {
            Node<T> check = getHead();
            while (check.getNext() != null) {
                check = check.getNext();
            }
            check.setNext(temp);
        }
    }

    public void addToEnd(T data) {
        counter++;
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            setHead(newNode);
        } else {
            getEnd().setNext(newNode);
            setEnd(newNode);
        }
    }

    public void addFirst(T data) {
        counter++;
        Node<T> temp = new Node<T>(data);
        if (isEmpty()) {
            setHead(temp);
        } else {
            Node<T> first = new Node<>(data);
            temp.setNext(getHead());
            setHead(temp);
        }
    }


    public void setEnd(Node<T> end) {
        this.end = end;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getHead() {
        if (isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        return this.head;
    }

    public Node<T> getNext() {

        return this.getNext();
    }

    public Node<T> getHeadNode() {
        return getHead();
    }


    public String toString() {
        Node<T> temp = getHead();
        String toStr = null;
        while (temp != null) {
            toStr = toStr + " -> " + temp.getData();
            temp = temp.getNext();
        }
        toStr = toStr + " -> null";
        return toStr;
    }

}
