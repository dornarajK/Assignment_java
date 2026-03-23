package Collections_4.GroceryListManager_1;

import java.util.ArrayList;
import java.util.Arrays;

public class GroceryListManager {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item){
        groceryList.add(item);
    }

    public void removeItem(String item){
        groceryList.remove(item);
    }

    public String displayList(){
        StringBuilder result = new StringBuilder();
        int index = 1;

        for (String item : groceryList){
            result.append(index).append(". ").append(item).append("\n");
            index++;
        }

        return result.toString();
    }



    public boolean checkItem(String item){
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();
        System.out.println("Grocery List:");
        manager.addItem("apple");
        manager.addItem("Milk");
        manager.addItem("Bread");

        System.out.println(manager.displayList());
        //int list =0;
        //for (String i : manager.displayList()){
           // list +=1;
            //System.out.println(list+ ". " + i);

       // }

        System.out.println("Is \"Milk\" in the grocery list? " + manager.checkItem("Milk"));
        System.out.println("Removing \"Milk\" from the list...");
        manager.removeItem("Milk");
        System.out.println("Updated Grocery List:");
        System.out.println(manager.displayList());


    }

}
