public class Test {

    public static void main(String[] args){
        
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

        tree.add(8);

        tree.add(5);
        tree.add(2);
        tree.add(7);
        tree.add(15);
        tree.add(12);
        tree.add(29);

        System.out.println(tree);

        System.out.println(tree.contains(8));
        System.out.println(tree.contains(5));
        System.out.println(tree.contains(29));
        System.out.println(tree.contains(11));

        System.out.println(tree.contains2(8));
        System.out.println(tree.contains2(5));
        System.out.println(tree.contains2(29));
        System.out.println(tree.contains2(11));

        tree.inOrder();
        tree.preOrder();
        tree.postOrder();
    }
}
