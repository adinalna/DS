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
public class Q4 {
    public static void main(String[] args) {
        
        MyHashMap<String,String>myHashMap = new MyHashMap<>();
        
        myHashMap.put("BruceW", "011-899890");
        myHashMap.put("DeanW", "017-2274000");
        myHashMap.put("TonyS", "019-4550800");
        myHashMap.put("LaraC", "014-6402009");
        
        String e1 = myHashMap.get("DeanW");
        System.out.println("Value: " + e1);
        String e2 = myHashMap.get("TonyS");
        System.out.println("Value: " + e2);
        
        myHashMap.put("BruceW","011-5677900");
        String e3 = myHashMap.get("BruceW");
        System.out.println("Value: " + e3);
        
        myHashMap.put("JeanG","019-9001123");
        String e4 = myHashMap.get("JeanG");
        System.out.println("Value: " + e4);
    }
}
