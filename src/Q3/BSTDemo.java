package Q3;

import com.sun.javafx.geom.Matrix3f;
import javafx.scene.transform.MatrixType;

import java.util.ArrayList;

/**
 * COMP 2100/2500/6442 Exam 2016
 * Question 3
 * Author Name: 
 * UID: 
 *
 * BSTDemo 
 */

/* Add your solution here */
public class BSTDemo extends BST{
    int value;
    BST left,right;
    ArrayList<Integer> result;

    BSTDemo(int value){
        this.value = value;
        left = new EBST();
        right = new EBST();
    }

    @Override
    public BST insert(int d) {
        if (d == value) return this;
        else if (d < value){
            if (left.size() == 0){
               return left = new BSTDemo(d);
            } else
                left.insert(d);
        } else {
            if (right.size() == 0){
                return right = new BSTDemo(d);
            } else
                right.insert(d);
        }
        return this;
    }

    @Override
    public int size() {
        return 1 + left.size()+right.size();
    }

    @Override
    public int height() {
        return 1 + Math.max(left.size(),right.size());
    }

    @Override
    public String show() {
        return left.show() + " " + value + " " + right.show();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public BST remove(int d) {
        return null;
    }

    @Override
    public int findCountSum(int targetSum) {//这个答案是错的
        if (targetSum > value)
            return left.findCountSum(targetSum - value) + right.findCountSum(targetSum - value);
        if (targetSum == value)
            return 1 + left.findCountSum(targetSum - value) + right.findCountSum(targetSum - value);
        if (targetSum < value)
            return left.findCountSum(targetSum) + right.findCountSum(targetSum);
        return 0;
    }


}