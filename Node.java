public class Node<T> {

    private T data;
    private Node<T> next;
//    private Node<T> prev;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
//        this.prev = prev;

    }

    public Node(T data) {
        this(data, null);
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

//    public void setPrev(Node<T> prev) {
//        this.prev = prev;
//    }

    public Node<T> getNext() {
        return next;
    }

//    public Node<T> getPrev() {
//        return prev;
//    }

    public T getData() {
        return data;
    }



    public Node<T> getNode() {
        return this;
    }

}
