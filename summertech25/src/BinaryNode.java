public class BinaryNode {
    private int value;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(int value, BinaryNode left, BinaryNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public BinaryNode(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
    public BinaryNode getLeft() {
        return this.left;
    }
    public BinaryNode getRight() {
        return this.right;
    }
    public void setValue(int value) {
        
        this.value = value;
    }
    public void setLeft(BinaryNode left) {
        this.left = left;
    }
    public void setRight(BinaryNode right) {
        this.right = right;
    }
    public String toString() {
        if (this.left == null && this.right == null) {
            return "Value: "+value+" Left: null Right: null";
        }
        if(this.left == null) {
            return "Value: "+value+" Left: null Right: "+right.getValue();
        }
        if(this.right == null) {
            return "Value: "+value+" Left: "+left.getValue()+" Right: null";
        }
        return "Value: "+value+" Left:"+left.getValue()+" Right: "+right.getValue();
    }

}