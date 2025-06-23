public class BinaryTree {
    private BinaryNode head;
    
    public BinaryTree(int value) {
        head = new BinaryNode(value);
    }
    
    public void add(int value) {
        addHelp(value,this.head);
    }

    private void addHelp(int value, BinaryNode current) {
        if(value < current.getValue()) {
            if(current.getLeft() == null) {
                current.setLeft(new BinaryNode(value));
            }
            else {
                addHelp(value, current.getLeft());
            }
        }
        if(value >= current.getValue()) {
            if(current.getRight() == null) {
                current.setRight(new BinaryNode(value));
            }
            else {
                addHelp(value,current.getRight());
            }
        }
    }
    public void printDFS() {
        printDFSH(head);
    }
    private void printDFSH(BinaryNode current) {
        if (current != null) {
            printDFSH(current.getLeft());
            System.out.println(current.getValue());
            printDFSH(current.getRight());
            
        }
    }
    public BinaryNode search(int value) {
        return searchH(value, head);
    }

    private BinaryNode searchH(int value, BinaryNode current) {
        if (value == current.getValue()) {
            return current;
        }
        if(value < current.getValue()) {
            return searchH(value, current.getLeft());
        }
        if(value > current.getValue()) {
            return searchH(value, current.getRight());
        }
        return null;
    }
    public void printSearchPath(int value) {
        printSearchPathH(value, head);
    }
    private void printSearchPathH(int value, BinaryNode current) {
        if (value == current.getValue()) {
            System.out.println(current.getValue());
            return;
        }
        if(value < current.getValue()) {
            System.out.print(current.getValue()+" -> ");
            printSearchPathH(value, current.getLeft());
        }
        if(value > current.getValue()) {
            System.out.print(current.getValue()+" -> ");
            printSearchPathH(value, current.getRight());
        }
        
    }
}
