/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11_AllQ;

import java.util.ArrayList;

/**
 *
 * @author adina
 * @param <E>
 */
public class BST<E extends Comparable<E>>{
    private int size;
    TreeNode<E> root;
    
    //deafult constructor
    public BST() {
    }
    
    //contsructor to initilise BST with an array
    public BST(E[]array) {
        for(E e:array)  
            insert(e);
    }
    
    //(b) i.Returns true if the element is in the tree
    public boolean search(E e) {
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
    
    //(b)ii.Insert element o into the binary tree and return true if the element 
    //is inserted successfully
    public boolean insert(E e){
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
    
    //(b) iii. Get the number of nodes in the tree
    public int getSize(){
        return size;
    }
    
    //(b) iv. Returns the height of the BST
     public int height() {
        return height(root);
    }

    private int height(TreeNode<E> node) {
        if (node == null) {
            return -1;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }
    
    //(b) iv. Returns the root of the BST
    public E getRoot(){
        return root.element;
    }

    //(b) vii. Returns the minimum value of the BST
      public E minValue() {
        return minValue(root);
    }

    //Function to return least value recursively 
    private E minValue(TreeNode<E> node) {
        if (node.left == null) {
            return node.element;
        }
        return minValue(node.left);
    }
    
    //(b) viii. Returns the minimum value of the BST
     public E maxValue() {
        return maxValue(root);
    }

    //Function to return least value recursively 
    private E maxValue(TreeNode<E> node) {
        if (node.right == null) {
            return node.element;
        }
        return maxValue(node.right);
    }

    
    //(b) viii. Returns a path from the root leading to the specific 
    public java.util.ArrayList<TreeNode<E>>path(E e){
        ArrayList<TreeNode<E>>path=new ArrayList<>();
        TreeNode<E> current = root; // Start from the root
        while (current != null){
            path.add(current);
            if (e.compareTo(current.element)<0) {
                current = current.left;            
            }else if (e.compareTo(current.element)>0) {
                current = current.right; 
            }else 
                break;
            }
        return path;   
    }
    
    //(b) ix. Delete an element from the binary tree. Return true if the
    // element is deleted succesfully, and return false if th element is not
    //in the tree
    public boolean delete(E e) {
        // Locate the node to be deleted and also locate its parent node
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else {
                break; // Element is in the tree pointed at by current
            }
        }

        if (current == null) {
            return false; // Element is not in the tree
        }
        // Case 1: current has no left children
        if (current.left == null) {
            // Connect the parent with the right child of the current node
            if (parent == null) {
                root = current.right;
            } else {
                if (e.compareTo(parent.element) < 0) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else {
            // Case 2: The current node has a left child
            // Locate the rightmost node in the left subtree of
            // the current node and also its parent
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;

            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right; // Keep going to the right
            }

            // Replace the element in current by the element in rightMost
            current.element = rightMost.element;

            // Eliminate rightmost node (rightmost node has no right child)
            if (parentOfRightMost.right == rightMost) {
                parentOfRightMost.right = rightMost.left;
            } else // Special case: parentOfRightMost == current
            {
                parentOfRightMost.left = rightMost.left;
            }
        }

        size--;
        return true; // Element inserted
    }
    
    //(b) x. Remove all elements from the tree
     public void clear() {
        root = null;
        size = 0;
    }
    
     public void inorder() {
        inorder(root);
    }
     
    protected void inorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }
     
     public void postorder() {
        postorder(root);
    }
     
     protected void postorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }

     public void preorder() {
        preorder(root);
    }
     
    protected void preorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }
}
