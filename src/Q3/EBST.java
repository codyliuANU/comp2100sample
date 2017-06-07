package Q3;

/**
 * Created by CodyLiu on 2017/6/7.
 */
public class EBST extends BST {
    @Override
    public BST insert(int d) {
        return new BSTDemo(d);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int height() {
        return 0;
    }

    @Override
    public String show() {
        return "";
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public BST remove(int d) {
        return null;
    }

    @Override
    public int findCountSum(int targetSum) {
        return 0;
    }
}
