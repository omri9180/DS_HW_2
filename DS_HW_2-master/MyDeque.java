public class MyDeque<T> {

    private Node<T> head;
    private Node<T> end;
    private int size;

    public MyDeque() {
        head = null;
        end = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public void addToStart(T data) {
        if(size == 0){
            head = new Node(data);
            end = head;
        }
        else{
            Node temp = new Node(data);
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
        size++;
    }
    public void addToEnd(T data) {
        if(size == 0){
            head = new Node(data);
            end = head;
        }
        else{
            Node temp = new Node(data);
            temp.prev = end;
            end.next = temp;
            end = end.next;
        }
        size++;
    }
    public T getAndRemoveHead() {
        if (size > 0) {
            T temp = head.data;
            head = head.next;

            if (head != null) {
                head.prev = null;
            }

            size--;
            return temp;

        }
        throw new RuntimeException("removeFront called but DoubleDeque is empty");
    }


    public T getAndRemoveEnd() {
        if(size > 0){
            T temp = end.data;
            end = end.prev;
            if(end != null){
                end.next = null;
            }
            size--;
            return temp;
        }

        throw new RuntimeException("removeFront called but DoubleDeque is empty");
    }
    //////////////////////////////// //////////////////////////////// ////////////////////////////////
        public T getEnd() {
        if (isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        return end.getData();
    }
    public T getHead() {
        if (isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        return this.head.getData();
    }
    public Node getHeadNote(){
        if (isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        return this.head;
    }



    public void printMyDeque() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();

        }
    }

}
