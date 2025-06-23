public class BinaryTesting {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(5);
        tree.add(3);
        tree.add(6);
        tree.add(2);
        tree.add(4);
        tree.add(7);
        // tree.printDFS();
        System.out.println(tree.search(6));
        tree.printSearchPath(4);
        
    }
}
