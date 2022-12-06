public class Node<T> {

    private T data;
    private Node<T> next;
    private Node<T> prev;

    public Node(T data, Node<T> next, Node<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;

    }

    public Node(T data) {
        this(data, null, null);
    }
    public void addNext(T nextData){
        Node<T> next = new Node<>(nextData);
        next.prev = (Node<T>) this.data;
    }

    public void addPre(T preData){
        Node<T> pre = new Node<T>(preData);
        pre.next = (Node<T>) this.data;
    }

    public T remove(){
        Node<T> remove = new Node<T>((T) this,this,this);
        T temp = (T) remove.prev;
        if (!isEmpty()){
            while (remove.prev !=null){
                temp = (T) remove.prev;
                if (remove.prev != null){
                    remove = new (this,this,null);
                }
            }
        }


        return temp;
    }

    public boolean isEmpty() {
        if (this.data == null || this.prev == null) {
            return true;
        }
        return false;
    }
}
