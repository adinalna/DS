/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_2_2017;

/**
 *
 * @author adina
 * @param <E>
 */
public class BST<E extends Comparable<E>> {
    private int size;
    TreeNode<E> root;
    
    //deafult constructor
    public BST() {
    }
    
    public boolean add(E e){
        TreeNode<E>parent=root;
        if(root==null)
            root=new TreeNode(e);
        else{
            TreeNode<E>current=root;
            while(current!=null){
                if(e.compareTo(current.element)<0){
                    parent=current;
                    current=current.left;
                
            }else if(e.compareTo(current.element)>0){
                    parent=current;
                    current=current.right;
            }else 
                return false;//the elemant is a duplicate, it cant be inserted 
        }//create a new node and attach it to teh parent node
        if(e.compareTo(parent.element)<0)
            parent.left= new TreeNode(e);
        else
            parent.right= new TreeNode(e);
        size++;
        }
        return true;//element is inserted
    }
    
     public void printTreeInOrder() {
        printTreeInOrder(root);
    }
     
    protected void printTreeInOrder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        printTreeInOrder(root.left);
        System.out.print(root.element + " ");
        printTreeInOrder(root.right);
    }
    
     public boolean contains(E e) {
        TreeNode<E> current = root; // Start from the root
        while (current != null){
        if (e.compareTo(current.element)>0) {
            current = current.left; 
        }
        else if (e.compareTo(current.element)<0) {
            current = current.right; 
         }
        else 
            return true;
        }
        return false;   
    }
}
