/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_2_2019;

/**
 *
 * @author adina
 */
public class Q4b {
    public static void main(String[] args) {
        
        Integer[]num={9,5,3,8,20,12,30};
        BST bst = new BST(num);
        bst.preorder();
        bst.inorder();
        bst.postorder();
    }
}
