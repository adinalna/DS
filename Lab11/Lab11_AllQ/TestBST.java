/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11_AllQ;

/**
 *
 * @author adina
 */
public class TestBST {
    public static void main(String[] args) {
        
        Integer[]num={ 45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14};
        BST bst = new BST(num);
        System.out.println("Input Data: 45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14 ");
        System.out.print("Inorder (sorted): ");
        bst.inorder();
        System.out.print("\nPostorder: ");
        bst.postorder();
        System.out.print("\nPreorder: ");
        bst.preorder();
        System.out.println("Height pf BST: "+bst.height());
        System.out.println("Root for BST is: "+bst.getRoot());
        System.out.println("Check whether 10 is in the tree? "+bst.search(45));
        if(bst.delete(53))
            System.out.println("delete "+53);
        else
            System.out.println(53+" is not deleted");
        System.out.print("Updated Inorder (sorted): ");
        bst.inorder();
        System.out.println("Min Value: "+bst.minValue());
        System.out.println("Max Value: "+bst.maxValue());
        System.out.print("A path form the root to 6 is: ");
        java.util.ArrayList<TreeNode<Integer>> path=bst.path(6);
        for (int i = 0; path != null && i < path.size(); i++) {
            System.out.print(path.get(i).element + " ");
        }
        System.out.println("");
    }
}
