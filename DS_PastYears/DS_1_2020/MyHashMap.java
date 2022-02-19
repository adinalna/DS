/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_1_2020;

/**
 *
 * @author adina
 */
public class MyHashMap<K,V> {
    HashNode <K,V> [] map ;

    public MyHashMap() {
       map = new HashNode[20]; 
    }
    
     public V get(K key){     
        int index = key.hashCode()% map.length;
        while(!map[index].getKey().equals(key)){
            if(index == map.length - 1){
                index = 0 ;
            }else{
                index ++;
            }
            if(map[index] == null)
                return null;
        }
        
        return map[index].getValue();
     }
     
     public void put(K key,V value){
        int index = key.hashCode()%map.length;
        while(map[index] != null){
            if(index == map.length - 1){
                index = 0 ;
            }else{
                index ++;
            }
        }
        map[index] = new HashNode(key,value);
    }
}
