package Collections_4;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager_5 {

    Map<String, Double> groceryList = new HashMap<>();
    Map<String, String> groceryCategory = new HashMap<>();
    Map<String, Integer> groceryQuantity = new HashMap<>();

    public void addItem(String item, double cost, String category, int quantity){
        groceryList.put(item, cost);
        groceryCategory.put(item, category);
        groceryQuantity.put(item, quantity);
    }


    public void removeItem(String item){
        groceryList.remove(item);
        groceryCategory.remove(item);
        groceryQuantity.remove(item);
    }

    public String displayList(){
        StringBuilder result = new StringBuilder();
        int index = 1;

        for (String item: groceryList.keySet()  ){
            result.append(index).append(". ").append(item).append(" x").append(groceryQuantity.get(item)).append("\n");
            index++;
        }

        return result.toString();
    }

    public double calculateTotalCost(){
        double total = 0;
        for(String item: groceryList.keySet()){
            total += groceryList.get(item) * groceryQuantity.get(item);
        }
        return total;
    }

    public String displayByCategory(String category){
        StringBuilder result = new StringBuilder();
        int index =1;

        for(String item: groceryList.keySet()){
            if(groceryCategory.get(item).equalsIgnoreCase(category)){
                result.append(index).append(". ").append(item).append(" - ").append(groceryCategory.get(item)).append("\n");
                index++;
            }

        }
        return result.toString();
    }

    public boolean checkItem(String item){
        return groceryList.containsKey(item);
    }

    public void updateQuantity(String item, int newQuantity){
        if (groceryList.containsKey(item)) {
            groceryQuantity.put(item, newQuantity);

        }else {
            System.out.println(item + "not found in the list");
        }
    }

    public String displayAvailableItems(){
        StringBuilder result = new StringBuilder();
        int index = 1;

        for (String item: groceryList.keySet()  ){
            if(groceryQuantity.get(item) > 0){
                result.append(index)
                        .append(". ").append(item).append(" - $")
                        .append(groceryList.get(item)).append(" x")
                        .append(groceryQuantity.get(item))
                        .append("\n");
                index++;
            }

        }

        return result.toString();
    }


    // Main
    public static void main(String[] args) {
        GroceryListManager_5 manager = new GroceryListManager_5();

        System.out.println("Grocery List:");
        manager.addItem("apple" , 6.00, "Fruits", 3);
        manager.addItem("banana" , 3.00, "Fruits", 5);
        manager.addItem("orange" , 5.00, "Fruits", 5);
        manager.addItem("Milk", 4.00, "Dairy", 0 );
        manager.addItem("Bread" , 2.00, "Bakery", 1);

        System.out.println("full List");
        System.out.println(manager.displayList());

        System.out.println("Items by Categary");
        System.out.println("Dairy: ");
        System.out.println(manager.displayByCategory("Dairy"));
        System.out.println("Fruits");
        System.out.println(manager.displayByCategory("Fruits"));
        System.out.println("Bakery");
        System.out.println(manager.displayByCategory("Bakery"));

        System.out.println("Update Quantity of Bread");
        manager.updateQuantity("Bread", 2);

        System.out.println("After updating quantitydisplay available items:");
        System.out.println(manager.displayAvailableItems());


        System.out.println("Total cost " + manager.calculateTotalCost() + "€");

        //System.out.println("Is \"Bread\" in the grocery list? " + manager.checkItem("Bread"));
        //System.out.println("Removing \"Bread\" from the list...");
        //manager.removeItem("Bread");
        //System.out.println("Updated Grocery List:");
        //System.out.println(manager.displayList());
        //System.out.println("Total cost " + manager.calculateTotalCost() + "€");

    }
}
