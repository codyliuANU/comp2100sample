package Q3;

import org.junit.Test;

/**
 * Created by CodyLiu on 2017/6/7.
 */
public class testTreeDemo {

    public static void main(String[] args) {
        BST bst = new BSTDemo(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(-2);
        bst.insert(4);
        System.out.println("Size: "+bst.size());
        System.out.println("Height: "+bst.height());
        System.out.println("findCountSum: " + bst.findCountSum(12));
        System.out.println("findCountSum: " + bst.findCountSum(7));
        System.out.println("findCountSum: " + bst.findCountSum(-1));
        System.out.println("findCountSum: " + bst.findCountSum(1));
        System.out.println("findCountSum: " + bst.findCountSum(0));
        System.out.println("findCountSum: " + bst.findCountSum(6));

    }
}
