public class Node {
    private int value;
    private Node pointer;

    public Node(int value, Node pointer) {
        this.value = value;
        this.pointer = pointer;
    }
    public Node(int value) {
        this.value = value;
        this.pointer = null;
    }
    public int getValue() {
        return this.value;
    }
    public Node getPointer() {
        return this.pointer;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setPointer(Node pointer) {
        this.pointer = pointer;
    }

    
}
