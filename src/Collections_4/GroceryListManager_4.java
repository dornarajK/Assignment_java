package Collections_4;
// Task 3: Categorizing Items
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager_4 {

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
        for(double cost: groceryList.values()){
            total += cost;
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
        GroceryListManager_4 manager = new GroceryListManager_4();

        System.out.println("Grocery List:");
        manager.addItem("apple" , 10.00, "Fruits", 3);
        manager.addItem("banana" , 50.00, "Fruits", 5);
        manager.addItem("orange" , 60.00, "Fruits", 5);
        manager.addItem("Milk", 10.00, "Dairy", 0 );
        manager.addItem("Bread" , 10.00, "Bakery", 1);

        System.out.println(manager.displayList());

        System.out.println(manager.displayByCategory("Dairy"));

        manager.updateQuantity("Bread", 2);
        System.out.println("After updating quantity:");
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
