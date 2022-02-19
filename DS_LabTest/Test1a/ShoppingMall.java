/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1a;

import java.util.LinkedList;

/**
 *
 * @author adina
 */
public class ShoppingMall<E> {
    public static void main(String[] args) {
       
        //Create a linked list for Food Stores
        LinkedList<FoodStore>restaurants=new LinkedList<>();
        
        //McDonalds Food store initializations
        Person mike = new Person("Mike","0101122334");
        Person[]mcdEmployee = {new Person("Jack",null),new Person("Jane",null)};
        LinkedList<Item<String,Integer>>mcdMenu=new LinkedList<>();
        mcdMenu.add(new Item<> ("Burger",10));
        mcdMenu.add(new Item<> ("Fried Chicken",12));
        FoodStore McDonalds=new FoodStore(mcdMenu,"McDonalds",mike,mcdEmployee);
        
        //Sushi Mentai Food store initializations
        Person max = new Person("Max","0112233445");
        Person[]sushiEmployee = {new Person("Adam",null),new Person("Alex",null),new Person("Andrew",null)};
        LinkedList<Item<String,Integer>>sushiMenu=new LinkedList<>();
        sushiMenu.add(new Item<> ("Chicken Katsu Don",15));
        sushiMenu.add(new Item<> ("Ramen",12));
        FoodStore SushiMentai=new FoodStore(sushiMenu,"Sushi Mentai",max,sushiEmployee);
        
        //Waroeng Penyet Food store initializations
        //Same contact person as McDonalds
        Person[]WPEmployee = {new Person("Lex",null),new Person("Leon",null)};
        LinkedList<Item<String,Integer>>WPMenu=new LinkedList<>();
        WPMenu.add(new Item<> ("Ayam Penyet",10));
        FoodStore WaroengPenyet=new FoodStore(WPMenu,"Waroeng Penyet Food",mike,WPEmployee);
        
        //Add all restaurants in FoodStore LinkedList
        restaurants.add(McDonalds);
        restaurants.add(SushiMentai);
        restaurants.add(WaroengPenyet);
        
        //Create a linked list for Fashion Stores
        LinkedList<FashionStore>fashionStores=new LinkedList<>();
        
        //Uniqlo Fashion store initializations
        Person nate = new Person("Nate","0199988776S");
        Person[]uniqloEmployee = {new Person("Kate",null),new Person("Ken",null),new Person("Kurt",null)};
        LinkedList<Item<String,Integer>>uniqloItems=new LinkedList<>();
        uniqloItems.add(new Item<> ("Shirt",80));
        uniqloItems.add(new Item<> ("T-shirt",60));
        FashionStore Uniqlo=new FashionStore(uniqloItems,"Uniqlo",nate,uniqloEmployee);
        
        //Padini Fashion store initializations
        Person nick = new Person("Nick","0199988776S");
        Person[]padiniEmployee = {new Person("Frank",null),new Person("Felix",null)};
        LinkedList<Item<String,Integer>>padiniItems=new LinkedList<>();
        padiniItems.add(new Item<> ("Blouse",100));
        padiniItems.add(new Item<> ("Skirt,",80));
        FashionStore Padini=new FashionStore(padiniItems,"Padini",nick,padiniEmployee);
        
        //Mango Fashion store initializations
        Person nicole = new Person("Nicole","0194433221");
        Person[]mangoEmployee = {new Person("Ron",null),new Person("Jon",null)};
        LinkedList<Item<String,Integer>>mangoItems=new LinkedList<>();
        mangoItems.add(new Item<> ("Dress",120));
        FashionStore Mango=new FashionStore(mangoItems,"Padini",nicole,mangoEmployee);
        
        fashionStores.add(Uniqlo);
        fashionStores.add(Padini);
        fashionStores.add(Mango);
        
        //Print shop details of sushi mentai and mango
        System.out.println(SushiMentai);
        System.out.println(Mango);
        
        //print the food tsore and fashion store with the most employees
        System.out.println("\nFood store with highest number of employees: "+HighestEmployee(restaurants).shopName);
        System.out.println("Fashion store with highest number of employees: "+HighestEmployee(fashionStores).shopName);
        
        //Print if any of the food store is having the same or different contact person. 
        System.out.println();
        for(int i=0;i<restaurants.size();i++){
            for(int j=i+1;j<restaurants.size();j++){
                Person person1 = restaurants.get(i).contactPerson;
                Person person2 = restaurants.get(j).contactPerson;
                if(person1.equals(person2))
                    System.out.println("The contact person for "+restaurants.get(i).shopName+" and "+restaurants.get(j).shopName+" is the same");
                else
                    System.out.println("The contact person for "+restaurants.get(i).shopName+" and "+restaurants.get(j).shopName+" is different");
            }
        }
        
        //Print which food store is having more employees, between Sushi Mentai and Waroeng Penyet.
        System.out.println();
        if(SushiMentai.compareTo(WaroengPenyet)>0)
            System.out.println("Sushi Mentai have more employees than Waroeng Penyet");
        else
            System.out.println("Waroeng Penyet have more employees than Sushi Mentai");
        
        //Print the most expensive item for McDonalds and Padini. 
        System.out.println("\nThe most expensive item in MacDonalds is "+ExpensiveItem(McDonalds).item);
        System.out.println("The most expensive item in Padini is "+ExpensiveItem(Padini).item);
    }
    
    
    //Method to compare the number of employees in food stores and fashion stores
    public static <E extends ShopLot & Comparable<E>> E HighestEmployee(LinkedList<E>stores){
        E shop = stores.getFirst();
        for(E store:stores){
            if(store.compareTo(shop)>0){
                shop=store;
            }
        }
        return shop;
    }
    
    
    //Method to get find out the most expensive item in each store
    public static <E extends ShopLot> Item<String,Integer> ExpensiveItem(E store){
        Item<String,Integer>expensiveItem=null;
        if(store instanceof FoodStore){
            expensiveItem=((FoodStore)store).menu.getFirst();
            for(Item<String,Integer> stuff:((FoodStore)store).menu){
                if(stuff.price>expensiveItem.price){
                    expensiveItem=stuff;
                }   
            }
            
        }else if(store instanceof FashionStore){
            expensiveItem=((FashionStore)store).clothes.getFirst();
            for(Item<String,Integer> baju:((FashionStore)store).clothes){
                if(baju.price>expensiveItem.price){
                    expensiveItem=baju;
                }   
            }
        }
        return expensiveItem;
    }
    
}
