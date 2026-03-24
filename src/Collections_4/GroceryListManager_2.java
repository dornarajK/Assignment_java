package Collections_4;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager_2 {


    Map<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost){
        groceryList.put(item, cost);
    }

    public void removeItem(String item){
        groceryList.remove(item);
    }

    public String displayList(){
        StringBuilder result = new StringBuilder();
        int index = 1;

        for (String item: groceryList.keySet()  ){
            result.append(index).append(". ").append(item).append("\n");
            index++;
        }

        return result.toString();
    }

    public double calculateTotalCost(){
        double total = 0;
        for(double cost: groceryList.values()){
            total += cost;
        }
        return total;
    }



    public boolean checkItem(String item){
        return groceryList.containsKey(item);
    }

    public static void main(String[] args) {
        GroceryListManager_2 manager = new GroceryListManager_2();
        System.out.println("Grocery List:");
        manager.addItem("apple" , 10.00);
        manager.addItem("Milk" , 10.00);
        manager.addItem("Bread" , 10.00);

        System.out.println(manager.displayList());
        System.out.println("Total cost " + manager.calculateTotalCost() + "€");

        System.out.println("Is \"Milk\" in the grocery list? " + manager.checkItem("Milk"));
        System.out.println("Removing \"Milk\" from the list...");
        manager.removeItem("Milk");
        System.out.println("Updated Grocery List:");
        System.out.println(manager.displayList());
        System.out.println("Total cost " + manager.calculateTotalCost() + "€");

    }
}
