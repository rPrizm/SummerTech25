public class LinkedList {
    private Node headNode;

    public LinkedList(Node head) {
        headNode = head;
    }
    public LinkedList(int value) {
        headNode = new Node(value);
    }
    
    public Node getLastNode(){ 
        Node current = headNode;
        while (current.getPointer() != null) {
            current = current.getPointer();
        }
        return current;
    }

    public void addNodeEnd(int value) {
        Node last = getLastNode();
        last.setPointer(new Node(value));
    }
    public void addNodeStart(int value) {
        Node newNode = new Node(value, headNode);
        headNode = newNode;
    }
    public void printList() {
        Node current = headNode;
        while (current.getPointer() != null) {
            System.out.print(current.getValue()+", ");
            current = current.getPointer();
        }
        System.out.println(current.getValue());

    }

    
}
