public class Testing {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(5);
        list.addNodeEnd(1);
        list.addNodeEnd(2);
        list.addNodeEnd(3);
        list.addNodeEnd(4);
        list.addNodeEnd(5);
        list.addNodeEnd(6);
        list.addNodeStart(7);

        list.printList();

    }
}