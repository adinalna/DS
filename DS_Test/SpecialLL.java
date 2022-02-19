package DS_Test;

import java.util.ArrayList;

public class SpecialLL<E> {
    Node<E> head, tail;
    int size = 0;
     
    public SpecialLL() {}  
      
    public int getSize() {
        return size;
    }

    public void addFirst(E e) {
      Node<E> newNode = new Node<>(e); 
      newNode.next = head; 
      head = newNode; 
      size++; 
      if (tail == null) 
        tail = head;
    }
    
    public void addLast(E e) {
      Node<E> newNode = new Node<>(e); 
      if (tail == null) {
        head = tail = newNode; 
      }
      else {
        tail.next = newNode; 
        tail = tail.next; 
      }
      size++; 
    }
    
    //To print the list
    public void print() {
        Node<E> current = head;
        for(int i=0; i<size; i++) {
            System.out.print(current.element + " ");   
             current=current.next;
        }
        System.out.println();
    }

    //To print the elements in odd numbered nodes 
    public void printOdd() {
        Node<E> current = head;
        for (int i=0; i<size; i++) {
            if ((i + 1)%2 != 0) {
                System.out.print(current.element + " ");
            }
            current = current.next;
        }
    }
    
    //To print the elements in odd numbered nodes 
    public ArrayList<E> getEven() {
        Node<E> current = head;
        ArrayList<E> evenList = new ArrayList<>();
        for (int i=0; i<size; i++) {
            if ((i+1)%2 == 0) {
                evenList.add(current.element);
            }
            current = current.next;
        }
        
        ArrayList<E> evenListReverse = new ArrayList<>();
        //To get evenList in reverse 
        for (int i = evenList.size() - 1; i>=0; i--) {
            evenListReverse.add(evenList.get(i));
        }
        
        return evenListReverse;
    }
    
}
