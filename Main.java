public class Main {

    public static void main(String[] args) {
        MyDeque q1 = new MyDeque();//first Deque
        q1.addToEnd(95);
        q1.addToEnd(34);
//        q1.addToEnd(14);
//        q1.addToEnd(16);
//        q1.addToEnd(25);
//        q1.addToEnd(2);


        MyDeque qr = new MyDeque();//creating reverse Deque




        while (!q1.isEmpty()) {
            qr.addToEnd(q1.getAndRemoveEnd());
        }

        System.out.println(qr.getAndRemoveEnd());
        System.out.println(qr.getAndRemoveEnd());



        //---------------------------------------------









    }
}
